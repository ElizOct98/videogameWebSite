package Sapiens.Prototype;

import Sapiens.Prototype.Company.purchasedCompany;
import Sapiens.Prototype.Company.ownerCompany;
import Sapiens.Singleton;

import java.util.ArrayList;
import java.util.List;

public class testPrototype {
    public static void main(String[] args) {
        purchasedCompany CompanyPurchased = new purchasedCompany();
        //info purchase
        CompanyPurchased.idOwner = 1;
        CompanyPurchased.owner = "Microsoft Game Studios";
        //company info
        CompanyPurchased.name = "Just Add Monsters";
        CompanyPurchased.idCompany = 265;
        CompanyPurchased.description = "su primer juego fue Kung Fu Panic en Japón";
        CompanyPurchased.yearCreation = 2000;
        //add id games created
        List<Integer> games = new ArrayList<Integer>();
        games.add(56);
        games.add(3);
        CompanyPurchased.idGamesCreated = games;
//initializing owner company
        ownerCompany CompanyOwnwer= new ownerCompany();
        CompanyOwnwer.idCompany=1;
        CompanyOwnwer.name="Microsoft Game Studios";
        CompanyOwnwer.description="desarrolla y publica videojuegos para ordenadores basados en el sistemas operativos Windows";
        CompanyOwnwer.yearCreation=2001;
        //add id games created
        List<Integer> games2 = new ArrayList<Integer>();
        games2.add(36);
        games2.add(32);
        //add id games created
        List<Integer> company = new ArrayList<Integer>();
        company.add(265);
        CompanyOwnwer.idCompanyPurchased=company;
        CompanyOwnwer.idGamesCreated=games2;


        //simulating dividing the purchased company to specialize each company
        //Just a Monsters for mobile games and ninja theory for xbox games
        purchasedCompany version2Company = (purchasedCompany) CompanyPurchased.clone();
        //change data
        version2Company.name="ninja theory";
        version2Company.idCompany=266;
        //adding new company
        CompanyOwnwer.idCompanyPurchased.add(266);
        System.out.println(CompanyPurchased.name+", "+CompanyPurchased.description);
        System.out.println(version2Company.name + ", " + version2Company.description);
        System.out.println(CompanyOwnwer.name + " " +CompanyOwnwer.idCompanyPurchased );



    }
    }
