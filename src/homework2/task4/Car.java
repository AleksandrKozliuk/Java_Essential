package homework2.task4;

public class Car {
    private String model;
    private int year;
    private double speed;
    private int wage;
    private String color;

    public Car (){
        this.model="BMW";
        this.year=2020;
        this.speed=250;
        this.wage=1200;
        this.color="white";
    }
    // overload constructor with 1 params to constructor with 5 params
    public Car (String model) {
          this(model,2020,250, 1200, "black");
    }
// overload constructor with 2 params to constructor with 4 params
    public Car(String model, int year) {
        this(model,year,250,1200);
    }

    public Car(String model, int year, double speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public Car(String model, int year, double speed, int wage) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.wage = wage;
    }

    public Car(String model, int year, double speed, int wage, String color) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.wage = wage;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                ", wage=" + wage +
                ", color='" + color + '\'' +
                '}';
    }
}
