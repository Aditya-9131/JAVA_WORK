
import java.util.ArrayList;
import java.util.Scanner;

class Account1a {
    private int accountNumber;
    private String accountType;
    private String serviceBranchIFSC;
    private float minimumBalance;
    private float availableBalance;
    private int customerID;
    private String customerName;
    private static int totalAccountCreated = 0;

    public Account1a() {
        totalAccountCreated++;
    }

    public void setDetails(int accountNumber, String accountType, String serviceBranchIFSC,
                          float minimumBalance, float availableBalance, int customerID, String customerName) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.serviceBranchIFSC = serviceBranchIFSC;
        this.minimumBalance = minimumBalance;
        this.availableBalance = availableBalance;
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public String getDetails(int accountNo) {
        if (accountNo == accountNumber) {
            return "Account Number: " + accountNumber +
                    "\nAccount Type: " + accountType +
                    "\nService Branch IFSC: " + serviceBranchIFSC +
                    "\nMinimum Balance: " + minimumBalance +
                    "\nAvailable Balance: " + availableBalance +
                    "\nCustomer ID: " + customerID +
                    "\nCustomer Name: " + customerName;
        } else {
            return "Account not found!";
        }
    }

    public void updateDetails(int accountNo, String accountType, String serviceBranchIFSC,
                              float minimumBalance, String customerName) {
        if (accountNo == this.accountNumber) {
            this.accountType = accountType;
            this.serviceBranchIFSC = serviceBranchIFSC;
            this.minimumBalance = minimumBalance;
            this.customerName = customerName;
            System.out.println("Account details updated successfully.");
        } else {
            System.out.println("Account not found!");
        }
    }

    public float getBalance(int accountNo) {
        if (accountNo == accountNumber) {
            return availableBalance;
        } else {
            return -1; // Account not found
        }
    }

    public void deposit(int accountNo, float amount) {
        if (accountNo == accountNumber) {
            availableBalance += amount;
            System.out.println("Deposit successful. New balance: " + availableBalance);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(int accountNo, float amount) {
        if (accountNo == accountNumber) {
            if (availableBalance - amount >= minimumBalance) {
                availableBalance -= amount;
                System.out.println("Withdrawal successful. New balance: " + availableBalance);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    public static int totalAccount() {
        return totalAccountCreated;
    }

    public static int compare(Account1a account1, Account1a account2) {
        if (account1.availableBalance > account2.availableBalance) {
            return 1;
        } else if (account1.availableBalance < account2.availableBalance) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account1a> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Create a new account");
            System.out.println("2. Delete an account (not implemented)");
            System.out.println("3. Modify details of an account");
            System.out.println("4. Get account balance");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("7. Total accounts created");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Account1a account = new Account1a();
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter Account Type: ");
                    String accountType = scanner.next();
                    System.out.print("Enter Service Branch IFSC: ");
                    String serviceBranchIFSC = scanner.next();
                    System.out.print("Enter Minimum Balance: ");
                    float minimumBalance = scanner.nextFloat();
                    System.out.print("Enter Customer ID: ");
                    int customerID = scanner.nextInt();
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.next();
                    System.out.print("Enter Initial Deposit Amount: ");
                    float initialDeposit = scanner.nextFloat();

                    account.setDetails(accountNumber, accountType, serviceBranchIFSC,
                            minimumBalance, initialDeposit, customerID, customerName);
                    accounts.add(account);
                    break;

                case 2:
                    // Delete an account (not implemented)
                    System.out.println("Option not implemented.");
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int accNo = scanner.nextInt();
                    for (Account1a acc : accounts) {
                        if (acc.getDetails(accNo) != "Account not found!") {
                            System.out.print("Enter Account Type: ");
                            accountType = scanner.next();
                            System.out.print("Enter Service Branch IFSC: ");
                            serviceBranchIFSC = scanner.next();
                            System.out.print("Enter Minimum Balance: ");
                            minimumBalance = scanner.nextFloat();
                            System.out.print("Enter Customer Name: ");
                            customerName = scanner.next();
                            acc.updateDetails(accNo, accountType, serviceBranchIFSC,
                                    minimumBalance, customerName);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int accNumber = scanner.nextInt();
                    for (Account1a acc : accounts) {
                        if (acc.getDetails(accNumber) != "Account not found!") {
                            System.out.println("Available Balance: " + acc.getBalance(accNumber));
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    int accountNo = scanner.nextInt();
                    for (Account1a acc : accounts) {
                        if (acc.getDetails(accountNo) != "Account not found!") {
                            System.out.print("Enter Deposit Amount: ");
                            float depositAmount = scanner.nextFloat();
                            acc.deposit(accountNo, depositAmount);
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    int accNoWithdraw = scanner.nextInt();
                    for (Account1a acc : accounts) {
                        if (acc.getDetails(accNoWithdraw) != "Account not found!") {
                            System.out.print("Enter Withdrawal Amount: ");
                            float withdrawalAmount = scanner.nextFloat();
                            acc.withdraw(accNoWithdraw, withdrawalAmount);
                            break;
                        }
                    }
                    break;

                case 7:
                    System.out.println("Total Accounts Created: " + Account.totalAccount());
                    break;

                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
       
