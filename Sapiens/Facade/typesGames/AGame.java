package Sapiens.Facade.typesGames;

public class AGame {
    public int idGame;
    private String name;
    private int year;
    private String platform;
    private int hours;
    public AGame(){}
    public AGame(int idGame, String name, int year, String platform, int hours) {
        this.idGame = idGame;
        this.name = name;
        this.year = year;
        this.platform = platform;
        this.hours = hours;
    }
}
