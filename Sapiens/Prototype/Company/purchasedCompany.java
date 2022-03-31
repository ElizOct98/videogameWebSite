package Sapiens.Prototype.Company;

public class purchasedCompany extends prototypeCompany{
    public String owner;
    public int idOwner;

    public purchasedCompany(){}

    public purchasedCompany(purchasedCompany entry){
        //adding new variables to company prototype
        super(entry);
        this.owner=entry.owner;
        this.idOwner=entry.idOwner;
    }

    @Override
    public prototypeCompany clone() {
        //return new company
        return new purchasedCompany(this);
    }
}
