package week5day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1class.BaseClass;

public class CreateLead extends BaseClass{

	@Test
	public void createlead() {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sripriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sriya.m89@gmail.com");
		WebElement ele=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd= new Select(ele);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String eletitle = driver.getTitle();
		System.out.println(eletitle);
		//driver.close();
		

	}

}
