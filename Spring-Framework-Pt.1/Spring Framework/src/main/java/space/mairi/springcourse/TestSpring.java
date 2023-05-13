package space.mairi.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class TestSpring {
    // (en) Referencing a configuration file
    // (ru) Обрашение к конфигурационному файлу
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("ClassicalMusicBean", ClassicalMusic.class);
            // (en) Getting Bean
            // (ru) Получаем Bean

        //Music music = context.getBean("MusicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        //System.out.println(comparison);
        //System.out.println(firstMusicPlayer);
        //System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        //System.out.println(firstMusicPlayer.getVolume());
        //System.out.println(secondMusicPlayer.getVolume());

        MusicPlayer.PlayMusicList();

        context.close();
    }
}
