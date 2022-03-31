package Sapiens.Builder;
import Sapiens.Builder.director;
import Sapiens.Builder.Constructors.singlePlayer;
public class test {
    public static void main(String[] args) {
    director D1 = new director();
    singlePlayer videogame1 =new singlePlayer();
    D1.constructorSinglePlayer(videogame1);
    }
}
