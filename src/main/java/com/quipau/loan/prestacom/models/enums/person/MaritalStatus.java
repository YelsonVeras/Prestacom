package com.quipau.loan.prestacom.models.enums.person;

public enum MaritalStatus {
    SINGLE, MARRIED, SEPARATED, DIVORCED, WIDOWED;

    @Override
    public String toString() {
        switch (this) {
            case SINGLE:
                return "Soltero";
            case MARRIED:
                return "Casado";
            case SEPARATED:
                return "Separado";
            case DIVORCED:
                return "Divorciado";
            case WIDOWED:
                return "Viudo";
        }
        return "";
    }
}
