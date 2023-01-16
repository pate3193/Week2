package student_list;

public class Student_List {
    
    // store and print student details
    
    public static void main(String[] args) {
       
        Student[] list = new Student [3] ;
        
        //create object for 3 students
        
        Student s1 = new Student ();
        
        s1.setName("Henil");
        s1.setAge(20);
        
        Student s2 = new Student ();
        
        s2.setName("wolf");
        s2.setAge(19);
        
        Student s3 = new Student ();
        
        s3.setName("Mf");
        s3.setAge(21);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i =0; i<list.length ; i++)
        {
            System.out.println( list[i].getName() + "  " +list[i].getAge());
            
        }
    }
    
}
