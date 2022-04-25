package Internship_Java;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите 2 любых числа:");
        int min = s.nextInt();
        int max = s.nextInt();
        boolean isComposite = false;
        String numbers = "";

        for (int checkedNum = min; checkedNum <= max; checkedNum++) {
            for (int i = 2; i < checkedNum; i++) {
                if (checkedNum % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (!isComposite) {
                numbers += checkedNum + ", ";
            }
            isComposite = false;
        }
        System.out.println(numbers);
    }
}
