package pe.edu.unmsm.fisi.upg.ads.dirtycode.domain;

public class WebBrowser {
	private BrowserName name;{
         String name; 
         int majorVersion; 
	 this.name = TranslateStringToBrowserName(name);
	 this.majorVersion = majorVersion;
	}
         
         public enum BrowserName {
		Unknown, InternetExplorer, Firefox, Chrome, Opera, Safari, Dolphin, Konqueror, Linx
	}

	public BrowserName getName() {
		return name;
	}

	public void setName(BrowserName name) {
		this.name = name;
	} 
        private BrowserName TranslateStringToBrowserName(String name) {
		if (name.contains("IE")) {
			return BrowserName.InternetExplorer;
		}
                return BrowserName.Unknown;

}
	private int majorVersion; {
         int majorVersion;
	 this.majorVersion = majorVersion;
	}
         public int getMajorVersion() {
		return majorVersion;
	}

	
     }
