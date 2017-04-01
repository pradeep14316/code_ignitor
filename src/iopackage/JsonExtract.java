package iopackage;

import java.io.*;
import org.json.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonExtract {
	private static String jsonfile = "/home/pradeep/Downloads/got.json";

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileReader in = new FileReader(jsonfile);
			JsonObject jsonObject = (JsonObject) new JsonParser().parse(in);
			long ID = (long) jsonObject.get("id");
			String URL = (String) jsonObject.get("url");
			System.out.println(ID + "," + URL);

			JsonArray lang = (JsonArray) jsonObject.get("episodes");
			for (int i = 0; i < lang.size(); i++) {
				System.out.println("Episodes DataArray :" + lang.get(i) + "\n");
			}
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
