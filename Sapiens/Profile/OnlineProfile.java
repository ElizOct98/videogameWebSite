package Sapiens.Profile;

import Sapiens.Singleton;

import java.util.HashMap;
import java.util.Scanner;

public class OnlineProfile implements listInterface {
    //id user that get online
    public int idUser;
    //list of active users
    //first int for id Users
    //second int for favorite videogame genre
    public int idGenre;
    public HashMap<Integer, Integer> activeUsersList = new HashMap<>();

    public OnlineProfile(){}

    public OnlineProfile(OnlineProfile entry) {
        this.idUser=entry.idUser;
        this.activeUsersList=entry.activeUsersList;
    }

    public HashMap<Integer, Integer> addList() {
        OnlineProfile onlineUser=new OnlineProfile();

        Scanner lectura = new Scanner (System.in);
        System.out.println("Online Profile");

        System.out.println("enter yourID use:");
        onlineUser.idUser = Integer.parseInt(lectura.next());

        System.out.println("enter your ID genre:");
        onlineUser.idGenre = Integer.parseInt(lectura.next());

        activeUsersList.put(onlineUser.idUser, onlineUser.idGenre);

        return activeUsersList;

    }
}
