package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static Task5.ListOfThings.ThingDatabase;

public class Linking {

    private final Safe safe;
    private final List<Thing> things;
    private final Scanner scanner;

    {
        safe = new Safe();
        things = ThingDatabase();
        scanner = new Scanner(System.in);
    }

    public void printItemList() {
        for (Thing item : things) {
            System.out.println(item);
        }
    }

    public List<Thing> sortByPrice() {
        return things.stream()
                .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
                .collect(Collectors.toList());
    }

    public void printSortedListByPrice(List<Thing> sortedListByPrice) {
        sortedListByPrice.forEach(System.out::println);
    }

    public int findMinVolumeFromItemList() {
        return things.stream()
                .sorted((o1, o2) -> o1.getVolume() - o2.getVolume())
                .collect(Collectors.toList()).get(0).getVolume();
    }

    public List<Thing> putItemInTheSafeWithMaxPrice(List<Thing> sortedList, int volume) {
        List<Thing> resultList = new ArrayList<>();
        safe.setVolume(volume);

        for (int i = 0; i < sortedList.size(); i++) {
            int sumVolume = sortedList.get(i).getVolume() * sortedList.get(i).getNumber();
            if (safe.getVolume() >= sumVolume) {
                resultList.add(new Thing(sortedList.get(i).getName(), sortedList.get(i).getNumber(),
                        sortedList.get(i).getVolume(), sortedList.get(i).getPrice()));
                safe.setVolume(safe.getVolume() - sumVolume);
            } else {
                int newNumber = safe.getVolume() / sortedList.get(i).getVolume();
                if (newNumber > 0) {
                    resultList.add(new Thing(sortedList.get(i).getName(), newNumber,
                            sortedList.get(i).getVolume(), sortedList.get(i).getPrice()));
                    break;
                }
            }
        }
        return resultList;
    }

    public void printItemInTheSafeWithMaxPrice(List<Thing> resultList) {
        resultList.forEach(System.out::println);
    }
}