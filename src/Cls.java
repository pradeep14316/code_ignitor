
import java.util.Map;

import com.google.gson.JsonParser;



public class Cls {
	public static void main(String[] args) {
		String input=("/home/pradeep/Downloads/got.json");
	try{
	JsonParser jsonParser = new JsonParser();
	Map<String, Object> map = (Map<String, Object>) jsonParser.parse(input);
	map.get("id");
	
	System.out.println(map);
	
	}catch(Exception e){System.out.println(e);}}
}