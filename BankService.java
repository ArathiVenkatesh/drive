class BankAccount {
    double balance;

    BankAccount(double b) {
        balance = b;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Balance after deposit of 500: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal of 100: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class BankService {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        System.out.println("Initial Balance: " + acc.balance);

        acc.deposit(700);
        acc.withdraw(100);

        System.out.println("Final Balance: " + acc.balance);
    }
}
