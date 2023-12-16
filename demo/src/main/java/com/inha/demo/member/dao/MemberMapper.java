package com.inha.demo.member.dao;


import org.apache.ibatis.annotations.Mapper;

import com.inha.demo.member.dto.Member;


@Mapper
public interface MemberMapper {
    public Member getMemberByName(String name);
    
}
