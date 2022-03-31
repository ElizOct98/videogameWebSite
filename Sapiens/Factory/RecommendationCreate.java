package Sapiens.Factory;

import Sapiens.Profile.listInterface;
import Sapiens.Profile.RecommendationProfile;

public class RecommendationCreate extends createEntry {
    @Override
    public listInterface entrada() {
        return new RecommendationProfile();
    }
}
