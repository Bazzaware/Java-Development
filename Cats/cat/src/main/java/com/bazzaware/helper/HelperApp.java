package com.bazzaware.helper;

public class HelperApp {
    public final static void clearConsole() {
        String[] cls = new String[] { "cmd.exe", "/c", "cls" };
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec(cls);
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
