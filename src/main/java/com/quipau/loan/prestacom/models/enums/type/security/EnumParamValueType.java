package com.quipau.loan.prestacom.models.enums.type.security;

import com.quipau.loan.prestacom.utils.I18n;
import com.quipau.loan.prestacom.utils.caption.EnumCaption;

public enum EnumParamValueType {
    BOOLEAN, TEXT, IMG, NUMERIC, ENUM_TIME_ZONE, DATE;

    @Override
    public String toString() {
        switch (this) {
            case BOOLEAN:
                return I18n.getText(EnumCaption.BOOLEAN);
            case TEXT:
                return I18n.getText(EnumCaption.TEXT);
            case IMG:
                return I18n.getText(EnumCaption.IMG);
            case NUMERIC:
                return I18n.getText(EnumCaption.NUMERIC);
            case ENUM_TIME_ZONE:
                return I18n.getText(EnumCaption.ENUM_TIME_ZONE);
            case DATE:
                return I18n.getText(EnumCaption.DATE);
        }
        return "";
    }
}