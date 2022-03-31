package Sapiens.Builder;

public interface builder {
    void setGameName(String name);
    void setGameYear(int year);
    void setGamePlatform(String platform);
    void setGamePlayingHours(int hours);
    void setGameDifficulty(boolean changeDifficulty);
    void setGameCoopPlayers(boolean setCoopPlayer,int number);
    void setGameLocalCoop(boolean localCoop);
    void setGameRankingPlayers(boolean rankingPlayers);
    void getInfo();
}
