package YourFirstAccount;
public class Account {
    private String accountName;
    private double balance;

    /*
     * constructor
     */
    public Account () {
        setAll("None", 0);
    }

     public Account (String accountName, double balance) {
        setAll(accountName, balance);
    }

    /*
     * set methods
     */
    public void setAll(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     * add method
     */
    public void addBalance(double amount) {
        setBalance(this.balance += amount);
    }

    /*
     * substract method
     */
    public void subsBalance(double amount) {
        setBalance(this.balance -= amount);
    }

    /*
     * toString
     */
    public String toString () {
        return "[Account: " + accountName + " | Balance: " + balance  + "]";
    }
}
