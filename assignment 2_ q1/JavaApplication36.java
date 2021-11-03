package javaapplication36;
public class JavaApplication36
{

 
    public static void main(String[] args)
    {
     Student s = new Student("mohamed safwat","Minya , mallawi","01010152017","mohamed safwat1206@gmail.com","under graduate ");
      
       System.out.println(s.toString());
      
       mydate d = new mydate(6,12,2001);
      
       Employee e = new Employee("mohamed","Cairo, king faisel street","0100305670","mohamed_s@email.com"," the 90th street fifth steltment",5000.60,d);
      
       System.out.println(e.toString());
    }
    
}
