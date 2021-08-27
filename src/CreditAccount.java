public class CreditAccount extends Account {

    public CreditAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean pay(int amount) {
        this.amount -= amount;
        System.out.println("Payment form " + accountName + " for " + amount + " tenge");
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        this.amount -= amount;
        System.out.println("Transfer from " + accountName + " to " + account + "-" + amount + " tenge");
        return true;
    }

    @Override
    public boolean addMoney(int amount) {
        if (this.amount + amount > 0) {
            System.out.println("Credit on " + accountName + " is less than " + amount);
            return false;
        }
        this.amount += amount;
        System.out.println("The " + accountName + " recived " + amount + " tenge");
        return true;
    }


}
