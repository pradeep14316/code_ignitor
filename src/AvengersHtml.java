//import java.io.IOException;
//
//import javax.swing.text.html.parser.Element;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;
//
//public class FirstJsoupExample {
//	public static void main(String[] args) throws IOException {
//		Document doc = Jsoup.connect("http://www.javatpoint.com").get();
////		String title = doc.title();
////		System.out.println("title is: " + title);
//
//		Elements links = doc.select("a[href]");
//		for (org.jsoup.nodes.Element link : links) {
//			System.out.println("\nlinks:" + links);
//			System.out.println("text : " + link.text());
//
//		}
//	}
//}

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AvengersHtml {
	public static void main(String[] args) throws IOException {
		int count = 0;
		Document doc = Jsoup.connect("http://www.imdb.com/title/tt0848228/")
				.timeout(6000).get();
		String title = doc.title();
		System.out.println("Movie Name: " + title);
		Elements titles = doc.getElementsByClass("cast_list");
		for (Element element : titles) {
			List<Element> string = element.getElementsByTag("table");
			System.out.println("\n" + string.get(0).text() + "\n");
		}

		// Movie Description,Rating and keywords
		String description = doc.select("meta[name=description]").get(0)
				.attr("content");
		System.out.println("\nMovie description : " + description);
		String keywords = doc.select("meta[name=keywords]").first()
				.attr("content");
		System.out.println("\nMeta keywords : " + keywords);
		Elements ratings = doc.getElementsByClass("ratingValue");
		System.out.println("\nRatings:" + ratings.get(0).text() + "\n");

		// Image Sources and its attributes src,height,width,alt.
		Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
		for (Element image : images) {
			System.out.println("src : " + image.attr("src"));
			System.out.println("height : " + image.attr("height"));
			System.out.println("width : " + image.attr("width"));
			System.out.println("alt : " + image.attr("alt"));
			System.out.println(image.attr("title"));
		}

		Elements links = doc.select("a[href]");

		for (Element link : links) {
			System.out.println("\nlink : " + link.attr("href"));
			System.out.println("text : " + link.text());
			count++;
		}
		System.out.println("No: of Hyperlinks: " + count);
	}
}