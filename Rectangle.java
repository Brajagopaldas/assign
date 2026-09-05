// Q.7  Write a Java program to create a method named calculateArea() that accepts length and breadth as parameters. Calculate the area of the rectangle using a local variable and display the result.

class Rectangle {
    static void calculateArea(int length, int breadth){
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
    public static void main(String[] args){
        calculateArea(25, 30);
    }
        
}
