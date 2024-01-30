package week2.day2;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2,5,7,7,5,9,2,3};
		Arrays.sort(data);
		for(int i=0;i<data.length-1;i++)
		{
			if(data[i]==data[i+1])
				System.out.println("Duplicate number"+ data[i]);
		}
		}
			
		

	}


