package vip.zdd.ums.mapper;

import tk.mybatis.mapper.common.Mapper;
import vip.zdd.ums.bean.Member;

import java.util.List;

public interface MemberMapper extends Mapper<Member> {
    List<Member> selectAllMember();
}
