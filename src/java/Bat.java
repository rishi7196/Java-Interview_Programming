package java;

public class Bat implements Animal,Bird {

	@Override
	public void eat() {
		System.out.println("bats reats insects");
		
	}

	@Override
	public void fly() {
		System.out.println("bats fly");
		
	}


}
