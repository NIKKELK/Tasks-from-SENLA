package Task5;

import java.util.ArrayList;
import java.util.List;

public class ListOfThings {

    public static List<Thing> ThingDatabase() {
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Tv",2, 100,1));
        things.add(new Thing("Smartphone", 1, 50,2));
        things.add(new Thing("Gold  ring", 1, 200,3));
        things.add(new Thing("Money", 5, 2000,4));
        things.add(new Thing("Honey", 1, 20,5));
        return things;
    }
}