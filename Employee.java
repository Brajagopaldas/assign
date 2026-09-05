// Q5. Write a Java program to declare name, id, and salary as instance variables inside an Employee class. Assign suitable values to the variables using a method and display the employee details.


class Employee {
    static void employeeDetail(String name, int id, double salary){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args){
        employeeDetail("Braja", 110255, 350670.86);
    }
}
