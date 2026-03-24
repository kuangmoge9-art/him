/*
 * Decompiled with CFR 0.152.
 */
package net.mcreator.ultimateskeletons;

public class NumberUtils {
    public static String getNumberUnit(double number) {
        if (number >= 100.0 && number < 1000.0) {
            return " Hundred";
        }
        if (number >= 1000.0 && number < 1000000.0) {
            return " Thousand";
        }
        if (number >= 1000000.0 && number < 1.0E8) {
            return " Million";
        }
        if (number >= 1.0E9 && number < 1.0E12) {
            return " Billion";
        }
        if (number >= 1.0E12 && number < 1.0E15) {
            return " Trillion";
        }
        if (number >= 1.0E15 && number < 1.0E18) {
            return " Quadrillion";
        }
        if (number >= 1.0E18 && number < 1.0E21) {
            return " Quintillion";
        }
        if (number >= 1.0E21 && number < 1.0E24) {
            return " Sextillion";
        }
        if (number >= 1.0E24 && number < 1.0E27) {
            return " Septillion";
        }
        if (number >= 1.0E27 && number < 1.0E30) {
            return " Octillion";
        }
        if (number >= 1.0E30 && number < 1.0E33) {
            return " Nonillion";
        }
        if (number >= 1.0E33 && number < 1.0E36) {
            return " Decillion";
        }
        if (number >= 1.0E36 && number < 1.0E39) {
            return " Undecillion";
        }
        if (number >= 1.0E39 && number < 1.0E42) {
            return " Duodecillion";
        }
        if (number >= 1.0E42 && number < 1.0E45) {
            return " Tredecillion";
        }
        if (number >= 1.0E45 && number < 1.0E48) {
            return " Quattuordecillion";
        }
        if (number >= 1.0E48 && number < 1.0E51) {
            return " Quindecillion";
        }
        if (number >= 1.0E51 && number < 1.0E54) {
            return " Sexdecillion";
        }
        if (number >= 1.0E54 && number < 1.0E57) {
            return " Septendecillion";
        }
        if (number >= 1.0E57 && number < 1.0E60) {
            return " Octodecillion";
        }
        if (number >= 1.0E60 && number < 1.0E63) {
            return " Novemdecillion";
        }
        if (number >= 1.0E63 && number < 1.0E66) {
            return " Vigintillion";
        }
        if (number == 0.0) {
            return "";
        }
        return " Dozen";
    }

    public static double getUnitNum(String unit) {
        switch (unit) {
            case "Hundred": {
                return 100.0;
            }
            case "Thousand": {
                return 1000.0;
            }
            case "Million": {
                return 1000000.0;
            }
            case "Billion": {
                return 1.0E9;
            }
            case "Trillion": {
                return 1.0E12;
            }
            case "Quadrillion": {
                return 1.0E15;
            }
            case "Quintillion": {
                return 1.0E18;
            }
            case "Sextillion": {
                return 1.0E21;
            }
            case "Septillion": {
                return 1.0E24;
            }
            case "Octillion": {
                return 1.0E27;
            }
            case "Nonillion": {
                return 1.0E30;
            }
            case "Decillion": {
                return 1.0E33;
            }
            case "Undecillion": {
                return 1.0E36;
            }
            case "Duodecillion": {
                return 1.0E39;
            }
            case "Tredecillion": {
                return 1.0E42;
            }
            case "Quattuordecillion": {
                return 1.0E45;
            }
            case "Quindecillion": {
                return 1.0E48;
            }
            case "Sexdecillion": {
                return 1.0E51;
            }
            case "Septendecillion": {
                return 1.0E54;
            }
            case "Octodecillion": {
                return 1.0E57;
            }
            case "Novemdecillion": {
                return 1.0E60;
            }
            case "Vigintillion": {
                return 1.0E63;
            }
        }
        return 10.0;
    }

    public static double getNumber(double number) {
        if (number >= 100.0 && number < 1000.0) {
            return 100.0;
        }
        if (number >= 1000.0 && number < 1000000.0) {
            return 1000.0;
        }
        if (number >= 1000000.0 && number < 1.0E9) {
            return 1000000.0;
        }
        if (number >= 1.0E9 && number < 1.0E12) {
            return 1.0E9;
        }
        if (number >= 1.0E12 && number < 1.0E15) {
            return 1.0E12;
        }
        if (number >= 1.0E15 && number < 1.0E18) {
            return 1.0E15;
        }
        if (number >= 1.0E18 && number < 1.0E21) {
            return 1.0E18;
        }
        if (number >= 1.0E21 && number < 1.0E24) {
            return 1.0E21;
        }
        if (number >= 1.0E24 && number < 1.0E27) {
            return 1.0E24;
        }
        if (number >= 1.0E27 && number < 1.0E30) {
            return 1.0E27;
        }
        if (number >= 1.0E30 && number < 1.0E33) {
            return 1.0E30;
        }
        if (number >= 1.0E33 && number < 1.0E36) {
            return 1.0E33;
        }
        if (number >= 1.0E36 && number < 1.0E39) {
            return 1.0E36;
        }
        if (number >= 1.0E39 && number < 1.0E42) {
            return 1.0E39;
        }
        if (number >= 1.0E42 && number < 1.0E45) {
            return 1.0E42;
        }
        if (number >= 1.0E45 && number < 1.0E48) {
            return 1.0E45;
        }
        if (number >= 1.0E48 && number < 1.0E51) {
            return 1.0E48;
        }
        if (number >= 1.0E51 && number < 1.0E54) {
            return 1.0E51;
        }
        if (number >= 1.0E54 && number < 1.0E57) {
            return 1.0E54;
        }
        if (number >= 1.0E57 && number < 1.0E60) {
            return 1.0E57;
        }
        if (number >= 1.0E60 && number < 1.0E63) {
            return 1.0E60;
        }
        if (number >= 1.0E63 && number < 1.0E66) {
            return 1.0E63;
        }
        return 10.0;
    }
}

