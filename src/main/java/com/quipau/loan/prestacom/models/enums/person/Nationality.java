package com.quipau.loan.prestacom.models.enums.person;

public enum Nationality {
    DOMINICAN, HAITIAN, PUERTO_RICAN, COLOMBIAN;

    @Override
    public String toString() {
        switch (this) {
            case DOMINICAN:
                return "Dominicano";
            case HAITIAN:
                return "Haitiano";
            case PUERTO_RICAN:
                return "Puertoriqueño";
            case COLOMBIAN:
                return "Colombiano";
        }
        return "";
    }
}
