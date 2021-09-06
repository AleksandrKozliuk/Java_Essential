package homework2.task3;

public class Car {
    private String model;
    private int year;
    private double speed;
    private int wage;
    private String color;

    public Car (){
        this.model="BMW";
        this.year=2020;
        this.wage=1200;
        this.speed=250;
        this.color="white";
    }
   // public Car (String model) {
  //      this(model,2019,150, 1500, "black");
  //  }

    public Car(String model) {
        this.model=model;
        this.year=2020;
        this.wage=1200;
        this.speed=250;
        this.color="white";
    }

    public Car(String model, int year) {
        this.model=model;
        this.year=year;
        this.wage=1200;
        this.speed=250;
        this.color="white";
    }

    public Car(String model, int year,int wage) {
        this.model=model;
        this.year=year;
        this.wage=wage;
        this.speed=250;
        this.color="white";
    }

    public Car(String model, int year,int wage,double speed) {
        this.model=model;
        this.year=year;
        this.wage=wage;
        this.speed=speed;
        this.color="white";
    }

    public Car(String model, int year,int wage,double speed, String color) {
        this.model=model;
        this.year=year;
        this.wage=wage;
        this.speed=speed;
        this.color=color;
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
