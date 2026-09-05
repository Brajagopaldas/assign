class Esalary {

    String employeeName = "Braja";
    double basicSalary = 300000;
    static String companyName = "ABC";

    void salaryDetails(double salary) {

        double HRA = salary * 0.20;
        double DA = salary * 0.10;
        double totalSalary = salary + HRA + DA;

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {

        Esalary e = new Esalary();

        e.salaryDetails(300000);
    }
}