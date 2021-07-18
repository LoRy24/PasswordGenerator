package me.lory24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // write your code here
        System.out.println("Welcome to Password generator!");
        while (true) {
            try {
                System.out.print("Size: ");
                Scanner scanner = new Scanner(System.in);
                int size = scanner.nextInt();
                final Password[] passwords = {new Password(PasswordStrength.LOW, size), new Password(PasswordStrength.MEDIUM, size),
                        new Password(PasswordStrength.HIGH, size)};
                for (Password password : passwords) System.out.println("Generated password: " + password.generate());
                break;
            } catch (Exception e) {
                System.out.println("Error while generating passwords! Please, retry!");
            }
        }
    }
}
