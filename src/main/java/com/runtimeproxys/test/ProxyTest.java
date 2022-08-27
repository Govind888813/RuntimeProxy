package com.runtimeproxys.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.runtimeproxys.beans.DTHServiceManager;
import com.runtimeproxys.beans.MobileUsage;
import com.runtimeproxys.beans.StandardDTHserviceManager;
import com.runtimeproxys.beans.UsageTractor;
import com.runtimeproxys.handler.PerformanceHandler;

public class ProxyTest {
	public static void main(String[] args) {
		
		DTHServiceManager dth=new StandardDTHserviceManager();
		InvocationHandler ihDTH=new PerformanceHandler(dth);
		
		DTHServiceManager proxy=(DTHServiceManager) Proxy.newProxyInstance(
				DTHServiceManager.class.getClassLoader(),
				new Class<?>[]{DTHServiceManager.class}, 
				ihDTH);
		
		UsageTractor usage=new MobileUsage();
		InvocationHandler invocationHandlerUsage=new PerformanceHandler(usage);
		
		UsageTractor proxyUsage=(UsageTractor) Proxy.newProxyInstance(
													UsageTractor.class.getClassLoader(), 
													new Class<?>[]{UsageTractor.class}, 
													invocationHandlerUsage);
		
		
		 String troubShoot = proxy.troubShoot("Govind");
		 System.out.println(troubShoot);
		 
		 System.out.println("=================");
		 String report = proxyUsage.usageReport("Ajay");
		 System.out.println(report);
		 
		 
	}

}
