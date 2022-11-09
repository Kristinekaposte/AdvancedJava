import enums.Gender;

import java.util.Date;
import java.util.List;

public class Customer extends User {

    private Integer customerId;
    private Double balance;
    private boolean active;
    List<Seller> sellers;
    public void topUp(Double topUpAmount){ //increases balance for customer
        balance+=topUpAmount;
        //balance=balance+topUpAmount // other way to write
    }
    public void buy(Integer sellerId, Integer computerId){
        Seller relevantSeller= null;
        for(Seller seller: sellers) {
            if (sellerId.equals(seller.getSellerId())){
                relevantSeller = seller;
            }
        }
    Computer relevantComputer = null;

        for(Computer computer: relevantSeller.availableComputers){
            if (computerId.equals(computer.getId())){
                relevantComputer=computer;
            }
        }

        if (relevantComputer.getPrice()>balance){
            System.out.println("Sorry not enough money");
            return;
        }
        if ()
    }
    public Customer(String fullName,
                    Date dateOfBirth,
                    Gender gender,
                    List<Seller> sellers
                    ) {
        super(fullName, dateOfBirth, gender);
        this.customerId = generateId(); // will generate id from parents class
        this.balance=0.0;
        this.active=true;
        this.sellers=sellers;
    }
}










//    @Override
//    public String toString(){
//        return super.toString() +" CustomerId:"+ this.customerId +"Available account balance (Euros)" + this.accountBalanceEuros ;
//    }
//    @Override
//    public void printAvailableUsers() {
//        if (customersList.isEmpty()) {
//            System.out.println("No customers found");
//        }
//
//        for (Customer customer : this.customersList) {
//            System.out.println(customer.toString());
//        }
//    }
//
//    public void setSuspend(boolean inActive ) {
//        this.active = false;
//    }
//    public boolean suspend(){
//        return active;
//    }



// Customer will have customerId, balance, buy method and active flag
