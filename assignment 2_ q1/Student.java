package javaapplication36;
import java.util.*;
public class Student extends person
{
    private String status;
  
    public Student(String name,String address,String phoneNumber,String email,String status)
    {
        super(name,address,phoneNumber,email);
        this.status = status;
      
    }
    public String toString()
    {
      
        return "\nName : "+getName()+ " Address : "+getAddress() +" Phone Number : "+getPhoneNumber()+" Email : "+ getEmail()+" Status :"+status;
    }
    
    }
