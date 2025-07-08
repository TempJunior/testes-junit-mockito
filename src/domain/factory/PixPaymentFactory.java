package domain.factory;

import domain.model.payment.Payment;
import domain.model.payment.PixPayment;

public class PixPaymentFactory extends PaymentFactory{


    @Override
    protected Payment instantiatePayment(Payment payment) {
        return new PixPayment(payment.getValue(), payment.getClient(), payment.getDateTime());
    }
}
