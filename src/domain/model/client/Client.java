package domain.model.client;

public class Client {
    protected String name;
    protected Wallet wallet;

    public Client(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}
