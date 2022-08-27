package com.runtimeproxys.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;

public class PerformanceHandler implements InvocationHandler {

	private Object target;
	
	
	public PerformanceHandler(Object target) {
		this.target = target;
	}


	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime=Calendar.getInstance().getTimeInMillis();
		Object ret=method.invoke(target, args);
		long endTime=Calendar.getInstance().getTimeInMillis();
		long totalTime=endTime-startTime;
		System.out.println();
		System.out.println("Time taken to excute :"+method.getName()+" () : "+totalTime);
		System.out.println();
		return ret;
	}

}
