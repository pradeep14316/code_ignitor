
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.DocumentBuilder;
	import org.w3c.dom.Document;
	import org.w3c.dom.NodeList;
	import org.w3c.dom.Node;
	import org.w3c.dom.Element;
	import java.io.File;

	public class xml {

	  public static void main(String argv[]) {

	    try {

		File fXmlFile = new File("/home/pradeep/Downloads/ebay.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);

		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("listing");

		System.out.println("----------------------------");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);

			System.out.println("\nCurrent Element :" + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				System.out.println("Seller_info : " + eElement.getAttribute("seller_info"));
				System.out.println("seller_name : " + eElement.getElementsByTagName("seller_name").item(0).getTextContent());
				System.out.println("seller_rating: " + eElement.getElementsByTagName("seller_rating").item(0).getTextContent());
				System.out.println("payment_types : " + eElement.getAttribute("payment_types"));
				System.out.println("shipping_info : " + eElement.getAttribute("shipping_info"));
				System.out.println("buyer_protection_info : " + eElement.getElementsByTagName("buyer_protection_info"));
				System.out.println("auction_info : " + eElement.getAttribute("auction_info"));
				System.out.println("current_bid : " + eElement.getElementsByTagName("current_bid"));
				System.out.println("time_left : " + eElement.getElementsByTagName("time_left"));
				System.out.println("high_bidder : " + eElement.getAttribute("high_bidder"));
				System.out.println("num_items : " + eElement.getElementsByTagName("num_items"));
				System.out.println("num_bids  : " + eElement.getElementsByTagName("num_bids "));
				System.out.println("started_at : " + eElement.getElementsByTagName("started_at"));
				System.out.println("bid_increment : " + eElement.getElementsByTagName("bid_increment"));
				
				
				
				System.out.println("location : " + eElement.getElementsByTagName("location"));
				System.out.println("opened : " + eElement.getElementsByTagName("opened"));
				System.out.println("closed : " + eElement.getElementsByTagName("closed"));
				System.out.println("id_num : " + eElement.getElementsByTagName("id_num"));
				System.out.println("notes : " + eElement.getElementsByTagName("notes"));
				System.out.println("bid_history : " + eElement.getAttribute("bid_history"));
				
				System.out.println("highest_bid_amount : " + eElement.getElementsByTagName("highest_bid_amount"));
				System.out.println("quantity : " + eElement.getElementsByTagName("quantity"));
System.out.println("item_info : " + eElement.getAttribute("item_info"));
				
System.out.println("memory : " + eElement.getElementsByTagName("memory"));
System.out.println("hard_drive : " + eElement.getElementsByTagName("hard_drive"));
System.out.println("cpu : " + eElement.getElementsByTagName("cpu"));
System.out.println("brand : " + eElement.getElementsByTagName("brand"));

				
				System.out.println("description : " + eElement.getAttribute("description"));
				
				}
		}
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	  }

	}
