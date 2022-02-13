package Task5;

import java.util.Objects;

public class Thing {

    String name;
    int number;
    int volume;
    int price;

    public Thing(String name, int number, int volume, int price) {
        this.name = name;
        this.number = number;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}