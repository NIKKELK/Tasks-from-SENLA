package Task2;

import java.util.Scanner;

public class Numbers {

    public static void primeFactors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int num = scanner.nextInt();
        int a = 2;
        while (num !=1) {
            if (num % a == 0){
                System.out.println(a + "  ");
                num /= a;
            } else if (a == 2){
                a++;
            } else {
                a += 2;
            }
        }
    }
}