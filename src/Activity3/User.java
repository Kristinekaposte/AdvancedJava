package Activity3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int id;
    private LocalDate dateOfBirth;


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

    public LocalDate getDateOfBirth() {
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
           // System.out.println(age);
            System.out.println(toString());
            System.out.println("You are underage");
        } else {
            System.out.println(toString());

        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        LocalDate currentDate = LocalDate.now();

        long years = ChronoUnit.YEARS.between(dateOfBirth, currentDate); // gets how old is user
        long dateofB= years-getAge(); // should return 0 if age - getAge is 0;
     //   System.out.println(dateofB);

        if (dateofB==0){
            System.out.println("your age is valid and matches birthday");
        }
        else {
            System.out.println("birthday does not match ur age");
        }
    }

    @Override
    public String toString() {
        return "Name " +this.firstName+", age: "+this.age;
    }
}
