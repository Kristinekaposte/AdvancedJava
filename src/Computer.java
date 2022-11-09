public class Computer {
    private Double price;
    private Integer id;
    public static int counter=0;

    public Double getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }

    public Computer(Double price){
        this.price=price;
        this.id = counter++; // will increse id count for new created computer

    }
}
