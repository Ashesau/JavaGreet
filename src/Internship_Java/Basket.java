package Internship_Java;

import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Корзина");
        String basket = "";

        while (true) {
            String word = scan.nextLine();
            if (!word.equals("exit")) {
                basket += word + " ";
                System.out.println(basket);
            }
            else {
                System.out.println(basket);
                break;
            }
        }
    }
}
