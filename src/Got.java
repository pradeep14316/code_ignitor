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

public class Got {

	public static void main(String[] args) {
		Gson gson = new Gson();
		String header = "id,name,url,season,number,runtime,summary";
		StringBuilder sbr = new StringBuilder();
		sbr.append(header);
		sbr.append("\n");
		JsonParser parser = new JsonParser();
		int count = 0;

		try {
			JsonElement jElement = parser.parse(new FileReader(new File(
					"/home/pradeep/Downloads/got.json")));
			JsonObject jObject = jElement.getAsJsonObject();

			JsonObject embedded = jObject.get("_embedded").getAsJsonObject();
			JsonArray episodes = embedded.get("episodes").getAsJsonArray();

			for (JsonElement episode : episodes) {
				JsonObject jEpisode = episode.getAsJsonObject();
				count++;

				sbr.append(jEpisode.get("id").getAsString() + ","
						+ jEpisode.get("name").getAsString() + ","
						+ jEpisode.get("url").getAsString() + ","
						+ jEpisode.get("season").getAsString() + ","
						+ jEpisode.get("number").getAsString() + ","
						+ jEpisode.get("runtime").getAsString() + ","
						+ jEpisode.get("summary").toString());

				sbr.append("\n");
			}

			System.out.println("Number of Episodes: "+count);
			FileWriter writer = new FileWriter(new File(
					"/home/pradeep/Downloads/got_episodes.csv"));
			writer.write(sbr.toString());
			writer.close();
			System.out.println("****************" + episodes.size());
			System.out.println(embedded);
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}