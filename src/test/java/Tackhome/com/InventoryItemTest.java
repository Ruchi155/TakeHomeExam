package Tackhome.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InventoryItemTest
{	
	InventoryItem Itemtotest;

	@Before
	public void setUp() throws Exception 
	{
		Itemtotest=new InventoryItem();
	}

	@After
	public void tearDown() throws Exception 
	{
	}
	@Test
	public void getnametest() 
	{
		Itemtotest.InventoryItem("Grocery", 50, "Vegetables", 50);
		assertEquals("Vegetables",Itemtotest.getName());
	}
	@Test
	public void gettypetest() 
	{
		Itemtotest.InventoryItem("Grocery", 50, "Fruits",25);
		assertEquals("Grocery",Itemtotest.getType());
	}
	@Test
	public void getWeighttest() 
	{
		Itemtotest.InventoryItem("Grocery", 50, "Fruits",25);
		assertEquals(50,Itemtotest.getWeight());
	}
	@Test
	public void getcounttest() 
	{
		Itemtotest.InventoryItem("Chocolate", 50, "Candies", 50);		
		assertEquals(50,Itemtotest.getCount());
	}
}
