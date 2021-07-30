package com.rilixtech.materialfancybutton.utils;

/**
 * Utility class that contains helper methods for {@code String} manipulation.
 */
public class TextUtils {
    private TextUtils() {}

    /**
     * Returns true if the string is null or 0-length.
     *
     * @param string - the string to be examined
     * @return true if the string is null or 0-length
     */
    public static boolean isEmpty(String string) {
        if (string == null) {
            return true;
        }
        return string.isEmpty();
    }
}
