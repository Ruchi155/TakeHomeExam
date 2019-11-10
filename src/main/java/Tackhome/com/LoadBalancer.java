package Tackhome.com;

public class LoadBalancer 
{
	states disabled;
	states unknown;
	states ready;
	states down;
	
	states currentstate;
	public LoadBalancer(){
		disabled = new disabled(this);
		unknown = new unknown(this);
		ready = new ready(this);
		down = new down(this);
		currentstate = unknown;
	}
	
	public void serviceDisabled() {
		currentstate.serviceDisabled();
	}
 
	public void serviceEnabled() {
		currentstate.serviceEnabled();
	}
 
	public void goodhealthCheck() {
		currentstate.goodhealthCheck();
	}
 
	public void badhealthCheck() {
		currentstate.badhealthCheck();
	}
	
	public void healthCheckTimedOut() {
		currentstate.healthCheckTimedOut();
	}
 
	void setState(states state) {
		this.currentstate = state;
	}
    public String getState() {
        return currentstate.getClass().getSimpleName();
    }    

}
