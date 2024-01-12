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

    /**
     * 주어진 이름으로 회원 정보를 조회합니다.
     * @param name 회원 이름
     * @return 조회된 회원 정보
     * @throws NoSuchElementException 회원 정보가 없을 경우 예외 발생
     */
    public Member getMember(String name) throws NoSuchElementException{
        Member member = memberMapper.getMemberByName(name);

        if( member == null ){
            // 조회된 member가 없을 경우 NoSuchElementException 예외를 던집니다.
            throw new NoSuchElementException("Not Found Member");
        }
        return member;
    }

    /**
     * 주어진 이름으로 회원 정보를 조회합니다.
     * @param member 회원 객체
     * @return 등록된 회원 객체
     * @throws DuplicateKeyException 중복된 회원이 존재할 경우 예외 발생
     */
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

    /**
     * 주어진 id,password로 회원 정보를 조회합니다.
     * @param id,password
     * @return 로그인한 회원 객체
     * @throws NoSuchElementException 아이디가 존재하지 않을 경우, 패스워드가 틀릴 경우
     */
    public Member signIn(String id, String password) throws NoSuchElementException{

        Member member = memberMapper.getMemberById(id);
        if( member == null ){
            throw new NoSuchElementException("존재하지 않는 아이디입니다.");
        };
        if ( !(password).equals(member.getPasswd()) ) {
            throw new NoSuchElementException("비밀번호를 확인해주세요.");
        };
        return member;
    }
}
