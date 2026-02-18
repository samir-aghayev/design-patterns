package creationalPatterns.prototype;

import java.util.ArrayList;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int maxSpeed;
    private ArrayList<String> parts;

    public Car() {
        parts = new ArrayList<>();
    }

    public Car(Car target) {
        if (target != null) {
            this.model = target.model;
            this.color = target.color;
            this.maxSpeed = target.maxSpeed;
            this.parts = new ArrayList<>(target.parts);
        }
    }

    @Override
    public Car clone(){
        return new Car(this);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public ArrayList<String> getParts() {
        return parts;
    }

    public void setParts(ArrayList<String> parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", color='" + color + '\'' + ", maxSpeed=" + maxSpeed + ", parts=" + parts + '}';
    }
}