// Q4 .  Write a Java program to create a method named displayStudent() that accepts the student's name, age, and marks as parameters. Display all the values received by the method.

public class Display {
   static void displayStudent(String name, int age, int mark){
   System.out.println("Name: "+ name);
   System.out.println("Age: "+ age);
   System.out.println("Mark: "+ mark);
   }
   public static void main(String[] args){
    displayStudent("Braja", 24, 97);
   }
}
