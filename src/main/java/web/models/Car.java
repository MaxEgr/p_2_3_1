package web.models;

public class Car {
    private String model;
    private String colore;
    private int age;

    public Car(String model, String colore, int age) {
        this.model = model;
        this.colore = colore;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colore='" + colore + '\'' +
                ", age=" + age +
                '}';
    }
}
