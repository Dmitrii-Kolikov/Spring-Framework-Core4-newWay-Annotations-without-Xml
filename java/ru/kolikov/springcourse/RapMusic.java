package ru.kolikov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



@Component //создаем бин этого класса
@Scope("prototype")
public class RapMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
        @Override
        public String getSongs() {
            return "8 Mile";
        }
    }
