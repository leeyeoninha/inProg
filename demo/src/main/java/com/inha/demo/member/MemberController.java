package com.inha.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inha.demo.member.dto.Member;
import com.inha.demo.member.service.MemberService;

// @RestController 어노테이션을 사용하여 이 클래스가 RESTful 웹 서비스의 컨트롤러임을 지정합니다.
@RestController
public class MemberController {

    // @Autowired 어노테이션을 사용하여 MemberService 타입의 빈(Bean)을 자동으로 주입(inject) 받습니다.
    @Autowired
    private MemberService memberService;
        
    // HTTP POST 요청을 "/signup" URL로 받아들이는 메소드를 정의합니다.
    @PostMapping("/signup")
    public ResponseEntity<String>  signup(
        // @RequestBody 어노테이션을 사용하여 클라이언트가 보낸 HTTP 요청 본문을 Member 객체로 변환합니다.
        @RequestBody Member member
    ){
        try{
            // memberService의 signUp 메소드를 호출하여 회원가입 로직을 수행합니다.
            // 만약 회원가입 과정에서 문제가 발생하면 Exception을 던집니다.
            memberService.signUp(member);
        }catch(DuplicateKeyException e){
            // 회원가입 과정에서 DuplicateKeyException이 발생하면, HTTP 상태 코드 400(Bad Request)와 함께
            // Exception 메시지를 본문으로 하는 응답을 반환합니다.
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        // 회원가입이 성공적으로 이루어지면, HTTP 상태 코드 200(OK)와 함께 "회원가입 성공" 메시지를 본문으로 하는 응답을 반환합니다.
        return ResponseEntity.ok("회원가입 성공");
    }
}