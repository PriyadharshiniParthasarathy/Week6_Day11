package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead_Steps {
	public ChromeDriver driver;
	
	@Given("Open the chrome browser5")
	public void open_the_chrome_browser5() {
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();

	}
	@Given("Load the URL5 as {string}")
	public void load_the_url5(String url) {
		driver.get(url);
	}
	@Given("Enter the username5 as {string}")
	public void enter_the_username5_as_username(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}
	@Given("Enter the password5 as {string}")
	public void enter_the_password5_as_password(String password) {
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password);
	}
	@When("Click on the login bttn")
	public void click_on_the_login_bttn() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	}
	@When("Click on the CRM\\/SFA")
	public void click_on_the_crm_sfa() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();	
	}
	@When("Click on the Leads_tab")
	public void click_on_the_leads_tab() {
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	}
	@When("Click on the FindLeads_tab")
	public void click_on_the_find_leads_tab() {
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	}
	@When("Click on email tab")
	public void click_on_email_tab() {
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
	}
	@When("Enter the email address as {string}")
	public void enter_the_email_address(String email) {
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(email);
	}
	@When("Click on find_Lead button")
	public void click_on_find_lead_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);

	}
	@Then("Get the text of Firstname and click on the Firstname")
	public void get_the_text_of_firstname_and_click_on_the_firstname() {
		WebElement Firstname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]//a"));
		String Firstname1 = Firstname.getText();
		System.out.println("First Resulting name is:- " +Firstname1);
		Firstname.click();

	}
	@Given("Click on Duplicate button")
	public void click_on_duplicate_button() {
		driver.findElement(By.xpath("//div[@class='frameSectionExtra'][1]//a[1]")).click();   
	}
	
	@Given("Click on Create_Lead btn")
	public void click_on_Create_Lead_btn() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();  
		System.out.println("Duplicate Lead is created");
		driver.close();
	}
	
}
