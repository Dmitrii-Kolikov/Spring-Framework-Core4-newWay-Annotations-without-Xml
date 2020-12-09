package ru.kolikov.springcourse;

import org.springframework.stereotype.Component;

@Component //создаем бин этого класса
public class RockMusic implements Music {
    @Override
    public String getSongs() {
        return "Wind cries Mary";
    }
}
