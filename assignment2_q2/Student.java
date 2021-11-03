package q2;
import java.util.*;
public class Student
{
   String studentName;
   private int studentID;
   double studentGPA;
   subject sub;
   address addr;

void setID(int id)
   {
       this.studentID=id;
   }
   
   int getID()
   {
       return studentID;
   }

    public Student(String name,int id,double gpa ,address addr,subject sub)
    {
        this.studentName=name;
        this.studentGPA=gpa;
        this.setID(id);
        this.addr=addr;
        this.sub=sub;
    }
   
  void printStudentInf()
  {
      System.out.println("The Student Name Is "+studentName+"\nThe Student ID Is "+getID()+"\nThe Student GPA Is "+studentGPA);
      System.out.println("\n\nThe Subject Name Is "+sub.subjectName+"\nThe Subject ID Is "+sub.subjectID+"\nThe Subject Hour Is "+sub.subjectHours);
      System.out.println("\n\nThe Address Is "+addr.streetNO+" - "+addr.city+" - "+addr.country);

  }    
}
