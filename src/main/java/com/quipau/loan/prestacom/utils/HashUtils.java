package com.quipau.loan.prestacom.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.nio.file.Files;

public final class HashUtils {

    public static String encodeMD5(String message) {
        return DigestUtils.md5Hex(message);
    }

    public static String encodeMD5(byte[] message) {
        return DigestUtils.md5Hex(message);
    }

    public static String encodeMD5(File file) {
        try {
            return DigestUtils.md5Hex(Files.readAllBytes(file.toPath()));
        } catch (Exception ignored) {

        }
        return "";
    }

    public static String encodeSHA1(String message) {
        return DigestUtils.sha1Hex(message);
    }

    public static String encodeSHA1(byte[] message) {
        return DigestUtils.sha1Hex(message);
    }

    public static String encodeSHA256(String message) {
        return DigestUtils.sha256Hex(message);
    }

    public static String encodeSHA256(byte[] message) {
        return DigestUtils.sha256Hex(message);
    }

    public static String encodeSHA521(String message) {
        return DigestUtils.sha512Hex(message);
    }

    public static String encodesha512(byte[] message) {
        return DigestUtils.sha512Hex(message);
    }

    public static String encodesha512(String message) {
        return DigestUtils.sha512Hex(message);
    }
}
