package com.inha.demo.member.service;

import java.util.NoSuchElementException;

import com.inha.demo.member.dto.Member;

public interface MemberService {
    public Member getMember(String name) throws NoSuchElementException;
}
