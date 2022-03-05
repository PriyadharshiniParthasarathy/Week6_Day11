package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead_Steps {
	public ChromeDriver driver;
	
	@Given("Open the chrome browser4")
	public void open_the_chrome_browser4() {
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();

	}
	@Given("Load the URL4 as {string}")
	public void load_the_url4(String url) {
	     driver.get(url);
	}
	@Given("Enter the username4 as {string}")
	public void enter_the_username4(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}
	@Given("Enter the password4 as {string}")
	public void enter_the_password4_(String password) {
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password);
	}
	@When("click on login btn")
	public void click_on_login_btn() {
	     driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	}
	@Then("click on the CRM")
	public void click_on_the_crm() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}
	@When("click on leads tab")
	public void click_on_leads_tab() {
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	}
	@When("click on Find Leads tab")
	public void click_on_find_leads_tab() {
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	}
	@When("Click the phone tab")
	public void Click_the_phone_tab() {
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
	}
	@When("Enter the phone number as {string}")
	public void enter_the_phone_number(String phoneno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneno);
	}
	@When("click on Find Leads button")
	public void click_on_find_leads_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);

	}
	@When("Get the LeadID number and Click LeadID")
	public void get_the_lead_id_number_and_click_leadid() {
		WebElement LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]//a"));
		String LeadID1 = LeadID.getText();
              System.out.println("First Resulting LeadID No:- " +LeadID1);
              LeadID.click();
	}
	
	@When("Click on Delete button")
	public void click_on_delete_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(3000);
		System.out.println("LeadID is deleted successfully");
		driver.close();
	}

}
	


