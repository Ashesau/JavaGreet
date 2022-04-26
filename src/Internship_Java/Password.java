package Internship_Java;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш пароль:");
        String pswr1 = sc.nextLine();

        System.out.println("Повторите свой пароль:");
        String pswr_2 = sc.nextLine();
            if (pswr1.equals(pswr_2)) {
                System.out.println("Пароль успешно сохранен!");
            } else {
                System.out.println("Пароли не совпадают!");
            }
    }
}