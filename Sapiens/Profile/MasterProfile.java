package Sapiens.Profile;

import java.util.HashMap;
import java.util.Scanner;

public class MasterProfile implements listInterface {
    public int idUser;
    public String name;
    public HashMap<Integer, Integer> wishList = new HashMap<>();
    public MasterProfile(){
    }
    public MasterProfile(MasterProfile entry){
        this.idUser=entry.idUser;
        this.name=entry.name;
        this.wishList= entry.wishList;
    }
    public HashMap<Integer, Integer>  addList( ) {
        Scanner lectura = new Scanner (System.in);
        MasterProfile user =new MasterProfile();
        System.out.println("Master Profile");
        System.out.println("enter id user");
        user.idUser = Integer.parseInt(lectura.next());
        System.out.println("enter name:");
        user.name = (lectura.next());
        System.out.println("enter id game:");
        int idGame = Integer.parseInt(lectura.next());
        user.wishList.put(user.idUser,idGame);

        System.out.println(user.name+", "+ user.idUser);
        return user.wishList;
    }
}
