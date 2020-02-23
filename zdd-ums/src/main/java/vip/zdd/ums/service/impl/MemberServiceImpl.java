package vip.zdd.ums.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.zdd.ums.bean.Member;
import vip.zdd.ums.mapper.MemberMapper;
import vip.zdd.ums.service.MemberService;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Autowired
    public MemberServiceImpl(MemberMapper memberMapper){
        this.memberMapper = memberMapper;
    }

    @Override
    public List<Member> getAllMember() {
        List<Member> memberList = memberMapper.selectAllMember();
        return memberList;
    }
}
