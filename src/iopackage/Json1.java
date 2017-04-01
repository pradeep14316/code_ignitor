package iopackage;




	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	import com.google.gson.Gson;
	import com.google.gson.JsonArray;
	import com.google.gson.JsonElement;
	import com.google.gson.JsonIOException;
	import com.google.gson.JsonObject;
	import com.google.gson.JsonParser;
	import com.google.gson.JsonSyntaxException;

	public class Json1 {

		public static void main(String[] args) {
			Gson gson = new Gson();
			String header = "id,name,url,season,number,runtime";
			StringBuilder sbr = new StringBuilder();
			sbr.append(header);
			sbr.append("\n");
			JsonParser parser = new JsonParser();
			
			
			try {
				JsonElement jElement = parser.parse(new FileReader(new File("/home/pradeep/Downloads/got.json")));
				JsonObject jObject = jElement.getAsJsonObject();
				JsonObject embedded = jObject.get("_embedded").getAsJsonObject();
				JsonArray episodes = embedded.get("episodes").getAsJsonArray();
				for (JsonElement episode : episodes) {
					JsonObject jEpisode = episode.getAsJsonObject();
					System.out.println(jEpisode.get("id").getAsString() + "," + jEpisode.get("name").getAsString() + ","
							+ jEpisode.get("url").getAsString() + "," + jEpisode.get("season").getAsString() + ","
							+ jEpisode.get("number").getAsString() + "," + jEpisode.get("runtime").getAsString());
					sbr.append(jEpisode.get("id").getAsString() + "," + jEpisode.get("name").getAsString() + ","
							+ jEpisode.get("url").getAsString() + "," + jEpisode.get("season").getAsString() + ","
							+ jEpisode.get("number").getAsString() + "," + jEpisode.get("runtime").getAsString());
					sbr.append("\n");
				}
				FileWriter writer = new FileWriter(new File("xyz.txt"));
				writer.write(sbr.toString());
				writer.close();
				System.out.println("****************" + episodes.size());
				System.out.println(embedded);
			} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
								e.printStackTrace();
			}

		}

	}
