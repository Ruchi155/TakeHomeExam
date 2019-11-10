package Tackhome.com;

public class down implements states
{
	LoadBalancer loadbalancer;
	public down(LoadBalancer loadbalancer) {
		this.loadbalancer = loadbalancer;
	}
	
	@Override
	public void serviceDisabled() {
		System.out.println("Cannot perform this task, the Service in Down!");
	}

	@Override
	public void serviceEnabled() {
		System.out.println("Cannot perform this task, the Service in already Enabled!");
	}

	@Override
	public void goodhealthCheck() {
		System.out.println("* Service changed to ready *");
		loadbalancer.setState(loadbalancer.ready);
	}

	@Override
	public void badhealthCheck() {
		System.out.println("Cannot perform this task, the Service in bad Health or might have been timed out!");
	}

	@Override
	public void healthCheckTimedOut() {
		System.out.println("Cannot perform this task, the Service in bad Health or might have been timed out!");
	}


}
