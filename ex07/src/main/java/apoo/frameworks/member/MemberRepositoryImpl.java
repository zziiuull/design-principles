package apoo.frameworks.member;

import apoo.domain.member.Member;
import apoo.domain.member.MemberRepository;

import java.util.*;

public class MemberRepositoryImpl implements MemberRepository {
    public Map<UUID, Member> members = new HashMap<>();

    @Override
    public Optional<Member> findById(UUID id) {
        return Optional.ofNullable(members.get(id));
    }

    @Override
    public void save(Member member) {
        members.put(member.getId(), member);
    }

    @Override
    public void delete(Member member) {
        members.remove(member.getId());
    }

    @Override
    public List<Member> findAll() {
        return members.values().stream().toList();
    }
}
