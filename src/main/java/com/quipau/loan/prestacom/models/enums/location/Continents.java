package com.quipau.loan.prestacom.models.enums.location;

public enum Continents {
    AMERICAN, ASIAN, EUROPEAN, AFRICAN, OCEANIC;

    public static String getCaption(Continents continent) {
        switch (continent) {
            case AMERICAN:
                return "American";
            case ASIAN:
                return "Asian";
            case EUROPEAN:
                return "European";
            case AFRICAN:
                return "African";
            case OCEANIC:
                return "Oceanic";
        }
        return "";
    }

    public static String getDescription(Continents continent) {
        switch (continent) {
            case AMERICAN:
                return "";
            case ASIAN:
                return "";
            case EUROPEAN:
                return "";
            case AFRICAN:
                return "";
            case OCEANIC:
                return "";
        }
        return "";
    }
}
