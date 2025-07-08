package tempjunior_github.testar_pagamentos;

import domain.factory.CardPaymentFactory;
import domain.factory.PaymentFactory;
import domain.model.client.Client;
import domain.model.client.Wallet;
import domain.model.payment.CardPayment;
import domain.model.payment.Payment;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Optional;

public class BoletoPaymentFactoryTest {

    @Test
    public void testarFactory(){
        PaymentFactory factory = new CardPaymentFactory();
        Wallet wallet = new Wallet(00.00);
        wallet.cretid(250.00);
        Client client = new Client("Joselito Junior", wallet);
        Payment baseBayment = new CardPayment(250.00, client, LocalDateTime.now());
        Payment paymentCreated = factory.createPayment(baseBayment);


        Assert.assertNotNull(paymentCreated);
        Assert.assertTrue(paymentCreated instanceof CardPayment);
        Assert.assertEquals("Joselito Junior", paymentCreated.getClient().getName());

    }
}