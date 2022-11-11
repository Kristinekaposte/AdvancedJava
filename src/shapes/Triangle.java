package shapes;

public class Triangle extends ICorneredShape{
private Double base;
private Double height;

    public Triangle (Double base, Double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void getArea() {
        Double triangleArea = (base * height)/2;    // Area of Triangle = ½(b × h)
        System.out.println("Triangle Area is  = " + triangleArea);
    }
}
