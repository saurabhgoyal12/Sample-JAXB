import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="detail")
public class DBPLResponseDetail {
	private String activationCode;

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}
	
	
}
