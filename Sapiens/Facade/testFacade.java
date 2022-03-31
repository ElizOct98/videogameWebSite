package Sapiens.Facade;

import Sapiens.Facade.typesGames.AGame;
import Sapiens.Facade.typesGames.BGame;
import Sapiens.Facade.typesGames.CGame;
import Sapiens.Facade.typesGames.convertGames;
import java.util.HashMap;

public class testFacade {
    public static void main(String[] args) {
        AGame game1=new AGame(1,"one",2000,"pc",26);
        AGame game2=new AGame(2,"two",1990,"xbox",100);
        AGame game3=new AGame(3,"three",2010,"pc",78);

        BGame game4=new BGame(4,"four",1995,64,true,true,4,true);
        BGame game5=new BGame(5,"five",2020,40,false,true,4,false);

        CGame game6 = new CGame(6,"six",2022,false,0,true);

        HashMap<Integer, Integer> wishList = new HashMap<Integer,Integer>();

       convertGames toolFacade=new convertGames();

        wishList.putAll(toolFacade.addWishList(game1,1));
        wishList.putAll(toolFacade.addWishList(game4,2));
        wishList.putAll(toolFacade.addWishList(game6,3));
        System.out.println(wishList);
    }
}
