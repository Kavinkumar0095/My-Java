package bikes;

public class MyDetails {

	// Class variables

	String myName = "Kavin";
	int myId = 555;
	long myNumber = 9597909738l;

	// without variable values

	float myHeight;
	char myGrade;

	public void myName() {
		System.out.println("myName");
	}

	public void myId() {
		System.out.println("myId");

	}

	public static void main(String[] args) {
		MyDetails MD = new MyDetails();
		MD.myName();
		MD.myId();
		System.out.println(MD.myName);
		System.out.println(MD.myId);
		System.out.println(MD.myNumber);
		System.out.println(MD.myHeight);
		System.out.println(MD.myGrade);
	}

}
