package vip.zdd.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.zdd.ums.bean.Member;
import vip.zdd.ums.service.MemberService;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @RequestMapping("member/index")
    @ResponseBody
    public String index(){
        return "UMS MEMBER INDEX";
    }

    @RequestMapping("member/getAllMember")
    @ResponseBody
    public List<Member> getAllMember(){
        List<Member> memberList = memberService.getAllMember();
        return memberList;
    }
}
