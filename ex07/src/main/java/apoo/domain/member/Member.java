package apoo.domain.member;

import apoo.domain.payment.Payment;
import apoo.domain.signature.Signature;
import apoo.domain.workout.Workout;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Member {
    private UUID id;
    private String name;
    private LocalDate birthDate;
    private List<Workout> workouts;
    private List<Payment> payments;
    public Signature signature;

    public Member(UUID id, String name, LocalDate birthDate, List<Workout> workouts, List<Payment> payments, Signature signature) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.workouts = workouts;
        this.payments = payments;
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", workouts=" + workouts +
                ", payments=" + payments +
                ", signature=" + signature +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }
}
