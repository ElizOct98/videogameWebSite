package Sapiens.Factory;

import java.util.HashMap;

public class Test {
    private static createEntry usuarioMaster;
    private static createEntry usuarioOnline;


    public static void main(String[] args) {

        usuarioMaster = new MasterCreate();
        //create 4 profiles in the website
        HashMap<Integer, Integer> masterUserList = usuarioMaster.entradaLista();
        masterUserList.putAll(usuarioMaster.entradaLista());
        masterUserList.putAll(usuarioMaster.entradaLista());
        masterUserList.putAll(usuarioMaster.entradaLista());
        System.out.println(masterUserList);
        //create only 2 online profiles
        usuarioOnline = new OnlineCreate();
        HashMap<Integer, Integer> onlineUserList = usuarioOnline.entradaLista();
        onlineUserList.putAll(usuarioOnline.entradaLista());
        System.out.println(onlineUserList);


    }
}
