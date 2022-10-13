package YourFirstBankTransfer;

public class Main {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews Account", 1000);
        Account myAccount = new Account("My Account", 0);
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
        myAccount.recieveFrom(matthewsAccount, 100);
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}