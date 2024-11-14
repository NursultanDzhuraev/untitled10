package Car;

import Student.Student;

import java.util.Arrays;

public class AvtoSalon {
    // private long id;
    // private String avtoSalonName;
    private Car[] cars = new Car[0];
    private int size = 0;


    public String addCar(Car newCar) {
        cars = Arrays.copyOf(cars, size + 1);
        cars[size] = newCar;
        size++;
        return "Succesfullty saved student !";
    }

    public Car[] getAllCar() {
        return cars;
    }

    public Car getCartByid(long id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    public String deleteCar(long id) {
        boolean foundCar = false;
        for (int i = 0; i < size; i++) {
            if (cars[i].getId() == id) {
                foundCar = true;
                for (int j = 0; j < size - 1; j++) {
                    cars[j] = cars[j + 1];
                }
                size--;
            }
        }
        cars = Arrays.copyOf(cars, cars.length - 1);
        return foundCar ? "Successfully daleted" : "Car with id" + id + "not found !";
    }

    public String updateCar(long id, Car newCar) {
        for (Car car : cars) {
            if (car.getId() == id) {
                car.setMarka(newCar.getMarka());
                car.setModel(newCar.getModel());
                car.setColor(newCar.getColor());
                car.setPrice(newCar.getPrice());
                car.setYear(newCar.getYear());
                car.setVolume(newCar.getVolume());
                return "Car with id" + id + "successfully updated !";
            }
        }
        return "Car with id" + id + "not found !";
    }
}
