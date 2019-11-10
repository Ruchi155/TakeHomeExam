package Tackhome.com;

public class disabled implements states
{
	LoadBalancer loadbalancer;
	public disabled(LoadBalancer loadbalancer) {
		this.loadbalancer = loadbalancer;
	}

	@Override
	public void serviceDisabled() {
		System.out.println("Cannot perform this task, the Service is already disabled!");
	}

	@Override
	public void serviceEnabled() {
		System.out.println("* Service changed to unknown *");
		loadbalancer.setState(loadbalancer.unknown);
	}

	@Override
	public void goodhealthCheck() {
		System.out.println("Cannot perform this task, the Service is disabled!");
	}

	@Override
	public void badhealthCheck() {
		System.out.println("Cannot perform this task, the Service is disabled!");
	}

	@Override
	public void healthCheckTimedOut() {
		System.out.println("Cannot perform this task, the Service is disabled!");
	}

}
