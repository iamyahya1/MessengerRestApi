package fr.freetutos.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.freetutos.messenger.database.ProfileData;
import fr.freetutos.messenger.model.Profile;

public class ProfileServiceImpl implements ProfileService {

	ProfileData profileData = new ProfileData();

	@Override
	public Profile getProfile(String profileName) {
		return profileData.getProfiles().get(profileName);
	}

	@Override
	public List<Profile> getAllProfiles() {
		List<Profile> profiles = new ArrayList<>(profileData.getProfiles().values());
		return profiles;
	}

	@Override
	public Profile createProfile(Profile profile) {
		Profile newProfile = new Profile();
		Map<String, Profile> actualProfiles = profileData.getProfiles();

		newProfile.setId(actualProfiles.size() + 1);
		newProfile.setProfileName(profile.getProfileName());
		newProfile.setFirstName(profile.getFirstName());
		newProfile.setLastName(profile.getLastName());
		newProfile.setCreated(profile.getCreated());

		actualProfiles.put(profile.getProfileName(), newProfile);

		return newProfile;
	}

	@Override
	public Profile updateProfile(String profileName, Profile profile) {

		for (Profile p : profileData.getProfiles().values()) {
			if (p.getProfileName().equals(profileName)) {

				p.setFirstName(profile.getFirstName());
				p.setLastName(profile.getLastName());
				p.setCreated(profile.getCreated());

				return p;
			}
		}
		return null;
	}

	@Override
	public void deleteProfile(String profileName) {
		profileData.getProfiles().remove(profileName);
	}

}
