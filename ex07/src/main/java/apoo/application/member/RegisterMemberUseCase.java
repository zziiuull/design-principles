package apoo.application.member;

import apoo.adapters.presenters.Presenter;
import apoo.domain.member.Member;
import apoo.domain.member.MemberRepository;

public class RegisterMemberUseCase {
    private final Presenter<Member> presenter;
    private final MemberRepository repository;

    public RegisterMemberUseCase(Presenter<Member> presenter, MemberRepository repository) {
        this.presenter = presenter;
        this.repository = repository;
    }

    public void registerMember(Member member) {
        if (member == null){
            presenter.showError("Member cannot be null");
            return;
        }
        repository.save(member);
        presenter.showSuccess(member);
    }
}
