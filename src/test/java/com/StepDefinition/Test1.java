package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Test1 {
	 
	WebDriver driver;
//	@Given("The user should be in login page")
//	public void the_user_should_be_in_login_page() {
//		driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	    // Write code here that turns the phrase above into concrete actions
//	}
	@Given("The user should be {string}")
	public void the_user_should_be(String string) {
		driver=new ChromeDriver();
		driver.get(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//	}
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}
	
//	@When("^User enters (.*) and (.*)$")
//	public void user_enters_and(String string, String string2) {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.findElement(By.name("username")).sendKeys(string);
//		driver.findElement(By.name("password")).sendKeys(string2);
//	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Validate whether the user successfully logged in")
	public void validate_whether_the_user_successfully_logged_in() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	    // Write code here that turns the phrase above into concrete actions
	}

}
