package movie;

public class Movie {
		private int Userid;
		private int Movieid;
		private double Rating;
		private String timestamp;
		public int getUserid() {
			return Userid;
		}
		public void setUserid(int userid) {
			Userid = userid;
		}
		public int getMovieid() {
			return Movieid;
		}
		public void setMovieid(int movieid) {
			Movieid = movieid;
		}
		public double getRating() {
			return Rating;
		}
		public void setRating(double rating) {
			Rating = rating;
		}
		public String getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
		public void setJunk(double parseDouble) {
			// TODO Auto-generated method stub
			
		}
		public String getJunk() {
			// TODO Auto-generated method stub
			return null;
		}

		
}
