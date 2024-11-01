package apoo.adapters.presenters.member;

import apoo.adapters.presenters.Presenter;
import apoo.domain.member.Member;

public class MemberPresenter implements Presenter<Member> {
    @Override
    public void showSuccess(Member data) {
        System.out.println(data);
    }

    @Override
    public void showError(String message) {
        System.out.println(message);
    }
}
