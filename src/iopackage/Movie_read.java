package iopackage;
//movie data reading
import java.io.*;
import java.util.*;

import movie.Movie;

public class Movie_read {

	public static void main(String[] arg) throws IOException {
		double rate=1.0;
		ArrayList<Movie> data = new ArrayList<Movie>();
		Set<Integer> setdata = new HashSet<Integer>();
		Set<Integer> setdata1 = new HashSet<Integer>();
		LinkedList<Double> rating=new LinkedList<Double>();
		String inLine;
		BufferedReader inFile = new BufferedReader(new FileReader(
				"/home/pradeep/downloads/Vote.txt"));
		while ((inLine = inFile.readLine()) != null) {
			Movie movieT = new Movie();
			String[] input = inLine.split("\t");
			movieT.setUserid(Integer.parseInt(input[0]));
			movieT.setMovieid(Integer.parseInt(input[1]));
			movieT.setRating(Double.parseDouble(input[2]));
			movieT.setTimestamp(input[4]);
			data.add(movieT);

		}
		inFile.close();

		for (Movie a : data) {
			setdata.add(a.getUserid());
			setdata1.add(a.getMovieid());
			rating.add(a.getRating());
			while(rating.equals(rate)){
				
				System.out.println("movie"+a.getMovieid());
			}
		}

		System.out.println("unique users =" + setdata.size());
		System.out.println("unique movies =" + setdata1.size());
		

	}

}










/*
HashMap<Object,Object> hash = new HashMap<Object,Object>();
hash.put(a.getMovieid(),a.getRating());
for (Map.Entry<Object, Object> entry : hash.entrySet()) {
{
		
	}//System.out.println(entry.getKey() + ":" + entry.getValue());
	
}
//	Set<Map.Entry<,>> entrySet()

*/	
