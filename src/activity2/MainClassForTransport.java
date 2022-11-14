package activity2;

public class MainClassForTransport {
    public static void main(String[] args) {
     Road road1 =new Road("Latvia", "Uk",200);
     Road road2 =new Road("Uk", "Brazil",300);

     Transport transport = new Transport(10.0f,20.0f);
     Transport transport2 = new Transport(20.0f,20.0f);

        TransportManagement transportManagement = new TransportManagement();
        transportManagement.initSystem(5,5); // just size for transport and road array

        transportManagement.setTransport(transport,0);
        transportManagement.setTransport(transport2,1);
        transportManagement.getAllTransports();


        transportManagement.setRoads(road1,0);
        transportManagement.setRoads(road2,1);
        transportManagement.getAllRoads();




        transport.move(road1);

    }
}
