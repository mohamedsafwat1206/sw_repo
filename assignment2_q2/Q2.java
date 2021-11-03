package q2;
public class Q2 
{
    public static void main(String[] args)
    {
       subject sub=new subject(926, "Software enginner", 6);
        address addr=new address(12, "mallwi", "Egypt");
        Student st =new Student("mohamed safwat ",126,3.33,addr,sub);
        
        
        st.printStudentInf();
    }
    
}
