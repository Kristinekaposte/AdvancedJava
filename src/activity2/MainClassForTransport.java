package activity2;

public class MainClassForTransport {
    public static void main(String[] args) {
     Road road1 =new Road("Latvia", "Uk",50);

     Transport transport = new Transport(5.0f,20.0f);
     Transport transport2 = new Transport(20.0f,20.0f);

        TransportManagement transportManagement = new TransportManagement();

        transportManagement.initSystem(1,2); // just size
        transportManagement.setRoads(road1,0);
        transportManagement.getAllRoads();
    }
}
