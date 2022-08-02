package interfase;

public class Class3 implements Class1, Class2 {
	
	@Override
	public void myName() {
		System.out.println("My name is - kavin");
	}
	@Override
	public void myId() {
		System.out.println("my Id is - 555");
	}
	@Override
	public void myGrade() {
		System.out.println("my Grade is - S");
	}
	@Override
	public void myGender() {
		System.out.println("my Gender is - Male");
	}
	public static void main(String[] args) {
		Class3 cls = new Class3();
		cls.myName();
		cls.myId();
		cls.myGrade();
		cls.myGender();
		
	}
}
