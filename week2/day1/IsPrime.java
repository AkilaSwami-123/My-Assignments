package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		int number=39;
		int chk=number/2;
		
		for(int i=2;i<=chk;i++)
		{
			if(number%i==0)
			{
				System.out.println("Is a Prime number");
							}
			else
				System.out.println(number + "Not a Prime Number");
			break;
		}
		
	}

}
