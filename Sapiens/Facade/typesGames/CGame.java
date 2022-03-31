package Sapiens.Facade.typesGames;

public class CGame {
    public int idGame;
    private String name;
    private int year;
    private boolean setCoopPlayer;
    private int numberCoop;
    private boolean localCoop;

    public CGame(){}

    public CGame(int idGame, String name, int year, boolean setCoopPlayer, int numberCoop, boolean localCoop) {
        this.idGame = idGame;
        this.name = name;
        this.year = year;
        this.setCoopPlayer = setCoopPlayer;
        this.numberCoop = numberCoop;
        this.localCoop = localCoop;
    }
}
