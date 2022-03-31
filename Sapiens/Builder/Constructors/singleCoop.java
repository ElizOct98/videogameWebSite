package Sapiens.Builder.Constructors;

import Sapiens.Builder.builder;

public class singleCoop implements builder {
    private String name;
    private int year;
    private String platform;
    private int hours;
    private boolean changeDifficulty;
    private boolean setCoopPlayer;
    private int number;
    private boolean localCoop;

    @Override
    public void setGameName(String name) {
        this.name=name;
    }

    @Override
    public void setGameYear(int year) {
        this.year=year;
    }

    @Override
    public void setGamePlatform(String platform) {
        this.platform=platform;
    }

    @Override
    public void setGamePlayingHours(int hours) {
        this.hours=hours;
    }

    @Override
    public void setGameDifficulty(boolean changeDifficulty) {
        this.changeDifficulty=changeDifficulty;
    }

    @Override
    public void setGameCoopPlayers(boolean setCoopPlayer, int number) {
        this.setCoopPlayer=setCoopPlayer;
        this.number=number;
    }

    @Override
    public void setGameLocalCoop(boolean localCoop) {
        this.localCoop=localCoop;
    }
    //it's implemented in the interface but no needed on this type of videogame
    @Override
    public void setGameRankingPlayers(boolean rankingPlayers) {

    }

    @Override
    public void getInfo() {
        System.out.println(name+" "+year+" "+platform+" "+hours+" "+changeDifficulty+""+setCoopPlayer+""+number+""+localCoop);
    }


}
