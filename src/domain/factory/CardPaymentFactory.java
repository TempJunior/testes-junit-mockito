package domain.factory;

import domain.model.payment.CardPayment;
import domain.model.payment.Payment;

public class CardPaymentFactory extends PaymentFactory{


    @Override
    protected Payment instantiatePayment(Payment payment) {
        return new CardPayment(payment.getValue(), payment.getClient(), payment.getDateTime());
    }
}
