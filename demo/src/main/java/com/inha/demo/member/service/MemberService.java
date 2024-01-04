package com.inha.demo.member.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inha.demo.member.dao.MemberMapper;
import com.inha.demo.member.dto.Member;

@Service
public class MemberService{

    @Autowired
    private MemberMapper memberMapper;

    public Member getMember(String name) throws NoSuchElementException{
        Member member = memberMapper.getMemberByName(name);

        if( member == null ){
            throw new NoSuchElementException("Not Found Member");
        }
        return member;
    }
    
}
