package com.example.userInfo.controller;

import com.example.userInfo.dto.Person;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@RequestMapping("dev/api")
@Scope("request")
public class PersonController {
    private LocalDateTime localDateTime;

    public PersonController(LocalDateTime localDateTime)
    {
        this.localDateTime = localDateTime;
    }

    @GetMapping("/person")
    public Person getPersonInfo(@RequestParam String name,
                                @RequestParam String nickname,
                                @RequestParam String email,
                                @RequestParam String phone,
                                @RequestParam int age)
    {
        return new Person(name, nickname, email, phone, age, localDateTime);
    }

    @GetMapping("/basicPerson")
    public Person getPersonInfo(@RequestParam String name,
                                @RequestParam String nickname,
                                @RequestParam int age)
    {
        return new Person(name, nickname, "Unknown", "Unknown", age, localDateTime);
    }
}
