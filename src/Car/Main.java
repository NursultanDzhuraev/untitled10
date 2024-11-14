package Car;

import Student.Student;
import Student.StudentCRUD;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static AvtoSalon avtoSalon = new AvtoSalon();
    static Scanner scannerNumber = new Scanner(System.in);
    static Scanner scannerForLine = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showComands();
            String command = scannerForLine.nextLine();
            switch (command.toLowerCase()) {
                case "0", "end" -> {
                    return;
                }
                case "1", "add" -> {
                    Car car = setupCarInfo(new Car());
                    String result = avtoSalon.addCar(car);
                    System.out.println(result);
                }
             //   case "2", "addAll" -> {
           //         System.out.print("Write amount students :");
         //           int amountCar = scannerNumber.nextInt();
       //             Student[] newCarArray = new Student[amountCar];
     //               for (int i = 0; i < newCarArray.length; i++) {
   //                     Car car = setupCarInfo()(new Car());
  //                      newCarArray[i] = car;
   //                 }
   //                 var result = amountCar.add(newCarArray);
   //                 System.out.println(result);
   //             }
                case "3", "getAll" -> {
                    Car[] allCar = avtoSalon.getAllCar();
                    System.out.println(Arrays.toString(allCar));

                }
                case "4", "update" -> {
                    System.out.print("To update student writestudent id :");
                    int carId = scannerNumber.nextInt();
                    Car byIdCar = avtoSalon.getCartByid(carId);
                    if (byIdCar != null) {
                        String result = avtoSalon.updateCar(carId, setupCarInfo(new Car()));
                        System.out.println(result);
                    } else {
                        System.out.println("Student with id :" + carId + "not foud ");
                    }
                }
                case "5", "delete" -> {
                    System.out.println("To delete student write student id : ");
                    int carId = scannerNumber.nextInt();
                    String result = avtoSalon.deleteCar(carId);
                    System.out.println(result);
                }
            }
        }
    }

    private static void showComands() {
        System.out.println("""
                             Commands:
                   Press to 1 or add: Add new Car
                   Press to 3 or getAll: Get All
                   Press to 4 or update: Update car by id
                   Press to 5 or delete: Delete be id
                   Press to 0 or end: End the program
                """);
    }

    public static Car setupCarInfo(Car car) {
        System.out.print("write the car marka : ");
        car.setMarka(scannerForLine.nextLine());

        System.out.print("write the car model : ");
        car.setMarka(scannerForLine.nextLine());

        System.out.print("write the car color : ");
        car.setColor(scannerForLine.nextLine());

        System.out.print("write the car price : ");
        car.setPrice(scannerForLine.nextLine());

        System.out.print("write the car volume : ");
        car.setVolume(scannerForLine.nextLine());

        System.out.print("write the car yers: ");
        car.setYear(scannerNumber.nextInt());


        return car;


    }
}
