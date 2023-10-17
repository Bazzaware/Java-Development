package com.bazzaware;

import java.util.UUID;

public class StudentHelper {
    public static void clearConsole() {
        String[] cls = new String[] { "cmd.exe", "/c", "cls" };
        String[] clear = new String[] { "clear" };
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec(cls);
            } else {
                Runtime.getRuntime().exec(clear);
            }
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public boolean ConvertStringToDouble(String mark) {
        try {
            Double number = Double.parseDouble(mark);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
