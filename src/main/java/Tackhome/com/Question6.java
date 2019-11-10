package Tackhome.com;

import java.util.Random;

public class Question6 
{
	public static void main(String[] args) 
	{
		CommandInvoker c1=new CommandInvoker();
		Player p1=new Player();
		//p1.MoveXcoordination();
		//p1.MoveYcoordination();
		Random ran= new Random();
		for(int i=1;i<=50;i++)
		{
			int n1=ran.nextInt(4)+1;
			if(n1==1)
			{
				c1.MoveNorth();
			}
			
			if(n1==2)
			{
				c1.MoveEast();
			}
			if(n1==3)
			{
				c1.MoveSouth();
			}
			if(n1==4)
			{
				c1.MoveWest();
			}
		}	
	
	}

}
