package domain.model.client;

public class Wallet {
    private Double balance;

    public boolean haveBalance(Double value){
        return balance != null && balance >= value;
    }

    public void debit(Double value){
        if (!haveBalance(value)){
            throw new IllegalStateException("Saldo insuficiente para débito.");
        }
        this.balance -= value;
    }

    public void cretid(Double value){
        this.balance += value;
    }

    public Wallet(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                '}';
    }
}
