package Task3;


import java.util.Arrays;
import java.util.Scanner;

public class Vowels {

    public void stringWithVowels () {
        Scanner inputStr = new Scanner(System.in);
        System.out.print("Enter a sentence with vowels:");
        String userInputStr = inputStr.nextLine();
        userInputStr = userInputStr.trim();
        userInputStr = userInputStr.toLowerCase();
        String userWords[] = userInputStr.split(" ");

        for (int j = 0; j < userWords.length - 1; j++) {
            for (int i = j + 1; i < userWords.length; i++) {
                if (userWords[i].compareToIgnoreCase(userWords[j]) < 0) {
                    String temp = userWords[j];
                    userWords[j] = userWords[i];
                    userWords[i] = temp;
                }
            }
        }

        for (int i=0; i< userWords.length; i++){
            System.out.print(userWords[i]+ "  ");
        }
        System.out.println();
        System.out.println();


    //    "индексы каждой буквы по словам:"
        String vowel = "аеЄиоуыэю€";

        for (int i = 0; i < userWords.length; i++) {
            for (int j = 0; j < userWords[i].length(); j++) {
                int index = vowel.indexOf(userWords[i].charAt(j));
            }
        }

        int[] count = new int[userWords.length];

        for (int i = 0; i < userWords.length; i++) {
            for (int j = 0; j < userWords[i].length(); j++) {
                int index = vowel.indexOf(userWords[i].charAt(j));
                if (index >= 0) {
                    count[i] = count[i] + 1;
                }
            }
        }

        System.out.println("количество гласных в словах:");
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();

        //—ортировка выбором (Selection sort)
        for (int i = 0; i < count.length - 1; i++) {
            for (int j = i + 1; j < count.length; j++) {
                if (count[i] < count[j]) {

                    int bufer = count[i];
                    count[i] = count[j];
                    count[j] = bufer;

                    String strBufer = userWords[i]; //сортируем слова по тем же критери€м что и числа в массиве count
                    userWords[i] = userWords[j];
                    userWords[j] = strBufer;
                }
            }
        }

        System.out.println();
        System.out.println("отсортированы числа и слова:");
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(userWords));

        System.out.println();
        System.out.println("делаем первую гласную букву в слове заглавной: ");

        int index;
        int[] indexOfFirstVowelsInAWord = new int[userWords.length];
        for (int i = 0; i < userWords.length; i++) {
            for (int j = 0; j < userWords[i].length(); j++) {
                if ("ја≈е®Є»иќо”уџыЁэёюя€".indexOf(userWords[i].charAt(j)) > -1) {
                    index = j;
                    indexOfFirstVowelsInAWord[i] = index;
                    break;
                }
            }
        }

        int[] indexOfFirstVowel = indexOfFirstVowelsInAWord;
        for (int i = 0; i < userWords.length; i++) {
            System.out.print(userWords[i].substring(0, indexOfFirstVowel[i]) +
                    userWords[i].substring(indexOfFirstVowel[i], indexOfFirstVowel[i] + 1).toUpperCase() +
                    userWords[i].substring(indexOfFirstVowel[i] + 1, userWords[i].length()) + " ");
        }
    }
}