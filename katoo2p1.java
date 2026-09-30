import java.util.Scanner;

public class katoo2p1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
ء
        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter deposit amount: ");
        int deposit = input.nextInt();

        System.out.print("Enter interest rate (%): ");
        double rate = input.nextDouble();

        double depositAmount = deposit;

        double interest = depositAmount * rate / 100;

        int roundedInterest = (int) Math.round(interest);

        double finalBalance = depositAmount + interest;

        System.out.println("\n----- SAVINGS SUMMARY -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Interest Earned: " + interest);
        System.out.println("Rounded Interest: " + roundedInterest);
        System.out.println("Final Balance: " + finalBalance);

        System.out.println("\n----- DATA CONVERSION -----");
        System.out.println("Original interest: " + interest);
        System.out.println("After explicit conversion: " + roundedInterest);

        input.close();
    }
}