package Activity3;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int id;
    private Date dateOfBirth;


// Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    //Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 18) {
            System.out.println(age);
            System.out.println("Underage");
        } else {
            System.out.println(age);

        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
   int dateofB= LocalDate.now().getYear()-getAge();
    int dOB = dateOfBirth.getYear();
if (dateofB==dOB){
    System.out.println("your age is valid");
}
    }
}
