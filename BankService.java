class BankAccount {
    double balance;
    BankAccount(double b) { balance = b; }
    void deposit(double a) { balance += a; }
    void withdraw(double a) { balance -= a; }
}

public class BankService {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);
        acc.deposit(700);
        acc.withdraw(100);
        System.out.println("Final Balance: " + acc.balance);
    }
}
