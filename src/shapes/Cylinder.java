package shapes;

public class Cylinder extends IRoundedShape {

    public Cylinder (Double radius, Double height){
        this.radius=radius;
        this.height=height;
    }
    @Override
    public void getArea() {
       Double area = (2*radius*(radius+height))/7; //Surface Area of Cylinder = 2 Π  (r + h)
      //  Double area2 = (2* Math.PI *(radius+height)); // is this correct ?
        System.out.println("area of Cylinder version 1: " +area);
      //  System.out.println("area of Cylinder version 2: " +area2);
    }
}
