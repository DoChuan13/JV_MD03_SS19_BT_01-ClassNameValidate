package app.config;

import java.util.regex.Pattern;

public class ClassValidate {
    private static final String CLASS_REGEX = "[ACP]{1}[\\d]{4}[GHIKLM]{1}";

    public static boolean validateClassName(String name) {
        return Pattern.matches(CLASS_REGEX, name);
    }
}
