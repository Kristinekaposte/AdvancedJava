import enums.Gender;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

class User{
    private String fullName;  // private field
    private Date dateOfBirth;
    private Gender gender;
    private Integer id;
//    public User() {
//    }
    protected int generateId(){ // helper method to generate id
        Random random = new Random();
       return random.nextInt(900); // generates random id numbers between 1-899
    }
    public String getFullName(){
        return fullName;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    //creates new user
    public User(String fullName, Date dateOfBirth, Gender gender) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id=generateId();
    }
}












//    public String getUsers() {
//        return this.fullName +
//                this.dateOfBirth +
//                this.gender;
//    }
//
//    @Override
//    public String toString() {
//        return "Full Name:" + this.fullName + " dateOfBirth: " + this.dateOfBirth + " gender: " + this.gender;
//    }
//    @Override
//    public void printAvailableUsers() {
//    }
//
//
//    //SELLER
//    ArrayList<Seller> sellersList = new ArrayList<>();
//    public void addSeller(Seller seller) {
//        this.sellersList.add(seller);
//    }
//
//    //CUSTOMER
//    ArrayList<Customer> customersList = new ArrayList<>();
//    public void addCustomer(Customer customer) {
//        this.customersList.add(customer);
//
//    }







//    public void printAvailableUsers() {
//        if (usersList.isEmpty()) {
//            System.out.println("No users found");
//        }
//        for (User user : this.usersList) {
//            System.out.println(user.getUsers());
//        }
//    }



//    ArrayList<User> usersList = new ArrayList<User>();
//
//    //creates new user
//    public void addUser(User user) {
//        this.usersList.add(user);
//    }