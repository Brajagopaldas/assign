// Q10. Write a Java program to declare studentName and rollNo as instance variables and collegeName as a static variable. Create a method that accepts marks of three subjects as parameters. Calculate the total and percentage using local variables. Check whether the percentage is *40% or above* and display PASS; otherwise, display FAIL.

class Pass {

    String studentName = "Braja";
    int rollNo = 134;
    static String collegeName = "SEC";

    void checkResult(int mark1, int mark2, int mark3) {

        int total = mark1 + mark2 + mark3;
        double percentage = total / 3.0;

        String result = percentage >= 40 ? "PASS" : "FAIL";

        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + collegeName);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        Pass s = new Pass();

        s.checkResult(80, 70, 90);
    }
}
