package javaapplication36;
import java.util.*;
public class Employee extends person 
{
    private String office;
    private double salary;
    private mydate dateHired;
  
    public Employee(String name,String address,String phoneNumber,String email,String office,double salary,mydate dateHired)
    {
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    public String toString()
    {
        return "\nName : "+getName()+ " Address : "+getAddress() +" Phone Number : "+getPhoneNumber()+" Email : "+ getEmail()+" Office : "+office +" Salary : "+salary + " Hiredate : "+dateHired;
    }
}
