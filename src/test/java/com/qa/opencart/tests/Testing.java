package com.qa.opencart.tests;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Testing {
	@Test
	public void testMethod1(ITestContext context) {
		String name = "Anuja";
		context.setAttribute("username", name);
		System.out.println(" name value in testMethod1: " + name);
	}

	@Test
	public void testMethod2(ITestContext context) {
		String name = (String) context.getAttribute("username");
		System.out.println(" value in testMethod2: " + name);
		
		int i = 10;
		i = i+20;
		System.out.println(i);
		
		
		String s = "this is my java code";
		String ss[] = s.split(" ");
		String r = "";
		for(String e : ss) {
			 r = r+ e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase()) + " ";
		}
		System.out.println(r);
		
		//
		String p = "this is my java code";
		String pp[] = p.split(" ");
		String rev = "";
		for(String e : pp) {
			StringBuilder sb = new StringBuilder(e);
			rev = rev + sb.reverse()+ " ";
		}
		System.out.println(rev);
		
		Integer it = 100;
		System.out.println(it+200);
		System.out.println(it);

	}

}
