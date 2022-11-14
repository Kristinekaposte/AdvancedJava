package activity2;

public class Road extends Transport{
    private String to;
    private String from;
    private Boolean arrived=false;
    private float distance;

    public Road(){
        this.from=null;
        this.to=null;
        this.distance=0;
    }

    public Road (String from,String to, float distance){
        this.to=to;
        this.from=from;
        this.distance=distance;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getTo() {
        return to;
    }


    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom(){
        return to;
    }


    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getDistance(){
        return distance;
    }


    public void setArrived(Boolean arrived) {
        this.arrived = arrived;
    }

    public Boolean getArrived() {
        return arrived;
    }
@Override
    public String toString() {
            return  "from: " + from + ", to: " + to+", distance: "+distance+", arrived ?: "+arrived;

        }
}




/*
 Road ===> from, to, distance(50km), arrived | methods ==> getters and setters, toString | create constructor to set empty values for all fields
 Transport ===> id, consumption = 10/100km, fuelTank(1l) | methods ==> getters and setters, toString, move(road)

 TransportManagement ===> static Array of transports, roads | methods:
            initSystem(5, 7)
            getTransports, getRoads, setRoad(roadObject, index), setTransport(transportObject, index)


 */

//String from, to,,  (int) distance() // fields
//empty constructor too
//methods--> getters and setters, toString
//_________________________________
//Transport class ==> id,consumption (float, 12.5per 100km),fuelTank() (ammount of fuel we now have).. getters setters, to String
//fuel to check if we have manage that distance  with that fuel.
//__________________________________________________
//TransportManagement--> static array[] of transports, roads / methods
//initSystem () --> amounts of roads,  and transport
//get Transports,getRoads, setRoad(roadObject, index), setTransport(TransportObject, index)




//constructor overload, one who empty and done accepts input