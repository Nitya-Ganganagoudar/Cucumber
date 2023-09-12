package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HooksExample {
	WebDriver driver;
	@Before("@T1")
	public void before()
	{
		System.out.println("Before test");
	}
	

@Given("Browser opens")
public void browser_opens() {
	driver=new ChromeDriver();
    
}

@When("open google page")
public void open_google_page() {
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

}

@Then("validates title of the page")
public void validates_title_of_the_page() {
	Assert.assertEquals("Google", driver.getTitle());
}

@After("@T1")
public void after()
{
	System.out.println("After test");
}
}


