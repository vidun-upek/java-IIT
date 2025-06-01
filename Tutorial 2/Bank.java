import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter Account Balance: ");
        double balance=scanner.nextDouble();
        
        while (true){
        System.out.println("Enter number of your choice of transaction ");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check for Fraud");
        System.out.println("4.Exit");

        System.out.println("Enter Choice: ");
        int choice=scanner.nextInt();

        switch(choice){
            case 1:
            System.out.println("Enter amount to deposit: ");
            double deposit=scanner.nextInt();

            if(deposit>0){
                balance+=deposit;
                System.out.println("balance: "+balance);
            }else{
                System.out.println("Deposit amount should be positive");
            }
            break;

            case 2:
            System.out.println("Enter amount to withdraw: ");
            double withdraw=scanner.nextInt();

            if(balance<=withdraw){
                System.out.println("No Sufficiet Funds:");
            }else{
                balance-=withdraw;
                System.out.println("balance: "+balance);
            }
            break;

            case 3:
            if (balance < 100) {
                System.out.println("Warning: Your balance is below $100! Potential fraud risk.");
            } else {
                System.out.println("Your account balance is safe: $" + balance);
            }
            break;

            case 4:
            System.out.println("Thank you for transacting with us");

            default:
                System.out.println("Error: Invalid transaction type. Please select a valid option.");

        }


        }


    }
    
}
