package domain;

import domain.factory.PaymentFactory;
import domain.factory.PixPaymentFactory;
import domain.model.client.Client;
import domain.model.client.Wallet;
import domain.model.payment.Payment;
import domain.model.payment.PixPayment;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new PixPaymentFactory();
        Wallet wallet = new Wallet(00.00);
        wallet.cretid(900.00);
        Client eu = new Client("Junior Oliveira", wallet);
        Payment pagamento = new PixPayment(05.00, eu, LocalDateTime.now());
        Payment dados = factory.createPayment(pagamento);
        dados.pay();
        System.out.println(dados);
    }
}
