package Tackhome.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class user 
{
	static int input;
	static Scanner scanner;
	static LoadBalancer loadbalancer;
	public static void main(String[] args) {
		loadbalancer = new LoadBalancer();
		scanner = new Scanner(System.in);
		printOption();
	}
	
	public static void options() {
		try {
			input = scanner.nextInt();
		}
		catch(InputMismatchException InputMismatchException) {
			System.out.println("Wrong input type");
		}
		
		switch(input) {
			case 1: loadbalancer.goodhealthCheck();
				break;
			case 2: loadbalancer.healthCheckTimedOut();
				break;
			case 3: loadbalancer.badhealthCheck();
				break;
			case 4: loadbalancer.serviceDisabled();
				break;
			case 5: loadbalancer.serviceEnabled();
				break;
			default: System.out.println("No such number exist");
				break;
		}
		printOption();
	}
	
	public static void printOption() {
		System.out.println("1 = if health check is good, " + "2 = time out health check, "
				+ "3 = if health check is bad, " + "\n" + "4 = to disable services, " + 
				"5 = to enable services");	
		System.out.println("Current State: " + loadbalancer.getState());
		System.out.print("Input > ");
		options();
	}
	

}
