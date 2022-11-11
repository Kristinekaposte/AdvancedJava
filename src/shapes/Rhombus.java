package shapes;

public class Rhombus extends ICorneredShape{

    public Rhombus (Double diagonal1, Double diagonal2){
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
    }

    @Override
    public void getArea() {
        Double area = (diagonal1 * diagonal2) / 2;
        System.out.println("Rhombus Area is  = " + area);
    }


}
