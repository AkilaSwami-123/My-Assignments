package week2.day1;

public class Mobile {

	public void makeCall()
	{
		String mobileModel = "Samsung";
		float mobileWeight = 165.5f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void sendMsg()
	{
		System.out.println("This is my mobile");
	}

	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();

	}

}
