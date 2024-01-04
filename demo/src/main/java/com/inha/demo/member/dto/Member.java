package com.inha.demo.member.dto;

import java.time.LocalDateTime;

public class Member {
    private String id;
    private String passwd;
    private String name;
    private int age;
    private String email;
    private LocalDateTime signuptime;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getSignuptime() {
        return signuptime;
    }
    public void setSignuptime(LocalDateTime signuptime) {
        this.signuptime = signuptime;
    }


    /* 
      # Getter : 클래스의 특정 필드의 값을 가져오는 역할을 하는 메서드
      # Setter : 클래스의 특정 필드의 값을 설정하는 역할을 하는 메서드

      # VSCODE에서 제공하는 Getter, Setter 쉽게 생성하기
      1.마우스 오른쪽 클릭
      2.source actions... 선택
      3.Generate Getter, Setter 선택
     */
    
    
}

