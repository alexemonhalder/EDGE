public class Student {
    String name;
    int id;
    String dept;

    Student(String name, int id, String dept ){
        this.name=name;
        this.id=id;
        this.dept=dept;
        displayInfo();
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Department: "+dept);
    }
}
