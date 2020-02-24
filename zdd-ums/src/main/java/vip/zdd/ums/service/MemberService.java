package vip.zdd.ums.service;

import vip.zdd.ums.bean.Member;
import vip.zdd.ums.bean.MemberReceiveAddress;

import java.util.List;

public interface MemberService {
    List<Member> getAllMember();
    List<MemberReceiveAddress> getMemberReceiveAddressesByMemberId(long memberId);
}
