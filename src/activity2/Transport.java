package activity2;

import java.util.Random;

public class Transport  {
    private int id;
    private float consumption;
    private float fuelTank;

    protected int generateId(){ // helper method to generate id
        Random random = new Random();
        return random.nextInt(100); // generates random id numbers between 1-99
    }

    public Transport(){

    }
    public Transport(float consumption, float fuelTank){
        this.id=generateId();
        this.consumption=consumption;
        this.fuelTank=fuelTank;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public float getConsumption(){
        return consumption;
    }

    public void setFuelTank(float fuelTank) {
        this.fuelTank = fuelTank;
    }

    public float getFuelTank(){
        return fuelTank;
    }

    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return  "Transport id is : " + id + ", fuel consumption per 100km is : " + consumption+", fuelTank: "+fuelTank;

    }


    public void move(Road road){
      //  float fuelConsumption= (fuelTank/ road.getDistance())*100;
        if ((fuelTank/road.getDistance()==consumption)){
            road.setArrived(true);
        }
        else{
            System.out.println("You have not enough fuel to drive");

        }

       //Then for 100 KM fuel consumption would be (fuel/our km)*100 km=fuel needed,
    }


//    @Override
//    public float getDistance(){
//        return 0;
//    }
}






//Transport ===> id, consumption = 10/100km, fuelTank(1l) | methods ==> getters and setters, toString, move(road)