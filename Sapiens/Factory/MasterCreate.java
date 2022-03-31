package Sapiens.Factory;

import Sapiens.Profile.listInterface;
import Sapiens.Profile.MasterProfile;



public class MasterCreate extends createEntry {
    @Override
    public listInterface entrada() {
        return new MasterProfile( );
    }


}
