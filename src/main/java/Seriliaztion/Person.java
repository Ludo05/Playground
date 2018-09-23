package Seriliaztion;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstName;
    transient private int age;
    private int DOB;

   public Person(){}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getDOB() {
        return DOB;
    }
}
