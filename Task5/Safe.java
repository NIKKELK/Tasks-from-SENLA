package Task5;

import java.util.Objects;

public class Safe {

    String model;
    int volume;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Safe{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }
}