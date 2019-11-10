package Tackhome.com;

public class Playercontroller implements Commandinterface
{
	private Player com;
	
	public static final String MoveXcoordination="MoveXcoordination";
	public static final String MoveYcoordination="MoveYcoordination";
	
	
	public  Playercontroller() 
	{
		this.com=new Player();
	}
	

	@Override
	public void execute(String command)
	{	
		switch(command) 
		{
			case MoveXcoordination:
				com.MoveXcoordination();
	
			case MoveYcoordination:
				com.MoveYcoordination();	
		}
	
	}

	@Override
	public boolean undo(String command)
	{
		if(command.equals(MoveXcoordination)||
				command.equals(MoveYcoordination))
			{
				return true;
			}
				return false;
	}
}
