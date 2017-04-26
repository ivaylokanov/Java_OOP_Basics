package pr01_bankAccountTestClient;


public class BankAccount implements BankAccountInterface {
    private int id;
    private double balance;

    public BankAccount(int id) {
        this.id = id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getBalance(double balance) {
        balance = this.balance + balance;
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance = this.balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance - amount>=0) {
            balance = this.balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return String.format("Account ID%s, balance %.2f",this.id,this.balance);
    }
}
