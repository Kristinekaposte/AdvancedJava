package activity2;

public class TransportManagement extends  Transport{

    private Road road;
    private Transport transport;
    public static Transport[] allTransports;
    public static Road[] allRoads;

    public TransportManagement(){

    }

    public void initSystem(int numberOfRoads, int numberOfTransports) {
        allTransports = new Transport[numberOfTransports];
        allRoads = new Road[numberOfRoads];
    }

    public void getAllTransports() {
        for (int i = 0; i > allTransports.length; i++){
            System.out.println("all transports" + allTransports[i]);
        }
    }

    public void getAllRoads(){
        for (int i = 0; i < allRoads.length; i++){
            System.out.println( allRoads[i].toString());
        }
    }

    public void setRoads(Road road, int index){
        allRoads[index]=road;
    }

    public void setTransport(Transport transport, int index){
       allTransports[index]=transport;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    }



/*TransportManagement ===> static Array of transports, roads | methods:
        initSystem(5, 7)
        getTransports, getRoads, setRoad(roadObject, index), setTransport(transportObject, index)
*/
