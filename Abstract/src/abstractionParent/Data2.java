package abstractionParent;

public class Data2 extends Data1 {

	@Override
	public void empId() {
		System.out.println("my name is kavin");
	}

	public static void main(String[] args) {
		Data2 d2 = new Data2();
		d2.empId();
	}

}
