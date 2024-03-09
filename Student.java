public class Student {   
    int id;  
    String name;  
      
    Student(){  
    System.out.println("constructor overloading");  
    }  
      
    Student(int i, String n){  
    id = i;  
    name = n;  
    }  
      
    public static void main(String[] args) {     
    Student student = new Student(213022, "Anmol Rajput");  
    System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
    }  
    }  
  