package domain.model.payment;

import domain.model.client.Client;

import java.time.LocalDateTime;

public class CardPayment extends Payment{
    public CardPayment(Double value, Client client, LocalDateTime dateTime) {
        super(value, client, dateTime);
    }

    @Override
    public void process() {
        Double balance = client.getWallet().getBalance();
        System.out.println("Balance in account -  " + client.getName() + " Value R$" + balance);
    }

}
