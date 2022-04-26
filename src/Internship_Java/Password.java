package Internship_Java;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш пароль:");
        String pswr1 = sc.nextLine();
        boolean correctPass = true;

        while (correctPass == true) {
            System.out.println("Повторите свой пароль:");
            String pswr2 = sc.nextLine();
            if (pswr1.equals(pswr2)) {
                System.out.println("Пароль успешно сохранен!");
                correctPass = false;
            }
        }
    }
}