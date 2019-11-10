package Tackhome.com;

public class unknown implements states
{
LoadBalancer loadbalancer;
	
	public unknown(LoadBalancer loadbalancer) {
		this.loadbalancer = loadbalancer;
	}
	
	@Override
	public void serviceDisabled() {
		System.out.println("Cannot perform this task, the Service isn't ready!");
	}

	@Override
	public void serviceEnabled() {
		System.out.println("Cannot perform this task, the Service is already enabled!");
	}

	@Override
	public void goodhealthCheck() {
		System.out.println("* Service changed to ready *");
		loadbalancer.setState(loadbalancer.ready);
	}

	@Override
	public void badhealthCheck() {
		System.out.println("* Service changed to down *");
		loadbalancer.setState(loadbalancer.down);
	}

	@Override
	public void healthCheckTimedOut() {
		System.out.println("* Service changed to down *");
		loadbalancer.setState(loadbalancer.down);
	}

}
