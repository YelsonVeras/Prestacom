package com.quipau.loan.prestacom.models.enums.location;

public enum OceanicCountries {
    AUSTRALIA, FEDERATED_STATES_OF_MICRONESIA,
    FIJI, SOLOMON_ISLANDS, KIRIBATI, MARSHALL_ISLANDS,
    NAURU, NIUE, NEW_ZEALAND, PALAU, PAPUA_NEW_GUINEA,
    SAMOA, TONGA, TUVALU;

    public static String getCaption(OceanicCountries countries) {
        switch (countries) {
            case AUSTRALIA:
                return "Australia";
            case FEDERATED_STATES_OF_MICRONESIA:
                return "Federated States Of Micronesia";
            case FIJI:
                return "Fiji";
            case SOLOMON_ISLANDS:
                return "Solomon Islands";
            case KIRIBATI:
                return "Kiribati";
            case MARSHALL_ISLANDS:
                return "Marshall Islands";
            case NAURU:
                return "Nauru";
            case NIUE:
                return "Niue";
            case NEW_ZEALAND:
                return "New Zealand";
            case PALAU:
                return "Palau";
            case PAPUA_NEW_GUINEA:
                return "Papua New Guinea";
            case SAMOA:
                return "Samoa";
            case TONGA:
                return "Tonga";
            case TUVALU:
                return "Tuvalu";
        }
        return "";
    }

    public static String getDescription(OceanicCountries countries) {
        switch (countries) {
            case AUSTRALIA:
                return "";
            case FEDERATED_STATES_OF_MICRONESIA:
                return "";
            case FIJI:
                return "";
            case SOLOMON_ISLANDS:
                return "";
            case KIRIBATI:
                return "";
            case MARSHALL_ISLANDS:
                return "";
            case NAURU:
                return "";
            case NIUE:
                return "";
            case NEW_ZEALAND:
                return "";
            case PALAU:
                return "";
            case PAPUA_NEW_GUINEA:
                return "";
            case SAMOA:
                return "";
            case TONGA:
                return "";
            case TUVALU:
                return "";
        }
        return "";
    }
}