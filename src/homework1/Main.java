package homework1;

import homework1.add_task.Address;
import homework1.task2.Rectangle;
import homework1.task4.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*----------ADDITIONAL TASK---------*/
        Address address = new Address();

        address.setIndex(01011);
        address.setCountry(" ,"+"Ukraine");
        address.setCity(" ,"+"Kyiv");
        address.setStreet(" ,"+"Khreschatyk");
        address.setApartment(" ,"+"101");

        System.out.println(address.toString());

        /*----------TASK 2---------*/
        System.out.println("!!! Solution for TASK 2 !!!");
        Rectangle rectangle = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double side1 = in.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double side2 = in.nextDouble();

        rectangle.perimeterCalculator(side1, side2);
        rectangle.areaCalculator(side1, side2);

        rectangle.result();

        /*----------TASK 3---------*/
        System.out.println("!!! Solution fo TASK 3 !!!");

        // create massive computers with type of Computer Class
        Computer[] computers = new Computer[5];

        // initialise massive with  Exemplars of Computer Class
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }
        // set values into variable computerName to massive
        for (int i = 0; i < computers.length; i++) {
            computers[i].computerName = "Name of computer " + i;
        }
        // show result into console
        for (Computer comp : computers) {
            System.out.println(comp.computerName);
        }
    }
}
