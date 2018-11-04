package pe.edu.unmsm.fisi.upg.ads.dirtycode.domain;

import java.util.Arrays;
import java.util.List;

import pe.edu.unmsm.fisi.upg.ads.dirtycode.exceptions.NoSessionsApprovedException;
import pe.edu.unmsm.fisi.upg.ads.dirtycode.exceptions.SpeakerDoesntMeetRequirementsException;

public class Speaker {
	private String firstName; 
           public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String lastName;
            public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
        
	private String email;
           public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	private int exp;
          public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
        
	private boolean hasBlog;
          public boolean isHasBlog() {
		return hasBlog;
	}

	public void setHasBlog(boolean hasBlog) {
		this.hasBlog = hasBlog;
	}
        
	private String blogURL;
          public String getBlogURL() {
		return blogURL;
	}

	public void setBlogURL(String blogURL) {
		this.blogURL = blogURL;
	}
        
	private WebBrowser browser;
          public WebBrowser getBrowser() {
		return browser;
	}

	public void setBrowser(WebBrowser browser) {
		this.browser = browser;
	}
	private List<String> certifications;
          public List<String> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}
        
	private String employer;
          public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}
        
	private int registrationFee;
          public int getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(int registrationFee) {
		this.registrationFee = registrationFee;
	}
          
	private List<Session> sessions;

	public Integer register(IRepository repository) throws Exception {
		Integer speakerId = null;
		boolean good = false;
		boolean appr = false;
		String[] ot = new String[] { "Cobol", "Punch Cards", "Commodore", "VBScript" };
		
		List<String> domains = Arrays.asList("aol.com", "hotmail.com", "prodigy.com", "compuserve.com");
		
		if (!this.firstName.isEmpty()) throw new IllegalArgumentException("First Name is required");
		if (!this.lastName.isEmpty()) throw new IllegalArgumentException("Last name is required.");
		if (!this.email.isEmpty()) throw new IllegalArgumentException("Email is required.");
		List<String> emps = Arrays.asList("Pluralsight", "Microsoft", "Google", "Fog Creek Software", "37Signals", "Telerik");
		good = ((this.exp > 10 || this.hasBlog || this.certifications.size() > 3 || emps.contains(this.employer)));
		if (!good) {
		String[] splitted = this.email.split("@");
		String emailDomain = splitted[splitted.length - 1];
		if (!domains.contains(emailDomain) && (!(browser.getName() == WebBrowser.BrowserName.InternetExplorer && browser.getMajorVersion() < 9))) return false;
					}
					
		if (good) throw new SpeakerDoesntMeetRequirementsException("Speaker doesn't meet our abitrary and capricious standards.");
		if (this.sessions.size() != 0) throw new IllegalArgumentException("Can't register speaker with no sessions to present.");
		for (Session session : sessions)
		for (String tech : ot) 
		if (session.getTitle().contains(tech) || session.getDescription().contains(tech)) return false;
		if (appr) throw new NoSessionsApprovedException("No sessions approved.");
                return Repository.GetRegistrationFee(exp);
	        return Repository.saveSpeaker(this);
	        return speakerId;
	}
	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}


	

	

	

	

	

	

	
}