package week3_backlogs;

public class OOps {
	private String Userid;
	private String Movieid;
	private int Rating;
	private int timestamp;

	public String getUserid() {
		return Userid;
	}

	public String getMovieid() {
		return Movieid;
	}

	public int getRating() {
		return Rating;
	}

	public int gettimestamp() {

		return timestamp;
	}

	public void setUserid(String newUserid) {
		Userid = newUserid;;
	}

	public void setMovieid(String newMovieid) {
		Movieid = newMovieid;
	}

	public void setRating(int newRating) {
		Rating = newRating;
	}

	public void settimestamp(int newtimestamp) {
		timestamp = newtimestamp;
	}
}
