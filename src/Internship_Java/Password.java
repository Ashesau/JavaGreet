package Internship_Java;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int password;
            do{
                System.out.println("Введите пароль");
                password = sc.nextInt();
                if (password!=12345) {
                    System.out.println("Пароль не верен!");
                }

                if (password==12345) {
                    System.out.println("Вы ввели верный пароль!");
                }
            } while (password!=12345);
        }
    }
