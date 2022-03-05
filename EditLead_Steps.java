package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead_Steps {
	public ChromeDriver driver;


	@Given("Open the chrome browser3")
	public void open_the_chrome_browser3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
driver.manage().window().maximize();
	}
	
	@Given("Load the URL3 as {string}")
	public void load_the_url3(String Url) {
	     driver.get(Url);
	}
	@Given("Enter the username3 as {string}")
	public void enter_the_username3(String Username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
	}
	@Given("Enter the password3 as {string}")
	public void enter_the_password3(String Password) {
	     driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(Password);
	}
	
	@When("Enter the login button")
	public void Enter_the_login_button() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
	}
	@When("Click on CRMSFA")
	public void click_on_crmsfa() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}
	@When("Click on Leads3 button")
	public void click_on_leads3_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	}
	@When("Click on Find Leads button")
	public void click_on_find_leads_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();  
	}
	@Given("Enter the First name in the field as {string}")
	public void enter_the_first_name_in_the_field(String Firstname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(Firstname);
	}
	@When("Click on Find Leads button1")
	public void click_on_find_leads_button1() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
	}
	@When("Select the first row of first data")
	public void select_the_first_row_of_first_data() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		Thread.sleep(3000);
	}
	@Then("Get the title name and verify")
	public void get_the_title_name_and_verify() {
		String actualTitle = driver.getTitle();
		String expectedTitle ="View Lead | opentaps CRM";

		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title didn't match");
			}

	}
	@When("Click on the Edit button")
	public void click_on_the_edit_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	}
	@Then("Clear the Company Name filed")
	public void clear_the_company_name_filed() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		Thread.sleep(2000);
 
	}
	@Given("Enter the updated company name as {string}")
	public void enter_the_updated_company_name(String CompanyName) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(CompanyName);
	}
	@When("Click on submit button2")
	public void click_on_submit_button2() {
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	}
	@Then("Verify the updated company name is displayed are not")
	public void verify_the_updated_company_name_is_displayed_are_not() {
		if (driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).isDisplayed())

		{
	System.out.println("Updated Company name is displayed");
		}
		driver.close();
	}


	
}
