package Sapiens;

public final class Singleton {
    private static Singleton activeUser;
    public String email;
    public int idUser;

    //initialize the email of the active user when log in
    private Singleton(String email,int idUser) {
        this.email = email;
        this.idUser=idUser;
    }

    public static boolean getActiveUser(String email, int idUser ) {
        //if there isn't an active user, create one
        if (activeUser == null) {
            activeUser = new Singleton(email, idUser);
            System.out.println(activeUser.email);
            return true;
        }
        //if there is one user log in return error and active user
        else {
            System.out.println("There is an user log in");
            System.out.println(activeUser.email);
            return false;

        }

    }

    public static void logOut(){
        activeUser=null;
    }
}
