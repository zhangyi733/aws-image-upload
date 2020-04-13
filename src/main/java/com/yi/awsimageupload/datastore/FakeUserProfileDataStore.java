package com.yi.awsimageupload.datastore;

import com.yi.awsimageupload.profile.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("5cadb707-8397-4035-b6c6-da81ec443675"), "yi", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("dbe022cd-4e08-4c98-b70e-550cb4d6672e"), "shanshan", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
