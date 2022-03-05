package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact_Steps {
	public ChromeDriver driver;
	
	@Given("Open the chrome browser1")
	public void open_the_chrome_browser1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
driver.manage().window().maximize();

	}
		
	@Given("Load the URL1 as {string}")
	public void load_the_url1(String url) {
		driver.get(url);

	}
	@Given("Enter the username1 as {string}")
	public void enter_the_username(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}
	@Given("Enter the password1 as {string}")
	public void enter_the_password(String password) {
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password);
	}
	@When("login button1")
	public void login_button1() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
	}
	
	@Then("Homepage1")
	public void Homepage1() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();	

	}
	@Then("Click on Contacts tab")
	public void click_on_contacts_tab() {
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')][1]")).click();

	}
	@Then("Click on Create Contacts tab")
	public void click_on_create_contacts_tab() {
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')][1]")).click();
	 
	}
	@Given("Enter the Firstname as {string}")
	public void enter_the_firstname(String firstname) {
		driver.findElement(By.id("firstNameField")).sendKeys(firstname);

	}
	@Given("Enter the Lastname as {string}")
	public void enter_the_lastname(String lastname) {
		driver.findElement(By.id("lastNameField")).sendKeys(lastname);

	}
	@Given("Enter the FirstNameLocal as {string}")
	public void enter_the_first_name_local(String firstNameLocal) {
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(firstNameLocal);

	}
	@Given("Enter the LastNameLocal as {string}")
	public void enter_the_last_name_local(String LastNameLocal) {
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(LastNameLocal);
	
	}
	@Given("Enter the DepartmentName as {string}")
	public void enter_the_department_name(String departmentName) {
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys(departmentName);

	}
	@Given("Enter the Description as {string}")
	public void enter_the_description(String description) {
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(description);
	
	}
	@Given("Enter the Email as {string}")
	public void enter_the_email(String email) {
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys(email);
	   
	}
	
	@Given("Select the State")
	public void Select_the_State() {
		WebElement State = (driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
		Select State1 = new Select(State);
		State1.selectByVisibleText("New York"); 
	}
	@When("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("Created Contact successfully");
		driver.close();
	}
	
}
