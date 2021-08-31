package homework1;

import homework1.add_task.Address;
import homework1.task2.Rectangle;
import homework1.task4.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*----------ADDITIONAL TASK---------*/
        Address address = new Address();

        /*----------TASK 2---------*/
        Rectangle rectangle = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double side1 = in.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double side2 = in.nextDouble();

        rectangle.perimeterCalculator(side1,side2);
        rectangle.areaCalculator(side1,side2);

        rectangle.result();

        /*----------TASK 3---------*/
        Computer computer = new Computer();
    }
}
