
package studentlist;

import java.util.Scanner;

/**
 *This class generates students list
 * @author Megha Patel
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Student[] students=new Student[2];
        
        for(int i=0;i<students.length;i++)
        {
            System.out.println("Enter student name: ");
            String name=sc.nextLine();
            
            Student student=new Student(name);
            students[i]=student;
        
        }
        
        System.out.println("Student List:");
        //enhanced for loop
//        for(data-type variable : array | collection)
//          {
//           // Code to be executed
//          }  

        for(Student s:students)
        {
            System.out.println(s.getName());
        }
        
       
        
    }

}
