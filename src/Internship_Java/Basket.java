package Internship_Java;

import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Корзина\n" +
                "Введите товар\n" + "Для выхода нажми 0\n");
        String basket = "";

        while (true) {
            String word = scan.nextLine();
            if (!word.equals("0")) {
                basket += word + " ";
                System.out.println(basket);
            }
            else {
                System.out.println("Товар в корзине!");
                break;
            }
        } scan.close();
    }
}
