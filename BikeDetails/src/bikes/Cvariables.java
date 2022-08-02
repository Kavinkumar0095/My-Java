package bikes;

public class Cvariables {

	// Class Variable

	int myId = 555;
	String myName = "Kavin";
	long myNum = 9597909738l;

	// Without variable value

	float myHeight;
	char myGrade;

	private void myId() {
		System.out.println(myId);
	}

	private void myName() {
		System.out.println(myName);
	}

	public static void main(String[] args) {
		Cvariables cv = new Cvariables();
		cv.myId();
		cv.myName();
		System.out.println(cv.myId);
		System.out.println(cv.myName);
		System.out.println(cv.myNum);
		System.out.println(cv.myHeight);
		System.out.println(cv.myGrade);

	}

}
