package com.n;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int FEE = 30;

    public static void main(String[]args){
        List<Car> cars =new ArrayList<>();
        System.out.println("Welcome to Parking System!");
        int func = 0;
        while(func != 4){
            System.out.println("1) Car enter");
            System.out.println("2) Car leaving");
            System.out.println("1) Car Status");
            System.out.println("1) Car Exit");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            func = Integer.parseInt(s);
            switch (func) {
                case 1:
                    System.out.println("Please enter car ID:");
                    String id = scanner.nextLine();
                    Car c = new Car(id);
                    cars.add(c);
                    break;
                case 3:
                    for (Car car : cars) {
                        System.out.println(car.id + "/" + car.enter + "/" + car.leave);
                    }
                    break;
            }
        }
    }
}
