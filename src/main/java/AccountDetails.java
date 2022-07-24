import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;

    public void showAccount() {
        System.out.println("Your account name is " + name);
        System.out.println("Your account number is " + accountNumber);
        System.out.println("Your login is " + login);
        System.out.println("Your account balance is " + balance);
    }

    Scanner scanner = new Scanner(System.in);

    public void createAccount() {
        System.out.println("Provide account name ");
        name = scanner.next();
        System.out.println("Provide account number ");
        accountNumber = scanner.next();
        System.out.println("Provide your login ");
        login = scanner.next();
        System.out.println("Provide your account balance ");
        balance = scanner.nextLong();
    }

    public void deposit() {
        System.out.println("Jaką kwotę wpłacasz? ");
        long pieniadze;
        pieniadze = scanner.nextLong();
        balance = balance + pieniadze;
    }

    public void withdrawal() {
        System.out.println("Jaką kwotę wypłacasz? ");
        long pieniadze;
        pieniadze = scanner.nextLong();
        balance = balance - pieniadze;

    }
}
