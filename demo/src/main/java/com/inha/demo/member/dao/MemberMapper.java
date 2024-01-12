package com.inha.demo.member.dao;
import org.apache.ibatis.annotations.Mapper;

import com.inha.demo.member.dto.Member;

@Mapper // Mybatis의 데이터 베이스와의 연동을 위한 인터페이스에 지정하며 SQL 매핑파일(XML)과 매핑 작업을 처리한다.
public interface MemberMapper {
    public Member getMemberByName(String name);
}
