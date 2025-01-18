package com.mhz;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //MyBankApplication.start();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter a password : ");
            String password = scanner.nextLine();
            try {
                validatePassword(password);
                System.out.println("valid password");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void validatePassword(String password) throws Exception {
        if (password.length() < 8)
            throw new Exception("password length should be more than 8");
        if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*"))
            throw new Exception("password should contain lowercase or uppercase characters");
        if (password.replaceAll("\\D", "").length() < 2)
            throw new Exception("password should contain at least 2 disgits");
    }
}