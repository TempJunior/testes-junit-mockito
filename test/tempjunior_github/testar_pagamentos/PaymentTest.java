package tempjunior_github.testar_pagamentos;

import domain.model.client.Client;
import domain.model.client.Wallet;
import domain.model.payment.Payment;
import domain.model.payment.PixPayment;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.fail;

public class PaymentTest {

    @Test
    public void deveRealizarPagamento() {
        Wallet wallet = new Wallet(00.00);
        wallet.cretid(40.00);
        Client client = new Client("Junior", wallet);
        Payment payment = new PixPayment(30.00, client, LocalDateTime.now());

        try {
            payment.pay();
        } catch (Exception e) {
            fail("Não era pra lançar exception");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExceptionValorInvalido() {
        Wallet wallet = new Wallet(00.00);
        wallet.cretid(40.00);
        Client client = new Client("Jose", wallet);
        Payment payment = new PixPayment(00.00, client, LocalDateTime.now());

        payment.pay();
    }

    @Test(expected = IllegalStateException.class)
    public void lancarExceptionCarteiraNula(){
        Client client = new Client("Jose", null);
        Payment payment = new PixPayment(40.01, client, LocalDateTime.now());

        payment.pay();
    }

    @Test(expected = IllegalArgumentException.class)
    public void lancaExceptionSaldoInsuficiente(){
        Wallet wallet = new Wallet(00.00);
        wallet.cretid(40.00);
        Client client = new Client("Jose", wallet);
        Payment payment = new PixPayment(40.01, client, LocalDateTime.now());

        payment.pay();
    }
}