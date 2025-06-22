package com.example.userInfo.dto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Person {
    private String name;
    private String nickname;
    private String email;
    private String phone;
    private int age;
    private LocalDateTime dateTime;

    public Person(String name, String nickname, String email, String phone, int age, LocalDateTime dateTime)
    {
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.dateTime = dateTime;
    }
}
