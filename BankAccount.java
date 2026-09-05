// Q6. Write a Java program to declare accountHolder and balance as instance variables and bankName as a static variable. Assign suitable values to all the variables and display the complete bank account details.


class BankAccount{
    static void accountDetails(String accountHolder, double balance, String bankName){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Total Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
    }
    public static void main(String[] args){
        accountDetails("Braja Gopal", 110255565, "SBI");
    }
}
