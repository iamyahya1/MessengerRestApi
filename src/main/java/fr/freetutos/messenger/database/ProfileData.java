package fr.freetutos.messenger.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import fr.freetutos.messenger.model.Profile;

public class ProfileData {
	
	private static Map<String, Profile> profiles = new HashMap<>();
	
	static {
		profiles.put("user1", new Profile(1L, "user1", "fn_user1", "ln_user1", new Date()));
		profiles.put("user2", new Profile(2L, "user2", "fn_user2", "ln_user2", new Date()));
		profiles.put("yahya", new Profile(3L, "yahya", "yahya", "nouali", new Date()));
	}

	public Map<String, Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(Map<String, Profile> profiles) {
		ProfileData.profiles = profiles;
	}
	
	

}
