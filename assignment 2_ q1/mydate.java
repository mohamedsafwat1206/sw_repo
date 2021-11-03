package javaapplication36;
import java.util.*;
public class mydate      
{
     private int year;
    private int month;
    private int day;
  
    public mydate(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
   public String toString()
   {
       return " "+day+"/"+month+"/"+year;
   }
   
}
