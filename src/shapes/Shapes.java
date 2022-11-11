package shapes;

public class Shapes {
    public static void main (String [] args){

        Square mySquare= new Square(5.0);
        mySquare.getArea();

        Rectangle myRectangle = new Rectangle(7.0,3.5);
        myRectangle.getArea();
//
       Triangle myTriangle = new Triangle(2.0,5.0);
       myTriangle.getArea();

       Circle myCircle = new Circle(5.0);
       myCircle.getArea();

       Kite myKite = new Kite(2.0,2.0);
       myKite.getArea();

       Cylinder myCylinder = new Cylinder( 2.0,2.0); // formula check ??
       myCylinder.getArea();

       Rhombus myRhombus = new Rhombus(2.0,2.0);
       myRhombus.getArea();

    }
}



