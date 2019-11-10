package Tackhome.com;

public class CommandInvokerController implements Commandinterface 
{
	private CommandInvoker Inv;

	public static final String MoveNorth="MoveNorth";
	public static final String MoveEast="MoveEast";
	public static final String MoveSouth="MoveSouth";
	public static final String MoveWest="MoveWest";
	
	
	public  CommandInvokerController() 
	{
		this.Inv=new CommandInvoker();
	}
	@Override
	public void execute(String command)
	{
		switch(command) 
		{
			case MoveNorth:
				Inv.MoveNorth();
				break;
			case MoveEast:
				Inv.MoveEast();	
				break;
			case MoveSouth:
				Inv.MoveSouth();
				break;
			case MoveWest:
				Inv.MoveWest();
				break;
			default:
			System.out.println("Sorry i didn't get commandInvokercommand ");
			break;
		}
	}
	@Override
	public boolean undo(String command)
	{
		if(command.equals(MoveNorth)||
				command.equals(MoveEast)||
				command.equals(MoveSouth)||
				command.equals(MoveWest)) {
			return true;
		}
		return false;
	}
}