/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.math.Axis
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.BlockPos$MutableBlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.Holder$Reference
 *  net.minecraft.core.QuartPos
 *  net.minecraft.core.RegistryAccess
 *  net.minecraft.core.SectionPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.biome.Biome
 *  net.minecraft.world.level.biome.BiomeResolver
 *  net.minecraft.world.level.chunk.ChunkAccess
 *  net.minecraft.world.level.chunk.ChunkStatus
 *  net.minecraft.world.level.levelgen.structure.BoundingBox
 *  net.minecraft.world.phys.Vec3
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 *  software.bernie.geckolib.cache.object.GeoBone
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.datafixers.util.Pair;
import com.mojang.math.Axis;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.QuartPos;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.SectionPos;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.Vec3;
import org.apache.commons.lang3.mutable.MutableInt;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;
import software.bernie.geckolib.cache.object.GeoBone;

public final class MathUtils {
    public static final float TAU = (float)Math.PI * 2;
    public static final float PI = (float)Math.PI;

    public static Pair<Vector3f, PoseStack> getModelPosFromModel(PoseStack matrixStack, GeoBone geoBone) {
        Vector3f vector3f = new Vector3f();
        MathUtils.matrixStackFromModel(vector3f, matrixStack, geoBone);
        return new Pair((Object)vector3f, (Object)matrixStack);
    }

    public static void matrixStackFromModel(Vector3f vector3f, PoseStack matrixStack, GeoBone geoBone) {
        GeoBone parent = geoBone.getParent();
        if (parent != null) {
            MathUtils.matrixStackFromModel(vector3f, matrixStack, parent);
        }
        MathUtils.translateRotateGeckolib(vector3f, geoBone, matrixStack);
    }

    public static void translateRotateGeckolib(Vector3f vector3f, GeoBone bone, PoseStack matrixStackIn) {
        GeoBone parent = bone.getParent();
        if (parent != null) {
            matrixStackIn.m_85837_((double)((-(bone.getPivotX() - parent.getPivotX()) - bone.getPosX()) / 16.0f), (double)((-(bone.getPivotY() - parent.getPivotY()) - bone.getPosY()) / 16.0f), (double)((bone.getPivotZ() - parent.getPivotZ() + bone.getPosZ()) / 16.0f));
        } else {
            matrixStackIn.m_85837_((double)(-(bone.getPivotX() - bone.getPosX()) / 16.0f), (double)(-(bone.getPivotY() + bone.getPosY()) / 16.0f), (double)((bone.getPivotZ() + bone.getPosZ()) / 16.0f));
        }
        if (bone.getRotZ() != 0.0f) {
            matrixStackIn.m_252781_(Axis.f_252403_.m_252961_(bone.getRotZ()));
        }
        if (bone.getRotY() != 0.0f) {
            matrixStackIn.m_252781_(Axis.f_252436_.m_252961_(-bone.getRotY()));
        }
        if (bone.getRotX() != 0.0f) {
            matrixStackIn.m_252781_(Axis.f_252529_.m_252961_(-bone.getRotX()));
        }
        vector3f.add(bone.getRotX(), bone.getRotY(), bone.getRotZ());
    }

    public static Vec3 getWorldPosFromModel(Entity entity, float entityYaw, GeoBone geoBone) {
        PoseStack matrixStack = new PoseStack();
        matrixStack.m_85837_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_());
        matrixStack.m_252781_(MathUtils.quatFromRotationXYZ(0.0f, -entityYaw - 180.0f, 180.0f, true));
        matrixStack.m_85841_(-1.0f, -1.0f, 1.0f);
        matrixStack.m_252880_(0.0f, -1.5f, 0.0f);
        MathUtils.matrixStackFromModel(matrixStack, geoBone);
        PoseStack.Pose matrixEntry = matrixStack.m_85850_();
        Matrix4f matrix4f = matrixEntry.m_252922_();
        Vector4f vec = new Vector4f(0.0f, 0.0f, 0.0f, 1.0f);
        vec.mul((Matrix4fc)matrix4f);
        return new Vec3((double)vec.x(), (double)vec.y() + 1.5, (double)vec.z());
    }

    public static void matrixStackFromModel(PoseStack matrixStack, GeoBone geoBone) {
        GeoBone parent = geoBone.getParent();
        if (parent != null) {
            MathUtils.matrixStackFromModel(matrixStack, parent);
        }
        MathUtils.translateRotateGeckolib(geoBone, matrixStack);
    }

    public static void translateRotateGeckolib(GeoBone bone, PoseStack matrixStackIn) {
        GeoBone parent = bone.getParent();
        if (parent != null) {
            matrixStackIn.m_85837_((double)((bone.getPivotX() - parent.getPivotX() - bone.getPosX()) / 16.0f), (double)((bone.getPivotY() - parent.getPivotY() + bone.getPosY()) / 16.0f), (double)((bone.getPivotZ() - parent.getPivotZ() + bone.getPosZ()) / 16.0f));
        } else {
            matrixStackIn.m_85837_((double)((bone.getPivotX() - bone.getPosX()) / 16.0f), (double)((bone.getPivotY() + bone.getPosY()) / 16.0f), (double)((bone.getPivotZ() + bone.getPosZ()) / 16.0f));
        }
        if (bone.getRotZ() != 0.0f) {
            matrixStackIn.m_252781_(Axis.f_252403_.m_252961_(bone.getRotZ()));
        }
        if (bone.getRotY() != 0.0f) {
            matrixStackIn.m_252781_(Axis.f_252436_.m_252961_(bone.getRotY()));
        }
        if (bone.getRotX() != 0.0f) {
            matrixStackIn.m_252781_(Axis.f_252529_.m_252961_(bone.getRotX()));
        }
        matrixStackIn.m_85841_(bone.getScaleX(), bone.getScaleY(), bone.getScaleZ());
    }

    public static int fill(ServerLevel serverLevel, BlockPos pFrom, BlockPos pTo, Holder.Reference<Biome> pBiome) {
        BlockPos blockpos = MathUtils.quantize(pFrom);
        BlockPos blockpos1 = MathUtils.quantize(pTo);
        BoundingBox boundingbox = BoundingBox.m_162375_((Vec3i)blockpos, (Vec3i)blockpos1);
        ArrayList<ChunkAccess> list = new ArrayList<ChunkAccess>();
        for (int k = SectionPos.m_123171_((int)boundingbox.m_162398_()); k <= SectionPos.m_123171_((int)boundingbox.m_162401_()); ++k) {
            for (int l = SectionPos.m_123171_((int)boundingbox.m_162395_()); l <= SectionPos.m_123171_((int)boundingbox.m_162399_()); ++l) {
                ChunkAccess chunkaccess = serverLevel.m_6522_(l, k, ChunkStatus.f_62326_, false);
                list.add(chunkaccess);
            }
        }
        MutableInt mutableint = new MutableInt(0);
        for (ChunkAccess chunkaccess1 : list) {
            chunkaccess1.m_183442_(MathUtils.makeResolver(mutableint, chunkaccess1, boundingbox, pBiome, biomeHolder -> true), serverLevel.m_7726_().m_214994_().m_224579_());
            chunkaccess1.m_8092_(true);
        }
        serverLevel.m_7726_().f_8325_.m_274524_(list);
        return mutableint.getValue();
    }

    private static BiomeResolver makeResolver(MutableInt pBiomeEntries, ChunkAccess pChunk, BoundingBox pTargetRegion, Holder<Biome> pReplacementBiome, Predicate<Holder<Biome>> pFilter) {
        return (p_262550_, p_262551_, p_262552_, p_262553_) -> {
            int i = QuartPos.m_175402_((int)p_262550_);
            int j = QuartPos.m_175402_((int)p_262551_);
            int k = QuartPos.m_175402_((int)p_262552_);
            Holder holder = pChunk.m_203495_(p_262550_, p_262551_, p_262552_);
            if (pTargetRegion.m_260866_(i, j, k) && pFilter.test(holder)) {
                pBiomeEntries.increment();
                return pReplacementBiome;
            }
            return holder;
        };
    }

    private static BlockPos quantize(BlockPos pPos) {
        return new BlockPos(MathUtils.quantize(pPos.m_123341_()), MathUtils.quantize(pPos.m_123342_()), MathUtils.quantize(pPos.m_123343_()));
    }

    private static int quantize(int pValue) {
        return QuartPos.m_175402_((int)QuartPos.m_175400_((int)pValue));
    }

    public static <T extends Entity> T getClosestEntity(Entity target, List<T> entities) {
        Entity closestEntity = null;
        double closestDistanceSq = Double.MAX_VALUE;
        for (Entity entity : entities) {
            double distanceSq;
            if (entity == target || !((distanceSq = entity.m_20280_(target)) < closestDistanceSq)) continue;
            closestDistanceSq = distanceSq;
            closestEntity = entity;
        }
        return (T)closestEntity;
    }

    public static <T extends Entity> T getClosestEntity(Vec3 target, List<T> entities) {
        Entity closestEntity = null;
        double closestDistanceSq = Double.MAX_VALUE;
        for (Entity entity : entities) {
            double distanceSq = entity.m_20238_(target);
            if (!(distanceSq < closestDistanceSq)) continue;
            closestDistanceSq = distanceSq;
            closestEntity = entity;
        }
        return (T)closestEntity;
    }

    public static Quaternionf quatFromRotationXYZ(float x, float y, float z, boolean degrees) {
        if (degrees) {
            x *= (float)Math.PI / 180;
            y *= (float)Math.PI / 180;
            z *= (float)Math.PI / 180;
        }
        return new Quaternionf().rotationXYZ(x, y, z);
    }

    public static float fade(float i) {
        i = i / 2.0f + 0.5f;
        return (6.0f * i * i * i * i * i - 15.0f * i * i * i * i + 10.0f * i * i * i - 0.5f) * 2.0f;
    }

    public static float easeInQuint(float x) {
        return x * x * x * x * x;
    }

    public static float easeOutBack(float x) {
        float c1 = 1.70158f;
        float c3 = c1 + 1.0f;
        return 1.0f + c3 * (float)Math.pow(x - 1.0f, 3.0) + c1 * (float)Math.pow(x - 1.0f, 2.0);
    }

    public static float easeOutCirc(float x) {
        return (float)Math.sqrt(1.0 - Math.pow(x - 1.0f, 2.0));
    }

    public static float easeInExpo(float x) {
        return (float)(x == 0.0f ? 0.0 : Math.pow(2.0, 10.0f * x - 10.0f));
    }

    public static float easeOutExpo(float x) {
        return (float)(x == 1.0f ? 1.0 : 1.0 - Math.pow(2.0, -10.0f * x));
    }

    public static float easeOutCubic(float x) {
        return (float)(1.0 - Math.pow(1.0f - x, 3.0));
    }

    public static double wrapDegrees(double value) {
        if ((value %= 360.0) >= 180.0) {
            value -= 360.0;
        }
        if (value < -180.0) {
            value += 360.0;
        }
        return value;
    }

    public static boolean isInDemon(LivingEntity livingEntity) {
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        blockpos$mutableblockpos.m_122169_(livingEntity.m_20185_(), livingEntity.m_20186_(), livingEntity.m_20189_());
        Biome biome = (Biome)livingEntity.m_9236_().m_204166_((BlockPos)blockpos$mutableblockpos).m_203334_();
        RegistryAccess access = livingEntity.m_9236_().m_9598_();
        ResourceLocation biomeLocation = access.m_175515_(Registries.f_256952_).m_7981_((Object)biome);
        return biomeLocation.toString().equals("torchesbecomesunlight:demon_biome");
    }

    public static BlockPos getFirstBlockAbove(Level world, BlockPos pos) {
        BlockPos posCurrent = null;
        for (int y = pos.m_123342_() + 1; y < world.m_151558_(); ++y) {
            posCurrent = new BlockPos(pos.m_123341_(), y, pos.m_123343_());
            if (!world.m_8055_(posCurrent).m_60795_() || !world.m_8055_(posCurrent.m_7494_()).m_60795_() || world.m_8055_(posCurrent.m_7495_()).m_60795_()) continue;
            return posCurrent;
        }
        return null;
    }

    public static double randDouble(double lower, double upper) {
        return Math.random() * (upper - lower) + lower;
    }

    public static float randFloat(float lower, float upper) {
        return (float)Math.random() * (upper - lower) + lower;
    }

    public static int randInt(int lower, int upper) {
        return (int)Math.round(Math.random() * (double)(upper - lower) + (double)lower);
    }

    public static Vec3 getFirstBlockAbove(Level world, Vec3 pos, int limit) {
        BlockPos posCurrent = null;
        int y1 = (int)pos.f_82480_;
        int x1 = (int)pos.f_82479_;
        int z1 = (int)pos.f_82481_;
        for (int y = y1 + 1; y < y1 + limit; ++y) {
            posCurrent = new BlockPos(x1, y, z1);
            if (!world.m_8055_(posCurrent).m_60795_() || !world.m_8055_(posCurrent.m_7494_()).m_60795_() || world.m_8055_(posCurrent.m_7495_()).m_60795_()) continue;
            return new Vec3(pos.f_82479_, (double)posCurrent.m_123342_() + 0.5, pos.f_82481_);
        }
        return pos;
    }
}

