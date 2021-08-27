public class SavingsAccount extends Account {

    public SavingsAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean pay(int amount) {
        System.out.println(accountName + " doesn't pay");
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("Not enough money to make transfer");
            return false;
        }
        if (!account.addMoney(amount)) {
            System.out.println("Transfer from " + accountName + " to " + account + " failed");
            return false;
        }
        this.amount -= amount;
        System.out.println("Transfer from " + accountName + " to " + account + "-" + amount + " tenge");
        return true;
    }

    @Override
    public boolean addMoney(int amount) {
        this.amount += amount;
        System.out.println("The " + accountName + " recived " + amount + " tenge");
        return true;
    }
}
