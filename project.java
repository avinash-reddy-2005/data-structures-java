import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class User {
    String username;
    String password;
    double balance;
    List<String> transactions;

    User(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        transactions.add("Account is created with balance 0.0");
    }

    void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited Rs." + amount + ", current balance is Rs." + balance);
    }

    boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdraw Rs." + amount + ", current balance is Rs." + balance);
            return true;
        } else {
            transactions.add("Insufficient balance! Current balance is Rs. " + balance);
            return false;
        }
    }

    void viewtransaction() {
        for (String History : transactions)
            System.out.println(History);
    }

    void recievetransfer(String fromUser, double amount) {
        balance += amount;
        transactions.add("Received Rs." + amount + " from " + fromUser + ", current balance is Rs." + balance);
    }

    boolean sendtransfer(User toUser, double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Sent Rs." + amount + " to " + toUser.username + ", current balance is Rs." + balance);
            toUser.recievetransfer(username, amount);
            return true;
        } else {
            transactions.add("Failed to send transfer - insufficient balance");
            return false;
        }
    }
}

public class project {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, User> users = new HashMap<>();

    public static void main(String args[]) {
        System.out.println("===Welcome to CLI Bank===");
        while (true) {
            System.out.println("\n1. Login\n2. Signup\n3. Exit ");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1 -> login();
                case 2 -> signup();
                case 3 -> {
                    System.out.println("Thanks for choosing CLI Bank.");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again");
            }
        }
    }

    static void signup() {
        System.out.print("Choose username: ");
        String username = sc.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Username already exists! Try to login.");
            return;
        }
        System.out.print("Choose password: ");
        String password = sc.nextLine();
        users.put(username, new User(username, password));
        System.out.println("Signup successful. You can login now.");
    }

    static void login() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        if (!users.containsKey(username)) {
            System.out.println("Username does not exist! Please signup.");
            return;
        }
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        User user = users.get(username);
        if (!user.password.equals(password)) {
            System.out.println("Invalid password! Try again.");
            return;
        }
        System.out.println("Login successful.");
        userdashboard(user);
    }

    static void userdashboard(User currentuser) {
        while (true) {
            System.out.println("\n<--- Menu --->");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View transactions");
            System.out.println("5. Transfer money");
            System.out.println("6. Logout");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> System.out.println("Current balance: Rs. " + currentuser.balance);
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    currentuser.deposit(amount);
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    if (!currentuser.withdraw(amount)) {
                        System.out.println("Insufficient balance.");
                    }
                }
                case 4 -> {
                    System.out.println("Transaction History:");
                    currentuser.viewtransaction();
                }
                case 5 -> {
                    System.out.print("Enter username to send money to: ");
                    String toUser = sc.nextLine();
                    if (!users.containsKey(toUser)) {
                        System.out.println("User not found.");
                        break;
                    }
                    if (toUser.equals(currentuser.username)) {
                        System.out.println("Cannot send money to yourself.");
                        break;
                    }
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    if (currentuser.sendtransfer(users.get(toUser), amount)) {
                        System.out.println("Transaction successful.");
                    } else {
                        System.out.println("Transaction failed.");
                    }
                }
                case 6 -> {
                    System.out.println("Logged out.");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
