/**
 Question   3:   Write   a   console   application   (6   points) 
 Write a Java console application that sums up 10 random numbers.  
 The output produced has to be the random numbers produced,and the total.
 
 */


package Tackhome.com;

import java.util.Random;

public class Question3 
{
	public static void main(String[] args) 
	{
		Random no=new Random();
		int numbers;
		int sum=0;
		for(int counter=1;counter<=10;counter++)
		{
			numbers=no.nextInt(20);
			System.out.println(numbers  +" ");
			sum+=numbers;
		}

		System.out.println("Total is=" +sum);
	}
}
