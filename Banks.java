import java.util.Scanner;


class Banks {
    static int totalAccounts = 0;  
    int accountNumber;
    float balance;

    
    Banks(int accNo, float bal) {
        accountNumber = accNo;
        balance = bal;
        totalAccounts++;
    }

       public void deposit(int amount) {
        balance += amount;
    }

    
    public void display() {
        System.out.print("\nDISPLAY");
        System.out.print("\nTotal number of accounts: " + totalAccounts);
        System.out.print("\nAccount Number: " + accountNumber);
        System.out.print("\nBalance: " + balance);
    }
}


public class BankApp {
    public static void main(String[] args) {
        int choice = 1;

        do {
            Scanner s = new Scanner(System.in);  // Scanner inside the loop

            System.out.print("Enter the Account Number: ");
            int accountNumber = s.nextInt();

            System.out.print("Enter the Initial Balance: ");
            float balance = s.nextFloat();

            System.out.print("Enter the Amount to be deposited: ");
            int amount = s.nextInt();

            Banks obj = new Banks(accountNumber, balance);
            obj.deposit(amount);
            obj.display();

            System.out.print("\nDo you wish to continue adding records? (1-yes / 0-no): ");
            choice = s.nextInt();
        } while (choice != 0);
    }
}