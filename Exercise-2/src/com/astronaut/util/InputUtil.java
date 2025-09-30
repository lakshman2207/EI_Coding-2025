package com.astronaut.util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner SC = new Scanner(System.in);

    public static String nextLine(String prompt) {
        System.out.print(prompt);
        return SC.nextLine().trim();
    }
}
