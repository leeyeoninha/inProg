package com.inha.demo.member.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.inha.demo.member.dao.MemberMapper;
import com.inha.demo.member.dto.Member;


// @Service 어노테이션을 사용하여 이 클래스가 서비스 계층의 컴포넌트임을 지정합니다.
@Service
public class MemberService{

    // @Autowired 어노테이션을 사용하여 MemberMapper 타입의 빈(Bean)을 자동으로 주입(inject) 받습니다.
    @Autowired
    private MemberMapper memberMapper;

    public Member getMember(String name) throws NoSuchElementException{
        Member member = memberMapper.getMemberByName(name);

        if( member == null ){
            throw new NoSuchElementException("Not Found Member");
        }
        return member;
    }

    public Member signUp(Member member) throws DuplicateKeyException{
        // member.getId()을 통해 받아온 ID로 기존 멤버를 검색합니다. 이를 통해 ID의 중복 여부를 확인합니다.
        Member searchMember = memberMapper.getMemberById(member.getId());
    
        // 만약 검색한 멤버가 이미 존재한다면, 중복된 ID가 있다는 의미이므로 DuplicateKeyException을 던집니다.
        if( searchMember != null ){
            throw new DuplicateKeyException("중복된 ID가 존재합니다.");
        }
        // ID가 중복되지 않은 경우, memberMapper의 insert 메소드를 호출하여 새 멤버를 데이터베이스에 추가합니다.
        memberMapper.insert(member);
        // 새로 회원가입된 멤버 정보를 반환합니다.
        return member;
    }
    
}
