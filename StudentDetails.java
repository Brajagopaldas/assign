// Q8 .. Write a Java program to declare studentName as an instance variable and collegeName as a static variable. Create a method that accepts three subject marks as parameters. Calculate the total marks using a local variable and display the student's complete details.

public class StudentDetails {
    static void studentDetails(String studentName, String collegeName, int mark1, int mark2, int mark3){
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
    }
    public static void main(String[] args){
        studentDetails("Braja Gopal", "Seemanta Engineering College", 95, 99, 89);
    }
}
