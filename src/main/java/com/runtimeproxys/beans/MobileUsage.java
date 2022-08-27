package com.runtimeproxys.beans;

import java.security.SecureRandom;

public class MobileUsage implements UsageTractor {

	public String usageReport(String customerId) {
		SecureRandom random=new SecureRandom();
		System.out.println("Customer Id :"+customerId);
		System.out.println("Mobile usage ");
		System.out.println("Daily usage of mobile");
		return "Use : "+random.nextDouble();
	}

}
