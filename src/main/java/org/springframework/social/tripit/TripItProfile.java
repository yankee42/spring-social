package org.springframework.social.tripit;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

/**
 * Model class containing a TripIt user's profile information.
 * 
 * @author Craig Walls
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("Profile")
public class TripItProfile {
	
	/**
	 * The TripIt user's profile ID
	 * 
	 * @return The TripIt user's profile ID
	 */
	public String getId() {
		return attributes.get("ref");
	}

	/**
	 * The TripIt user's screen name
	 * 
	 * @return The TripIt user's screen name
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * The TripIt user's display name
	 * 
	 * @return The TripIt user's display name
	 */
	public String getPublicDisplayName() {
		return publicDisplayName;
	}

	/**
	 * The TripIt user's home city
	 * 
	 * @return The TripIt user's home city
	 */
	public String getHomeCity() {
		return homeCity;
	}

	/**
	 * The company that the TripIt user works for
	 * 
	 * @return The company that the TripIt user works for
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * The URL to the user's profile page at TripIt
	 * 
	 * @return The URL to the user's profile page at TripIt
	 */
	public String getProfileUrl() {
		return "http://www.tripit.com/" + profilePath;
	}

	@JsonProperty("@attributes")
	private Map<String, String> attributes;

	@JsonProperty("screen_name")
	private String screenName;

	@JsonProperty("public_display_name")
	private String publicDisplayName;

	@JsonProperty("home_city")
	private String homeCity;

	@JsonProperty("company")
	private String company;

	@JsonProperty("profile_url")
	private String profilePath;
}