package shapes;

public class Kite extends ICorneredShape {
    public Kite (Double diagonal1, Double diagonal2){
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
    }

    @Override
    public void getArea() {
        Double area = (diagonal1 * diagonal2) / 2;
        System.out.println("Kite Area is  = " + area);
    }
}
