package Day1;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.username = "Quyen";
        acc1.password = "abc123";

        System.out.println("Name: " + acc1.username);
        System.out.println("Password " + acc1.password);

        Account acc2 = new Account();
        acc2.username = "Trinh";
        acc2.password = "123abc";

        System.out.println("Name: " + acc2.username);
        System.out.println("Password " + acc2.password);

    }
}
