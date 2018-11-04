package pe.edu.unmsm.fisi.upg.ads.dirtycode.domain;

public class Session {
	private String title;
          public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
        
	private String description;
          public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
        
	private boolean approved;
          public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public Session(String title, String description) {
		this.title = title;
		this.description = description;
	}
}