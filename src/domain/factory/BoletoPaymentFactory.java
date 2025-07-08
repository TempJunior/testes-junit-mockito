package domain.factory;

import domain.model.payment.BoletoPayment;
import domain.model.payment.Payment;

public class BoletoPaymentFactory extends PaymentFactory{


    @Override
    protected Payment instantiatePayment(Payment payment) {
        return new BoletoPayment(payment.getValue(), payment.getClient(), payment.getDateTime());
    }
}
