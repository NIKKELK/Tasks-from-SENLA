package Task5;

import java.util.Scanner;

public class Menu {
    private final String startMessage =
            "\n1. Get a set of items\n" +
                    "2. Sort items by price\n" +
                    "3. Put the items with the maximum price in the safe\n" +
                    "4. Exit\n";

    private final Scanner scanner;
    private final Linking service;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.service = new Linking();
    }

    public void mainMenu() {
        int choice;
        int volume;
        while (true) {
            choice = getAnswerFromMenu(startMessage, 4);
            switch (choice) {
                case 1:
                    service.printItemList();
                    break;
                case 2:
                    service.printSortedListByPrice(service.sortByPrice());
                    break;
                case 3:
                    setAModelOfTheSafe();
                    service.printItemInTheSafeWithMaxPrice(service.putItemInTheSafeWithMaxPrice
                            (service.sortByPrice(), getVolumeFromConsole()));
                    break;
                case 4:
                    return;
            }
        }
    }

    private boolean isNumber1(String str) {
        if (str.isEmpty()) {//  if (str == null || str.isEmpty())
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private void errorMenu(String errorMessage) {
        System.out.println(errorMessage);
        scanner.nextLine();
    }

    private void setAModelOfTheSafe() {
        System.out.println("Input the Safe Model: ");
        String model = scanner.nextLine();
    }

    private int getAnswerFromMenu(String message, int menuSize) {
        String answer;
        int result;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
                if (isNumber1(answer)) {
                    result = Integer.parseInt(answer);
                    if (result <= menuSize && result > 0) {
                        return result;
                    } else {
                        errorMenu("Please input digits from 1 to "
                                + menuSize + "\npress any key to continue");
                    }
                } else {
                    errorMenu("Please input only digits "
                            + "\npress any key to continue");
                }
            }
        }
    }

    private int getVolumeFromConsole() {
        int volumeInt;
        String volumeStr;
        while (true) {
            System.out.println("Input a volume of the safe :");
            volumeStr = scanner.nextLine();
            if (isNumber1(volumeStr)) {
                volumeInt = Integer.parseInt(volumeStr);

                if (volumeInt >= service.findMinVolumeFromItemList() && volumeInt > 0) {
                    return volumeInt;
                } else {
                    errorMenu("Input a volume of the safe more than " +
                            +service.findMinVolumeFromItemList()
                            + "\n press any key to continue");
                }
            } else {
                errorMenu("Please input only digits .\n Input a volume of the safe more than " +
                        +service.findMinVolumeFromItemList()
                        + "\n press any key to continue");
            }
        }
    }
}