package com.inha.demo.main;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inha.demo.member.dto.Member;
import com.inha.demo.member.service.MemberService;

@RestController
public class MainController {

    @Autowired
    private MemberService memberService;
    
    // API 호출 방법 : 브라우저 주소창에 http://localhost:8080/hello?name=홍길동
    @GetMapping("/hello")
    public String sayHellow(@RequestParam("name") String name){
        Member member;
        String result;
        try{
            member = memberService.getMember(name);
            result = "Hellow! 저는 " + member.getName() + "입니다. " + member.getAge()+"살 입니다.";
        }catch(NoSuchElementException e){
            result = "Member Data가 없습니다.";
        }
        return result;
    }
}
