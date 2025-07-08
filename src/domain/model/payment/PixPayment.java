package domain.model.payment;

import domain.model.client.Client;

import java.time.LocalDateTime;

public class PixPayment extends Payment{
    public PixPayment(Double value, Client client, LocalDateTime dateTime) {
        super(value, client, dateTime);
    }

    @Override
    public void process() {
        client.getWallet().debit(value);
        System.out.println("Debit value R$" + value + " Sucess");
    }

}
