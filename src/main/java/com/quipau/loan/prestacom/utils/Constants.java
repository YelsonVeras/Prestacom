package com.quipau.loan.prestacom.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Value;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public final class Constants {

    @Value("${spring.profiles.active}")
    private String profile;
    private static final String HOUR_FORMAT = "HH:mm:ss";
    private static final String DATE_FIND = "yyyy-MM-dd";
    private static final String DATE_HOUR_FIND = DATE_FIND + " " + HOUR_FORMAT;

    public static final String SYSTEM_USER = "System";

    public static final SimpleDateFormat hourFormat = new SimpleDateFormat(HOUR_FORMAT);
    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FIND);
    public static final SimpleDateFormat simpleDateFormatToFind = new SimpleDateFormat(DATE_HOUR_FIND);

    public static final DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

    public static final Gson GSON = new GsonBuilder().setDateFormat(DATE_HOUR_FIND).setPrettyPrinting().create();

    // Spring Security
    public static final String HEADER_AUTHORIZATION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // JWT
    public static final String ISSUER_INFO = "https://www.autentia.com/";
    public static final String SUPER_SECRET_KEY = "1234";
    public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day
}