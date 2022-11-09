import enums.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Seller extends User {
    private Integer sellerId;
    private Double revenue;
    private Boolean active;

    public List<Computer> availableComputers = Arrays.asList(
            new Computer(24.0),
            new Computer(30.0),
            new Computer(50.0)
    );

    public Integer getSellerId() {
        return sellerId;
    }

    public Seller(String fullName, Date dateOfBirth, Gender gender) {
        super(fullName, dateOfBirth, gender);
        this.sellerId = generateId();
        this.revenue=0.0;
        this.active=true;
    }


}









//    //method to add goods to list
////    public void setListOfGoods(String productName, double price) {
////        this.productName = productName;
////        this.price = price;
////    }
//
//    //return all added goods
//    public void getListOfGoods() {
//    System.out.println("seller id"+sellerId+"Product: " + productName + ", Price: " + price);
//
//    }
//    public double getRevenue(){
//        return this.revenue;
//    }
//
////    public void getRevenue() {
////        this.price = price;
////        this.revenue = revenue;
////        double revenue = price++;
////        System.out.println("Your revenue is: " + revenue);
////    }
//    //marks user as active
//    public void setActive() {
//      this.active=true;
//    }
//   //marks seller as inactive
//    public void setInactive() {
//        this.active=false;
//    }
//    //returns true if seller is active or false if inactive
//    public boolean userStatus() {
//        return this.active;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + " SellersId:" + this.sellerId + ", active status: " +active;
//    }
//
//    @Override
//    public void printAvailableUsers() {
//        if (sellersList.isEmpty()) {
//            System.out.println("No sellers found");
//        }
//
//        for (Seller seller : this.sellersList) {
//            System.out.println(seller.toString());
//        }
//    }




 //   Seller will have sellerId, list of goods(computers, food stuff, clothes, etc) and revenue and active flag