package Tackhome.com;

public class ExamQ3Interface 
{

	public static void main(String[] args) 
	{
		BakedGoods[] goods = null;
		goods[0]=new Cookie();
		goods[1]=new CinnamonRoll();
		goods[2]=new Brownie();
		
		for(int i=0;i<3;i++)
		{
			goods[i].getPrice();
			//good[i].getDescription();
			//good[i].getSellByDate();
		}
		
	}

}
