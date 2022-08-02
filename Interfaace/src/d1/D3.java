package d1;

public class D3 implements D1, D2 {

	@Override
	public void stuPhone() {
		System.out.println("Student Phone is - 9597909738");
	}

	@Override
	public void stuPercentage() {
		System.out.println("Student Percentage is - 9.9");
	}

	@Override
	public void stuName() {
		System.out.println("Student Name is - Kavin");

	}

	@Override
	public void stuId() {
		System.out.println("Student Id is - 0095");

	}

	public static void main(String[] args) {
		D3 d = new D3();
		d.stuPhone();
		d.stuPercentage();
		d.stuName();
		d.stuId();
	}

}
