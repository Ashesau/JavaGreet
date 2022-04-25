package Internship_Java;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш пароль:");

        while (true) {
            String correctPassword = sc.nextLine();
            String password = sc.nextLine();
            if (password != correctPassword) {
                System.out.println("Повторите пароль:");
            } else {
                System.out.println("Пароль введен");
                break;
            }
        }
    }
}