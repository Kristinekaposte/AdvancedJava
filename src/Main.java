import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
     //   System.out.println("Hello world!");
        LocalDate carManufacturingDate = LocalDate.now();

          SportsCar sportsCar = new SportsCar(carManufacturingDate);
          sportsCar.drive();
          sportsCar.carInfo();
    }
}
//parent class, inheritance
    class Car{
    private LocalDate manufacturingDate;
    public Car (LocalDate manufacturingDate){
        this.manufacturingDate=manufacturingDate;
    }
    void turnOnEngine(){
        System.out.println("engine is running...!");
    }
    public LocalDate getManufacturingDate(){
        return manufacturingDate;
    }
}



    class SportsCar extends Car{ //child class
    private LocalDate manufacturingDate;
    public SportsCar(LocalDate manufacturingDate){ //constructor
        super(manufacturingDate);
    }
    @Override
    void turnOnEngine(){
        System.out.println("Sports car engine is running...!");
}
    public void drive(){
         turnOnEngine();
        System.out.println("im driving");
    }
    public void carInfo(){
        System.out.println("Car was built on: " +this.getManufacturingDate());
    }
}


//