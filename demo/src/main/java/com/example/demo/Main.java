package com.example.demo;

import com.example.demo.entity.Member;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;

@Slf4j // log를 쉽게 쓸 수 있게 해주는 어노테이션
public class Main {

    public static void main(String[] args) throws Throwable{
        ObjectMapper mapper = new ObjectMapper();

//        Member builtMember = new Member("myid", "myname", "koscom");
                // Member.builder().id("myid").name("myname").org("koscom").build();

        // 직렬화
//s       String json = mapper.writeValueAsString(builtMember);
//        byte[] byteStream = json.getBytes(StandardCharsets.UTF_8); // 네트워크 전송용
//        System.out.println(json);
//
//        log.debug("디버깅 메시지");
//
//        // 역직렬화
//        String inputString = new String(byteStream);
//        Member readObject = mapper.readValue(inputString, Member.class);
//        System.out.println(readObject);
    }

}
