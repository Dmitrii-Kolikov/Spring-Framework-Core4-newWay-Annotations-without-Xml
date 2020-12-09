package ru.kolikov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Component //создаем бин этого класса
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }

    @Autowired //автозаполнения подходящего бина зависимости Spring
    @Qualifier("rapMusic") //указываем какой именно мы хотим внедрить бин, если не укажем возникнет ошибкка.
    private  Music music1;
    @Autowired //автозаполнения подходящего бина зависимости Spring
    @Qualifier("rockMusic")  //если мы не укажем подходящий бин будет неоднознасность, возникнет ошибка.
    private  Music music2;

//    @Autowired - автозаполнения подходящего бина зависимости Spring
//    Необычный синтаксис
//    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("rapMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }


    public void playMusic() {
        System.out.println("Playing songs: " + music1.getSongs() + ", " + music2.getSongs());


    }

}
