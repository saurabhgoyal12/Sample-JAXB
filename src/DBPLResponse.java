import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class DBPLResponse {
	DBPLResponseHeader header;
	private DBPLResponseDetail detail;

	public DBPLResponseHeader getHeader() {
		return header;
	}

	public void setHeader(DBPLResponseHeader header) {
		this.header = header;
	}

	public DBPLResponseDetail getDetail() {
		return detail;
	}

	public void setDetail(DBPLResponseDetail detail) {
		this.detail = detail;
	}
	
}
