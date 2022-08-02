package genders;

public class Boy extends Girl {
	@Override
	public void girlName() {
		super.girlName();
		}

	public static void main(String[] args) {
		Boy b = new Boy();
		b.girlName();
		b.girlAddress();
		b.girlPhone();
	
		System.out.println("boy name is kavin");

	}
}
