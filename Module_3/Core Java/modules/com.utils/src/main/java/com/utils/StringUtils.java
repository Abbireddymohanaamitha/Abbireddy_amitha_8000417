package com.utils;

/**
 * Utility class exported by com.utils module.
 */
public class StringUtils {
    public static String repeat(String value, int times) {
        return value.repeat(Math.max(0, times));
    }
}
