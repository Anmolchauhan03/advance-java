import java.util.Scanner;

public class grade {
public static void main(String[] args)
   {
      int  score; 
      char grade;   
      Scanner var = new Scanner(System.in);
      System.out.print("Enter your marks : ");
      score = var.nextInt();
      if (score >= 90)
      {
         grade = 'A';
      }
      else if (score >= 80)
      {
         grade = 'B';
      }
      else if (score >= 70)
      {
         grade = 'C';
      }
      else if (score >= 50)
      {
         grade = 'D';
      }
      else
      {
         grade = 'F';
      }
      System.out.println("grade " + grade);
   }
}
