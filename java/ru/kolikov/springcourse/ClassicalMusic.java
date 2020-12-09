package ru.kolikov.springcourse;

import org.springframework.stereotype.Component;


@Component  //создаем бин этого класса
public class ClassicalMusic implements Music {

    public String getSongs() {
        return "Hungarian Rhapsody";
    }
}
