package pr01_bankAccountTestClient;


public interface BankAccountInterface {
    public void setId(int id);
    public double getBalance(double balance);
    public void deposit(double amount);
    public void withdraw(double amount);
}
