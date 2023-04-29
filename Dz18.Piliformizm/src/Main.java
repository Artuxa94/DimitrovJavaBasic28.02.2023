import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    MusicStyles popMusic = new PopMusic("Potap", "Pop");
    MusicStyles rockMusic = new RockMusic("Slipknot", "Rock");
    MusicStyles classicMusic = new ClassicMusic("Бах", "Classic");
        List<MusicStyles> musicStylesList = Arrays.asList(popMusic,rockMusic,classicMusic);
        for (MusicStyles musicStyles : musicStylesList){
            musicStyles.playMusic();
        }
    }
}
