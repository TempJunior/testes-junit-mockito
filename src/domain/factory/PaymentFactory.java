package domain.factory;

import domain.model.payment.Payment;

public abstract class PaymentFactory {
    public Payment createPayment(Payment payment) {
        return instantiatePayment(payment);
    }

    protected abstract Payment instantiatePayment(Payment payment);
}
