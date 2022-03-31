package Sapiens.Facade.typesGames;

import java.util.HashMap;

public class convertGames {
    private int idGame;


    public convertGames(){}
    public convertGames(int idGame){
        this.idGame= idGame;
    }

    public int defineClass(Object obj){
        AGame objA =new AGame();
        BGame objB =new BGame();
        CGame objC =new CGame();


        if(obj.getClass()==objA.getClass()){
            System.out.println("Objeto tipo A");
            return(1);
        }
         if(obj.getClass()==objB.getClass()){
            System.out.println("Objeto tipo B");
            return(2);
        }
         if(obj.getClass()==objC.getClass()){
            System.out.println("Objeto tipo C");
            return(3);
        }
        return (0);
    }

    public HashMap<Integer, Integer> addA(AGame Aobj, int ranking){
        HashMap<Integer, Integer> wishList = new HashMap<Integer,Integer>();
        wishList.put(ranking,Aobj.idGame);
        return wishList;

    }
    public HashMap<Integer, Integer> addB(BGame Bobj, int ranking){
        HashMap<Integer, Integer> wishList = new HashMap<Integer,Integer>();
        wishList.put(ranking,Bobj.idGame);
        return wishList;

    }
    public HashMap<Integer, Integer> addC(CGame Cobj, int ranking){
        HashMap<Integer, Integer> wishList = new HashMap<Integer,Integer>();
        wishList.put(ranking,Cobj.idGame);
        return wishList;

    }


    public HashMap<Integer, Integer> addWishList(Object obj, int ranking){
        HashMap<Integer, Integer> wishList = new HashMap<Integer,Integer>();
        int type = defineClass(obj);
        System.out.println(type);
        switch (type){
            case 1:
                wishList.putAll(addA((AGame) obj,ranking));
                break;
            case 2:
                wishList.putAll(addB((BGame) obj,ranking));
                break;
            case 3:
                wishList.putAll(addC((CGame) obj,ranking));
                break;
            default:
                System.out.println("error");
        }
        return wishList;


    }
}
