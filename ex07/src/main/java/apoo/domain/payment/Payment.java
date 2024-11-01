package apoo.domain.payment;

import apoo.domain.payment.method.PaymentMethod;
import apoo.domain.payment.status.Status;
import apoo.domain.signature.Signature;
import apoo.domain.signature.level.SignatureLevel;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Payment {
    private UUID id;
    private Double value;
    private LocalDate paymentDate;
    private PaymentMethod paymentMethod;
    private Status status;

    public Payment(UUID id, LocalDate paymentDate, PaymentMethod paymentMethod, Status status, Signature signature) {
        this.id = id;
        this.value = getTotalPaymentValue(signature);
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    private Double getTotalPaymentValue(Signature signature){
        return 100 + signature.getValue();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
