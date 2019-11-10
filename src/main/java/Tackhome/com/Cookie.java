package Tackhome.com;

public class Cookie implements BakedGoods 
{

	public int getPrice() 
	{
		int price = 10;
		//System.out.println("The getprice for Doublechocolatechunk cookie is:" +price);
		return price;
	}

	public String getDescription() 
	{
		System.out.println("This cookie is double the fun with chunks of smooth chocolate inside a soft chocklate cookie");
		return null;
	}

	public String getSellByDate() 
	{
		System.out.println("Date is:9/15/2000");
		return null;
	}

}
