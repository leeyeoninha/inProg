package com.inha.demo.main;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inha.demo.member.dto.Member;
import com.inha.demo.member.service.MemberService;


@RestController //이 클래스가 RESTful API를 처리하는 컨트롤러임을 나타냅니다.
public class MainController {

    @Autowired //MemberService 인스턴스를 주입받기 위해 사용됩니다.
    private MemberService memberService;
    
    // API 호출 방법 : 브라우저 주소창에 http://localhost:8080/hello?name=홍길동
    @GetMapping("/hello")
    public String sayHellow(@RequestParam("name") String name){
        // @RequestParam("name") : 요청 파라미터 중 name 값을 가져오는 어노테이션입니다.
        Member member;
        String result;
        try{
            member = memberService.getMember(name);
            result = "Hellow! 저는 " + member.getName() + "입니다. " + member.getAge()+"살 입니다.";
        }catch(NoSuchElementException e){
            // Member 정보가 없을경우 에러 메세지 정의
            result = "Member Data가 없습니다.";
        }
        return result;
    }
}
