package apoo;

import apoo.adapters.presenters.member.MemberPresenter;
import apoo.frameworks.member.MemberRepositoryImpl;
import apoo.application.member.RegisterMemberUseCase;
import apoo.domain.exercise.Exercise;
import apoo.domain.member.Member;
import apoo.domain.member.MemberRepository;
import apoo.domain.payment.Payment;
import apoo.domain.payment.method.PaymentMethod;
import apoo.domain.payment.status.Status;
import apoo.domain.signature.Signature;
import apoo.domain.signature.level.SignatureLevel;
import apoo.domain.workout.Workout;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        MemberRepository memberRepository = new MemberRepositoryImpl();
        MemberPresenter memberPresenter = new MemberPresenter();
        RegisterMemberUseCase registerMemberUseCase = new RegisterMemberUseCase(memberPresenter, memberRepository);

        Member member = new Member(
                UUID.randomUUID(),
                "Name",
                LocalDate.of(2005, 7, 18),
                List.of(
                        new Workout(
                                List.of(new Exercise("Supino", 10), new Exercise("Agachamento", 10)))),
                List.of(
                        new Payment(
                                UUID.randomUUID(),
                                LocalDate.of(2024, 7, 10),
                                PaymentMethod.CARD,
                                Status.APPROVED,
                                new Signature(SignatureLevel.MEDIUM))),
                new Signature(SignatureLevel.MEDIUM));

        registerMemberUseCase.registerMember(member);
    }
}