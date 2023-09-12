package com.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@T1")
	public void f1() {
		System.out.println("First package");
		
			
		}
	@After("@T2")
	public void f2() {
		System.out.println("Second package");
}
}
