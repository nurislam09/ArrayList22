package HomeWork20;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.drive();
            throw new  IOException();
        }
        catch (IOException e){
            car.close();

        }
    }
}
