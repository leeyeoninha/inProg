package com.inha.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // Vue.js 서버 주소
                .allowedMethods("*") // 허용할 HTTP 메소드 (GET, POST, PUT, DELETE 등)
                .allowedHeaders("*") // 허용할 헤더
                .allowCredentials(true)
                .maxAge(3600); // 사전 전달 요청(Preflight request) 캐시 시간
    }
}