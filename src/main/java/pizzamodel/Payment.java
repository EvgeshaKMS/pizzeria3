package pizzamodel;

import pizzamodel.PaymentType;

public class Payment {
    private long amount;
    private PaymentType paymentType;

    public Payment(long amount, PaymentType paymentType) {
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
