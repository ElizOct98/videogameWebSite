package Sapiens.Prototype.Company;

import java.util.List;

public class ownerCompany extends prototypeCompany{
    public List<Integer> idCompanyPurchased;

    public ownerCompany(){}

    public ownerCompany(ownerCompany entry){
        super(entry);
        this.idCompanyPurchased=entry.idCompanyPurchased;
    }

    @Override
    public prototypeCompany clone(){
        //return change name company
        return new ownerCompany(this);
    }

}
