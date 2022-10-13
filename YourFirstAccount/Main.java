package YourFirstAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Bob", 69);
        System.out.println(account);
        account.addBalance(31);
        System.out.println(account);
        account.subsBalance(31);
        System.out.println(account);

    }
}