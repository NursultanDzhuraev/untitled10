package Car;

import java.time.LocalDate;

public class Car {
    private long id;
    private String marka;
    private String model;
    private String color;
    private String price;
    private int year;
    private String volume;

    public Car() {
    }

    public Car(String marka, String model, String color, String price, int year, String volume) {
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.volume = volume;
    }
        public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", year=" + year +
                ", volume='" + volume + '\'' +
                '}';
    }
}
