package Sapiens.Factory;
import Sapiens.Profile.listInterface;

import java.util.HashMap;


public abstract class createEntry {
    public HashMap<Integer, Integer> entradaLista(){
        listInterface nuevoUser = entrada();
        return nuevoUser.addList();

    }

    public abstract listInterface entrada();
}
