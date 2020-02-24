package vip.zdd.ums.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.zdd.ums.bean.Member;
import vip.zdd.ums.bean.MemberReceiveAddress;
import vip.zdd.ums.mapper.MemberMapper;
import vip.zdd.ums.mapper.MemberReceiveAddressMapper;
import vip.zdd.ums.service.MemberService;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;
    private final MemberReceiveAddressMapper memberReceiveAddressMapper;

    @Autowired
    public MemberServiceImpl(MemberMapper memberMapper, MemberReceiveAddressMapper memberReceiveAddressMapper){
        this.memberMapper = memberMapper;
        this.memberReceiveAddressMapper = memberReceiveAddressMapper;
    }

    @Override
    public List<Member> getAllMember() {
        List<Member> memberList = memberMapper.selectAll();
//        memberMapper.selectAllMember();
        return memberList;
    }

    @Override
    public List<MemberReceiveAddress> getMemberReceiveAddressesByMemberId(long memberId) {
        MemberReceiveAddress memberReceiveAddress = new MemberReceiveAddress();
        memberReceiveAddress.setMemberId(memberId);
        return memberReceiveAddressMapper.select(memberReceiveAddress);
    }
}
