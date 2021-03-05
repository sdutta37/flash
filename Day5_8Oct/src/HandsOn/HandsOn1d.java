package HandsOn;
import java.util.Scanner;
public class HandsOn1d {


		public static class StudentData{
			   int age;
			   String name;
			   public StudentData(String name, int age){
			      this.age = age;
			      this.name = name;
			   }
			   public void display() {
			      System.out.println("Name of the student is: "+name);
			      System.out.println("Age of the student is: "+age);
			   }
			   public static void main (String args[]){
			      Scanner sc = new Scanner(System.in);
			      System.out.println("Enter your name: ");
			      String name = sc.next();
			      System.out.println("Enter your age: ");
			      int age = sc.nextInt();
			      StudentData obj = new StudentData(name, age);
			      obj.display();
			   }
			}
	}


