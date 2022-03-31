package Sapiens.Facade.typesGames;

public class BGame {
    public int idGame;
    private String name;
    private int year;
    private int hours;
    private boolean changeDifficulty;
    private boolean setCoopPlayer;
    private int numberCoop;
    private boolean localCoop;
    public BGame(){}
    public BGame(int idGame, String name, int year, int hours, boolean changeDifficulty, boolean setCoopPlayer, int numberCoop, boolean localCoop) {
        this.idGame = idGame;
        this.name = name;
        this.year = year;
        this.hours = hours;
        this.changeDifficulty = changeDifficulty;
        this.setCoopPlayer = setCoopPlayer;
        this.numberCoop = numberCoop;
        this.localCoop = localCoop;
    }
}
