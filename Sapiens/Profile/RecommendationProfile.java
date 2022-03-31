package Sapiens.Profile;

import java.util.HashMap;
import java.util.Scanner;

public class RecommendationProfile implements listInterface {
    public HashMap<Integer, Integer>  recomendation = new HashMap<>();
    public HashMap<Integer, Integer> addList() {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Recommendation Profile");
        System.out.println(" game points");
        int points = Integer.parseInt(lectura.next());
        System.out.println("Game ID:");
        int idGame = Integer.parseInt(lectura.next());
        recomendation.put(idGame,points);
        return recomendation;
    }
}
