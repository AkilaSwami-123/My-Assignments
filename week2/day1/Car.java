package week2.day1;

public class Car {

	public void applyBrake()
	{
		System.out.println("Brake applied");
	}
	public  void soundHorn()
	{
		System.out.println("Honked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		c.applyBrake();
		c.soundHorn();
	}

}
