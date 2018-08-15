package fr.freetutos.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.freetutos.messenger.model.Profile;
import fr.freetutos.messenger.service.ProfileService;
import fr.freetutos.messenger.service.ProfileServiceImpl;

@Path("/profiles")
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class ProfileResource {
	
	ProfileService profileService = new ProfileServiceImpl();
	
	@GET
	public List<Profile> getProfiles() {
		return profileService.getAllProfiles();
	}
	
	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam("profileName") String profileName) {
		return profileService.getProfile(profileName);
	}
	
	@POST
	public Profile createProfile(Profile profile) {
		return profileService.createProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile)  {
		return profileService.updateProfile(profileName, profile);		
	}
	
	@DELETE
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName") String profileName) {
		profileService.deleteProfile(profileName);
	}
	

}
