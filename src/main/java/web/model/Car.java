package web.model;

public class Car {
    private String name;
    private String model;
    private String color;

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
