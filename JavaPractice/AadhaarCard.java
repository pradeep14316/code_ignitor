package JavaPractice;

public class AadhaarCard {
	String LastName=null;
	int Eid=0;
	Long MobileNumber=0l;
	String DOB=null;

	void aadhar(String LastName, String DOB) {

		if (LastName == this.LastName && DOB == this.DOB) {
			Eid = 45667558;
			MobileNumber = 9400258421l;
			DOB = "27051993";
			LastName = "vangala";
			System.out.println("Eid= " + Eid + "MobileNumber=" + MobileNumber
					+ "DOB=" + DOB + "LastName=" + LastName);
		} else {
			System.out.println("search NotFound");
		}
	}

	void aadhar(Long MobileNumber, int Eid) {

		if (MobileNumber == this.MobileNumber && Eid == this.Eid) {
			Eid = 45667558;
			MobileNumber = 9400258421l;
			DOB = "27051993";
			LastName = "vangala";
			System.out.println("Eid= " + Eid + "MobileNumber=" + MobileNumber
					+ "DOB=" + DOB + "LastName=" + LastName);

		} else {
			System.out.println("search NotFound");
		}
	}

	public static void main(String[] args) {
		AadhaarCard card = new AadhaarCard();
		card.aadhar("vangala", "27051993");
		card.aadhar(9440258421l, 45667558);
	}
}
