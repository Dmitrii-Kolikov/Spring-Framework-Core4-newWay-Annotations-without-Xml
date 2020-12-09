package ru.kolikov.springcourse;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration //помечаем наш класс, который мы хотим использовать для конфигураций Spring приложения
@ComponentScan("ru.kolikov.springcourse")
@PropertySource("classpath:musicPlayer.properties") //аннотация внедрение файла
public class SpringConfig {
}
