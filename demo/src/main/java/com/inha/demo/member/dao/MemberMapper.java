package com.inha.demo.member.dao;


import com.inha.demo.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MemberMapper {
    public Member getMemberByName(String name);
    public Member getMemberById(String id);
    public int insert(Member member);
    
    
}
