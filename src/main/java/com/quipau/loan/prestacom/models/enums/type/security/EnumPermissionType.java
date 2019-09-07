package com.quipau.loan.prestacom.models.enums.type.security;

import com.quipau.loan.prestacom.utils.I18n;
import com.quipau.loan.prestacom.utils.caption.EnumCaption;

public enum EnumPermissionType {
    NORMAL, ESPECIAL;

    @Override
    public String toString() {
        switch (this) {
            case NORMAL:
                return I18n.getText(EnumCaption.NORMAL);
            case ESPECIAL:
                return I18n.getText(EnumCaption.SPECIAL);
        }
        return "";
    }
}
