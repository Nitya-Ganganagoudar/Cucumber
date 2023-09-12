package com.StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo1 {
	WebDriver driver;

	@Given("user launches")

	public void user_launches() {

    // Write code here that turns the phrase above into concrete actions
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
 
	@When("user enters the credential values")
	public void user_enters_the_credential_values(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> credentiaList = dataTable.cells();
		//String unameString= credentiaList.get(0);
		//String passwordString= credentiaList.get(1);
		int rows=dataTable.height();
		int col=dataTable.width();
		
		for(int i=0;i<rows;i++)
		{ driver=new ChromeDriver();
		driver.get("https://saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("user-name")).sendKeys(credentiaList.get(i).get(0));
		driver.findElement(By.id("password")).sendKeys(credentiaList.get(i).get(1));
		driver.findElement(By.id("login-button")).click();			
		}
		
	}
 
	@When("the user clicks And gets admitted into website")
	public void the_user_clicks_and_gets_admitted_into_website() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User admitted to website");
 
	}
 

@Then("close the browser window and quit")
	public void close_the_browser_window_and_quit() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser is closed");
	}



}