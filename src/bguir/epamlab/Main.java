package bguir.epamlab;

import Task1.Calculator;
import Task2.CoordinateSystem;

public class Main {

    public static void main(String[] args) {
        double x = 2;
        double y = 3;

        System.out.println("Task 1:");
        System.out.println(Calculator.calculate(x ,y));
        System.out.println("Task 2:");
        System.out.println(CoordinateSystem.isIncludeInArea(x ,y));
    }
}
