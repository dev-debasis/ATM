import java.util.*;

public class Atm {
    public static void main(String[] args) {
        int pin = 8888, availableAmount = 100000;
        boolean exit = false;
        System.out.println("");
        System.out.println("");
        System.out.println("=====================================================================================");
        System.out.print("ENTER YOUR CARD PIN : ");
        Scanner scanner = new Scanner(System.in);
        int pinGivenByUser = scanner.nextInt();
        while (!exit) {
            if (pinGivenByUser == pin) {
                while (!exit) {
                    System.out.println("");
                    System.out.println(
                            "-------------------------------------------------------------------------------------");
                    System.out.println("1.Cash Withdrawl");
                    System.out.println("2.Cash Deposit");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Change PIN");
                    System.out.println("5.Exit");
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("");
                            System.out.print("Enter the withdraw amount : ");
                            int withdrawAmount = scanner.nextInt();
                            if ((withdrawAmount + 500) <= availableAmount) {
                                availableAmount -= withdrawAmount;
                                System.out.println("");
                                System.out.println("---------------------------------------------");
                                System.out.println("Transaction Successful.");
                                System.out.println("Withdrawl amount : " + withdrawAmount);
                                System.out.println("Remaining Balance : " + availableAmount);
                                System.out.println("---------------------------------------------");
                            } else {
                                System.out.println("");
                                System.out.println("---------------------------------------------");
                                System.out.println("Don't have sufficient amount to withdraw.");
                                System.out.println("---------------------------------------------");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("");
                            System.out.print("Enter the amount to deposit : ");
                            int depositAmount = scanner.nextInt();
                            System.out.println("");
                            System.out.println("---------------------------------------------");
                            System.out.println("Transaction Successful.");
                            System.out.println("Deposit Amount : " + depositAmount);
                            availableAmount += depositAmount;
                            System.out.println("Updated Balance : " + availableAmount);
                            System.out.println("---------------------------------------------");
                        }
                            break;
                        case 3: {
                            System.out.println("");
                            System.out.println("---------------------------------------------");
                            System.out.println("Available Balance : " + availableAmount);
                            System.out.println("---------------------------------------------");
                            break;
                        }
                        case 4: {
                            System.out.println("");
                            System.out.print("Enter Previous PIN : ");
                            int previousPinChecking = scanner.nextInt();
                            System.out.print("Enter New PIN : ");
                            int newPin = scanner.nextInt();
                            if (previousPinChecking == pin) {
                                pin = newPin;
                                System.out.println("");
                                System.out.println("---------------------------------------------");
                                System.out.println("PIN Updated Successfully");
                                System.out.println("---------------------------------------------");
                            } else {
                                System.out.println("");
                                System.out.println("---------------------------------------------");
                                System.out.println("Previous PIN doesn't match");
                                System.out.println("---------------------------------------------");
                                exit = true;
                            }
                            break;
                        }
                        case 5: {
                            exit = true;
                            break;
                        }
                        default: {
                            System.out.println("---------------------------------------------");
                            System.out.println("Invalid Input");
                            System.out.println("---------------------------------------------");
                        }
                    }
                }
            } else {
                System.out.println("Entered a wrong pin.");
            }
            scanner.close();
        }
    }
}
