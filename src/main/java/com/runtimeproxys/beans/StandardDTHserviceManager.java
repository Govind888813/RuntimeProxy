package com.runtimeproxys.beans;

public class StandardDTHserviceManager implements DTHServiceManager {

	public String troubShoot(String customerId) {
		// TODO Auto-generated method stub
		System.out.println("Customer Id :"+customerId);
		System.out.println("StandardDTHserviceManager is running from original Class");
		System.out.println("it is  implemented from DTHServiceManagerD");
		return "no active subscrpion found";
	}

}
