//Q1.   Write a Java program to declare name, rollNo, and marks as instance variables inside a Student class. Assign suitable values to the variables and display the student's name, roll number, and marks.

public class Student {
    String name = "Braja";
    int rollNo = 136;
    int mark = 98;
    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.rollNo);
        System.out.println(s.mark);
    }   
}
