package Tackhome.com;

public class ready implements states
{
	LoadBalancer loadbalancer;
	public ready(LoadBalancer loadbalancer) {
		this.loadbalancer = loadbalancer;
	}

	@Override
	public void serviceDisabled() {
		System.out.println("* Service changed to disabled *");
		loadbalancer.setState(loadbalancer.disabled);
	}

	@Override
	public void serviceEnabled() {
		System.out.println("Cannot perform this task, the Service is already enabled!");
	}

	@Override
	public void goodhealthCheck() {
		System.out.println("Cannot perform this task, the Service is already in good Health!");
	}

	@Override
	public void badhealthCheck() {
		System.out.println("* Service changed to down *");
		loadbalancer.setState(loadbalancer.down);
	}

	@Override
	public void healthCheckTimedOut() {
		System.out.println("* Service changed to unknown *");
		loadbalancer.setState(loadbalancer.unknown);
	}

}
