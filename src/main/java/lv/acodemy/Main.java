package lv.acodemy;

import lv.acodemy.classroom.Car;
import lv.acodemy.classroom.Cat;

public class Main {
    public static void main(String[] args) {

        // how to create object
        Car myFirstCar = new Car();
        System.out.println(myFirstCar);
        // set car brand
        myFirstCar.setCarBrand("Audi");
        myFirstCar.getCarBrand();
// set all other fields
        myFirstCar.setCarModel("A4");
        myFirstCar.setProductionYear(2024);
        myFirstCar.setMileage(16);
        myFirstCar.setColor("Racing green");
        // Create a new object car, set all fields and print object out

        Car mySecondCar = new Car();
        mySecondCar.setCarBrand("Vw");
        mySecondCar.setCarModel("Passat");
        mySecondCar.setProductionYear(2007);
        mySecondCar.setMileage(270000);
        mySecondCar.setColor("Silver");
        System.out.println(mySecondCar);


        Car myBmwCar = new Car("BMW", "X5", 2020, 130_000, "Black");
        System.out.println(myBmwCar);

        Car mySkoda = new Car.CarBuilder()
                .setCarBrand("Skoda")
                .setModel("Ocatavia")
                .setProductionYear(2022)
                .setmiliage(6)
                .setColor(" Electric yellow")
                .build();
        System.out.println(mySkoda);
        mySkoda.start();
        mySkoda.stop();
        mySkoda.drive(1_000);
        Cat barsik = new Cat("Barsik", "Male", 2, "Maincoon");
        System.out.println(barsik);
        barsik.setAge(6);
        barsik.sleep();
        barsik.walk();

    }


}