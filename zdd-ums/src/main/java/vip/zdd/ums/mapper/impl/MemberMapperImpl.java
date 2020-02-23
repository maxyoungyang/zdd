package vip.zdd.ums.mapper.impl;

import org.apache.ibatis.annotations.Mapper;
import vip.zdd.ums.bean.Member;
import vip.zdd.ums.mapper.MemberMapper;

import java.util.List;

@Mapper
public class MemberMapperImpl implements MemberMapper {
    @Override
    public List<Member> selectAllMember() {
        return null;
    }
}
