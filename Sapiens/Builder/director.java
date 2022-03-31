package Sapiens.Builder;
import Sapiens.Builder.builder;
import Sapiens.Builder.Constructors.singlePlayer;
import Sapiens.Builder.Constructors.singleCoop;

public class director {
    public void constructorSinglePlayer(builder builder){
        builder.setGameName("game1");
        builder.setGameYear(2000);
        builder.setGamePlatform("PC");
        builder.setGamePlayingHours(30);
        builder.setGameDifficulty(true);
        builder.setGameCoopPlayers(true,50);
        builder.getInfo();
    }
}
