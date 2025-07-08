package domain.model.payment;

import domain.model.client.Client;

import java.time.LocalDateTime;

public abstract class Payment {
    protected Double value;
    protected Client client;
    protected LocalDateTime dateTime;

    public Payment(Double value, Client client, LocalDateTime dateTime) {
        this.value = value;
        this.client = client;
        this.dateTime = dateTime;
    }

    public void pay(){
        isValidTransaction();
        process();
    }

    public void isValidTransaction(){
        if (value == null || value <= 0){
            throw new IllegalArgumentException("Valor inválido.");
        }
        if (client == null || client.getWallet() == null){
            throw new IllegalStateException("Cliente ou carteira não definidos.");
        }
        if (!client.getWallet().haveBalance(value)){
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "value=" + value +
                ", client=" + client +
                ", dateTime=" + dateTime +
                '}';
    }

    public abstract void process();
}
