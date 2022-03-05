package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead_Steps {
	public ChromeDriver driver;


	@Given("Open the chrome browser2")
	public void open_the_chrome_browser2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
driver.manage().window().maximize();

	}
		
	@Given("Load the URL2 as {string}")
	public void load_the_url2(String url) {
		driver.get(url);

	}
	@Given("Enter the username2 as {string}")
	public void enter_the_username(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}
	@Given("Enter the password2 as {string}")
	public void enter_the_password(String password) {
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password);
	}
	@When("login button2")
	public void login_button2() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
	}
	
	@Then("Homepage2")
	public void Homepage2() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();	

	}

@Then("Click on Leads tab")
public void click_on_leads_tab() {
	driver.findElement(By.partialLinkText("Leads")).click();
}

@Then("click on Create Lead tab")
public void click_on_create_lead_tab() {
	driver.findElement(By.partialLinkText("Create Lead")).click();
}

@Given("Enter the Companyname as {string}")
public void enter_the_companyname(String Companyname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Companyname);
}

@Given("Enter the Firstname1 as {string}")
public void enter_the_firstname(String Firstname1) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Firstname1);
}

@Given("Enter the Lastname1 as {string}")
public void enter_the_lastname(String Lastname1) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname1);
}

@Given("Select the Source")
public void select_the_source() {
	Select Source = new Select(driver.findElement(By.name("dataSourceId")));
	Source.selectByVisibleText("Other");

}

@Given("Select the Campaign")
public void select_the_campaign() {
	Select Campaign = new Select(driver.findElement(By.name("marketingCampaignId")));
	Campaign.selectByIndex(3);

}

@Given("Enter the firstNameLocal as {string}")
public void enter_the_first_name_local(String firstNameLocal) {
	driver.findElement(By.name("firstNameLocal")).sendKeys(firstNameLocal);
}

@Given("Enter the lastNameLocal as {string}")
public void enter_the_last_name_local(String lastNameLocal) {
	driver.findElement(By.name("lastNameLocal")).sendKeys(lastNameLocal);
}

@Given("Enter the personalTitle as {string}")
public void enter_the_personal_title(String personalTitle) {
	driver.findElement(By.name("personalTitle")).sendKeys(personalTitle);
}

@Given("Enter the DOB as {string}")
public void enter_the_dob(String DOB) {
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys(DOB);
}

@Given("Enter the ProfileTitle as {string}")
public void enter_the_profile_title(String ProfileTitle) {
	driver.findElement(By.name("generalProfTitle")).sendKeys(ProfileTitle);
}

@Given("Enter the DepartmentName1 as {string}")
public void enter_the_department_name1(String departmentName1) {
	driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys(departmentName1);

}
@Given("Enter the AnnualRevenue as {string}")
public void enter_the_annual_revenue(String AnnualRevenue) {
	driver.findElement(By.name("annualRevenue")).sendKeys(AnnualRevenue);
}

@Given("Select the Industry")
public void select_the_industry() {
	Select Industry = new Select(driver.findElement(By.name("industryEnumId")));
	Industry.selectByIndex(5);

}

@Given("Select the Currency")
public void select_the_currency() {
	Select Preferred_Currency = new Select(driver.findElement(By.name("currencyUomId")));
	Preferred_Currency.selectByIndex(8);

}

@Given("Select the Ownership")
public void select_the_ownership() {
	Select Ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
	Ownership.selectByVisibleText("Corporation");

}

@Given("Enter the No of Employee as {string}")
public void enter_the_no_of_employee(String NoofEmployee) {
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys(NoofEmployee);
}

@When("Click on create Lead Button")
public void click_on_create_lead_button() {
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println("Created Lead successfully");
	driver.close();
}
}