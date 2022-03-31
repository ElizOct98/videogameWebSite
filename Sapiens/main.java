package Sapiens;

public class main {
    public static void main(String[] args) {
        boolean firstTRY = Singleton.getActiveUser("FIRST@email.com",1);
        boolean secondTRy = Singleton.getActiveUser("SECOND@email.com",2);
        Singleton.logOut();
        boolean thirdTRY = Singleton.getActiveUser("THIRD@email.com",3);
    }
}
