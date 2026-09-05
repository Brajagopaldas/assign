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