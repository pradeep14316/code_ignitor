


import java.util.List;

import com.google.gson.Gson;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import movie.Movie;


public class MovieDataConvJsonCsv 
{
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = "USERID,MOVIEID,RATING,JUNK,TIMESTAMP";
	
	public static void writeCSV() throws IOException, JAXBException{
		ArrayList<Movie> data = new ArrayList<Movie>();
		BufferedReader inFile = new BufferedReader(new FileReader("/home/manoj/Desktop/Vote.txt"));
		String inputLine;
		while ( (inputLine = inFile.readLine() ) != null) // read one line at a time
		{ 
			Movie movieData = new Movie();
			//data.add(new MovieData(input[0], input[1], input[2], input[3]);
		    
			String[] input = inputLine.split("\t"); // split into a string array by tab space.
			movieData.setUserid(Integer.parseInt(input[0]));
		    movieData.setMovieid(Integer.parseInt(input[1]));
		    movieData.setRating(Double.parseDouble(input[2]));
		    movieData.setJunk(Double.parseDouble(input[3]));
		    movieData.setTimestamp(input[4]);
//		    String timestamp=input[3];
		    
		        data.add(movieData);
		}
		inFile.close();
		
		//WRITING IT TO .CSV FORMAT
		
		FileWriter fileWriter = null;
		
		fileWriter = new FileWriter(new File("/home/manoj/Desktop/movieData.csv"));

		fileWriter.append(FILE_HEADER.toString());
		fileWriter.append(NEW_LINE_SEPARATOR);
		
		for (Movie s : data){
			fileWriter.append("\"" + s.getUserid() + "\"");
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append("\"" +s.getMovieid()+"\"");
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append("\"" +s.getRating()+"\"");
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append("\"" +s.getJunk()+"\"");
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append("\"" +s.getTimestamp()+"\"");
			fileWriter.append(NEW_LINE_SEPARATOR);
			
		}
		fileWriter.close();
		
		//Converting in to JSON Format 
		
		FileWriter fileWriter1 = null;
		fileWriter1 = new FileWriter(new File("/home/manoj/Desktop/movieData.csv"));
					
		 Gson gson = new Gson();
		 StringBuilder sb = new StringBuilder();
		 for(Movie d: data) {
     sb.append(gson.toJson(d));
	        fileWriter1.append(sb.toString());
	        fileWriter1.append(NEW_LINE_SEPARATOR);
	    }
		fileWriter1.close();
	  }
	
	public static void main(String[] args) throws NumberFormatException, IOException, JAXBException
	{
		MovieDataInJsonAndCSV.writeCSV();


}}
