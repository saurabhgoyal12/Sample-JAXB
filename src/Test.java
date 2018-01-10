import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int i = 1;
		HashMap<Integer, Integer> hm = new HashMap<>();
		System.out.println(i != hm.get(1));*/
		
		try {

			File file = new File("dbplresp.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(DBPLResponse.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DBPLResponse dbplResp = (DBPLResponse)jaxbUnmarshaller.unmarshal(file);
			System.out.println(dbplResp.getHeader().getRefId() + " " + dbplResp.getHeader().getStatusCode() + " " + dbplResp.getHeader().getStatusDesc());
			System.out.println(dbplResp.getDetail().getActivationCode());
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }

	}

}
