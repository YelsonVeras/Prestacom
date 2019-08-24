package com.quipau.loan.prestacom.models.enums.person;

public enum Gender {
    MALE, FEMALE;

    @Override
    public String toString() {
        switch (this) {
            case MALE:
                return "Hombre";
            case FEMALE:
                return "Mujer";
        }
        return "";
    }
}
