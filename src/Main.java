// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonalAccount user1 = new PersonalAccount(220104008, "Kesha");
        PersonalAccount user2 = new PersonalAccount(220104002, "Adilet");
        user1.deposit(300);
        user1.withdraw(100);
        user1.printTransactionHistory();
    }
}