package domain.model.payment;

import domain.model.client.Client;

import java.time.LocalDateTime;

public class BoletoPayment extends Payment{
    public BoletoPayment(Double value, Client client, LocalDateTime dateTime) {
        super(value, client, dateTime);
    }

    @Override
    public void process() {
        client.getWallet().debit(value);
        System.out.println("Pix recieved of a value R$" + value + " Sucess");
    }
}
