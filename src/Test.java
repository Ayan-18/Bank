public class Test {
    public static void main(String[] args) {
        Account saving = new SavingsAccount("Saving Account", 100000);
        Account credit = new CreditAccount("Credit Account", 0);
        Account checking = new CheckingAccount("Checking Account", 15000);

        checking.pay(10000);
        credit.pay(15500);
        saving.transfer(credit, 1330);

        System.out.println(checking.getAmount());
        System.out.println(credit.getAmount());
        System.out.println(saving.getAmount());
    }
}
