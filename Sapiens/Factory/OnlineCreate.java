package Sapiens.Factory;
import Sapiens.Profile.listInterface;
import Sapiens.Profile.OnlineProfile;

public class OnlineCreate extends createEntry {
    @Override
    public listInterface entrada() {
        return new OnlineProfile();
    }
}
