package Internship_Java;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int min = 1;
        int max = 100;
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
        s.close();
    }
}
