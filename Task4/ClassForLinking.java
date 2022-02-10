package Task4;

import java.util.Scanner;

public class ClassForLinking {

    public void mainMethod() {

        BigDigits dataBaseBigDigits = new BigDigits();
        SmallDigits dataBaseSmallStarDigits = new SmallDigits();
        
        // Создаём объект scanner, который будет считывать данные с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");

        String input = scanner.next();
        //Преобразовываем считанную строку в массив символов
        char[] array_of_Ch = input.toCharArray();
        
        for (int i = 0; i < array_of_Ch.length; i++) {
            if (Character.isDigit(array_of_Ch[i])) {
            char userCh1 = array_of_Ch[i];
            }
        }
        
        //Создаём массив для хранения и обработки каждой цифры, входящей в состав введённого числа:
        int[] userDigit = new int[array_of_Ch.length];
        for (int i = 0; i < array_of_Ch.length; i++) {
            userDigit[i] = Character.getNumericValue(array_of_Ch[i]);
        }

        System.out.println("You entered the following number:");
        for (int i = 0; i < userDigit.length; i++) {
            System.out.print(userDigit[i] + " ");
        }
        System.out.println();

        int max = userDigit [0];
        for (int i = 0; i<userDigit.length; i++){
            if (userDigit[i] > max) max = userDigit[i];
        }

        
        
        
        
        
        
        System.out.println("Entered number in the required format");
        for (int i=0; i< userDigit.length; i++){
            if (userDigit[i] == 0){
                dataBaseSmallStarDigits.createSmallDigit0();
                System.out.println();
            }else if (userDigit[i] == 1){
                dataBaseSmallStarDigits.createSmallDigit1();
                System.out.println();
            }else if (userDigit[i] == 2){
                dataBaseSmallStarDigits.createSmallDigit2();
                System.out.println();
            }else if (userDigit[i] == 3){
                dataBaseSmallStarDigits.createSmallDigit3();
                System.out.println();
            }else if (userDigit[i] == 4){
                dataBaseSmallStarDigits.createSmallDigit4();
                System.out.println();
            }else if (userDigit[i] == 5){
                dataBaseSmallStarDigits.createSmallDigit5();
                System.out.println();
            }else if (userDigit[i] == 6){
                dataBaseSmallStarDigits.createSmallDigit6();
                System.out.println();
            }else if (userDigit[i] == 7){
                dataBaseSmallStarDigits.createSmallDigit7();
                System.out.println();
            }else if (userDigit[i] == 8){
                dataBaseSmallStarDigits.createSmallDigit8();
                System.out.println();
            }else if (userDigit[i] == 9){
                dataBaseSmallStarDigits.createSmallDigit9();
                System.out.println();
            }
        }

        
        
        
        System.out.println("Largest digit made up of digits: " + max);
        if (max == 0) {
            dataBaseBigDigits.createDigit0();
            System.out.println();
        }else if (max == 1) {
            dataBaseBigDigits.createDigit1();
            System.out.println();
        }else if (max == 2) {
            dataBaseBigDigits.createDigit2();
            System.out.println();
        }else if (max == 3) {
            dataBaseBigDigits.createDigit3();
            System.out.println();
        }else if (max == 4) {
            dataBaseBigDigits.createDigit4();
            System.out.println();
        }else if (max == 5) {
            dataBaseBigDigits.createDigit5();
            System.out.println();
        }else if (max == 6) {
            dataBaseBigDigits.createDigit6();
            System.out.println();
        }else if (max == 7) {
            dataBaseBigDigits.createDigit7();
            System.out.println();
        }else if (max == 8) {
            dataBaseBigDigits.createDigit8();
            System.out.println();
        }else if (max == 9) {
            dataBaseBigDigits.createDigit9();
            System.out.println();
        }
    }
}