public class Main {
    public static void main(String[] args)
    {
        double creditCard_Balance = 5000.00;
        double interestRate = 0.17;
        int month = 0;
        month = month + 1;
        double interest = creditCard_Balance + (interestRate * month);

        System.out.println("Your bank account balance is: $" + creditCard_Balance + ", with total including tax for this month will be: " + interest + ".");
        int secondMonth = month+month;
        double newInterest = creditCard_Balance * (interestRate + secondMonth);
        System.out.println("Your bank account balance is: $" + creditCard_Balance + ", with total including tax for next month will be: " + interest + ".");
    }
}