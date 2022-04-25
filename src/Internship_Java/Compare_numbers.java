package Internship_Java;

import java.util.Scanner;

public class Compare_numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int num_1 = scan.nextInt();
        int num_2 = scan.nextInt();
        if (num_1 > num_2) {
            System.out.println(num_1);
        }
        else if (num_1 == num_2) {
            System.out.println("Числа равны");
        }
        else
            System.out.println(num_2);
        scan.close();
    }
}
