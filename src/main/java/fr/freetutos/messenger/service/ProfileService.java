package fr.freetutos.messenger.service;

import java.util.List;

import fr.freetutos.messenger.model.Profile;

public interface ProfileService {

	Profile getProfile(String profileName);

	List<Profile> getAllProfiles();

	Profile createProfile(Profile profile);

	Profile updateProfile(String profileName, Profile profile);

	void deleteProfile(String profileName);

}
