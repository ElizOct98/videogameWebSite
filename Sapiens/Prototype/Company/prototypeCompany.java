package Sapiens.Prototype.Company;

import java.util.List;

public abstract class prototypeCompany {
    public int idCompany;
    public int yearCreation;
    public String name;
    public String description;
    public List<Integer> idGamesCreated;

    public prototypeCompany(){}

    public prototypeCompany(prototypeCompany entry){
        this.idCompany=entry.idCompany;
        this.yearCreation= entry.yearCreation;
        this.name=entry.name;
        this.description=entry.description;
        this.idGamesCreated=entry.idGamesCreated;
    }

    public abstract prototypeCompany clone();


    public void info(Object objCompany){
        System.out.println(objCompany);
    }
}
