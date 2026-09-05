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