package bikes;

public class BikeName {

	public void bikeNumber(int Number) {
		System.out.println("enter your bike number:" + Number);
	}

	public void bikeEngine(long Engine) {

		System.out.println("enter your Engine:" + Engine);
	}

	public void bikeHighspeed(char Highspeed) {
		System.out.println("enter you Highspeed:" + Highspeed);

	}

	public void bikeRating(float Rating) {
		System.out.println("enter your Rating:" + Rating);

	}

	public void bikeName(String Name) {

		System.out.println("enter your Name:" + Name);
	}

	public static void main(String[] args) {
		BikeName BK = new BikeName();
		BK.bikeNumber(1487);
		BK.bikeEngine(1234567890L);
		BK.bikeHighspeed('T');
		BK.bikeRating(9.9F);
		BK.bikeName("ZX10R");

		System.out.println();
	}
}
