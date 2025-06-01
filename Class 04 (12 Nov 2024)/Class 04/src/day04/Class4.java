
package day04;

public class Class4 {

   private String name;
   private int id;
   private static String dept="CSE";
   
   Class4(String name, int id){
       this.name=name;
       this.id=id;
       display();
   }
   
   void display(){
       System.out.println("Name: "+name);
       System.out.println("ID: "+id);
       System.out.println("Department: "+dept);
   }
    
}
