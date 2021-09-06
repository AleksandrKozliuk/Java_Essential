package homework2.task3;

public class Main {
    public static void main(String[] args) {

        //default car construction
        Car car1 = new Car();
        //overload car construction 1
        Car car2 = new Car("Mercedes-Benz");
        //overload car construction 2
        Car car3 = new Car("Opel",2020);
        //overload car construction 3
        Car car4 = new Car("Skoda",2008,1100);
        //overload car construction 4
        Car car5 = new Car("Mitsubisi",2020,1600,220);
        //overload car construction 5
        Car car6 = new Car("Audi",2021,2000,330,"green");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);


    }
}
