package Tackhome.com;

public interface states 
{
	public void serviceDisabled();
	
	public void serviceEnabled();
	
	public void goodhealthCheck();
	
	public void badhealthCheck();
	
	public void healthCheckTimedOut();

}
