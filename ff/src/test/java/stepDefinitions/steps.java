package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
public class steps {
	WebDriver driver;
@Given("^ site$")
public void launch()
{
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
			driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.solaredge.com/contact/qa_automation_test");
}
@When("^I enter name as \"(.*)\"$")
public void name(String x)
{
driver.findElement(By.name("name")).sendKeys(x);
}
@And("^email as \"(.*)\"$")
public void email(String y)
{
driver.findElement(By.name("email")).sendKeys(y);
}
@And("^subject as \"(.*)\"$")
public void subject(String z)
{
driver.findElement(By.name("subject[0][value]")).sendKeys(z);
}
@And("^message as \"(.*)\"$")
public void message(String a)
{
driver.findElement(By.name("message[0][value]")).sendKeys(a);
}
@And("^country as \"(.*)\"$")
public void country(String b)
{
WebElement e=driver.findElement(By.className("field_client_address[0][address][country_code]"));
			Select s=new Select(e);
			s.selectByVisibleText(b);
}
@And("^firstname as \"(.*)\"$")
public void firstname(String c)
{
driver.findElement(By.name("field_client_address[0][address][given_name]")).sendKeys(c);
}
@And("^lastname as \"(.*)\"$")
public void lastname(String d)
{
driver.findElement(By.name("field_client_address[0][address][family_name]")).sendKeys(d);
}
@And("^streetname as \"(.*)\"$")
public void streetname(String e)
{
driver.findElement(By.name("field_client_address[0][address][address_line1]")).sendKeys(e);
}
@And("^postcode as \"(.*)\"$")
public void postcode(String p)
{
driver.findElement(By.name("field_client_address[0][address][postal_code]")).sendKeys(p);
}
@And("^city as \"(.*)\"$")
public void city(String f)
{
driver.findElement(By.name("field_client_address[0][address][locality]")).sendKeys(f);
}
@And("^click send message button$")
public void submit()
{
driver.findElement(By.id("edit-submit")).click();
}
@Then("^validate form is submitted or not$")
public void validate()
{
	String d="submitted successfully";
	String f=driver.findElement(By.xpath("(//*[@id='wrapper']/section/section/div/div[1]")).getText();
	Assert.assertEquals(d,f);

}

}