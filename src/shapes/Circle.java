package shapes;

public class Circle extends IRoundedShape{

    public Circle (double radius) {
        this.radius = radius;
    }
    @Override
    public void getArea (){

        double circleArea = Math.PI * radius * radius;
        System.out.println("Circle area is  = " + circleArea);
    }

}
