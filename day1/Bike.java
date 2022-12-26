package week1.day1;

public class Bike {
	public void start() {
		System.out.println("Bike started");
	}
	public void horn() {
		System.out.println("horn is applied");
	}

	public static void main(String[] args) {
		Bike bk=new Bike();
		Car cr=new Car();
		bk.start();
		bk.horn();
		cr.applyBreak();
		cr.soundHorn();

	}

}
