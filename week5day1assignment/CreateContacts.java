package week5day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1class.BaseClass;

public class CreateContacts extends BaseClass {

	@BeforeClass
	public void sheet() {
	String sheetname="createcontact";
	}
	@Test (dataProvider="getcelead")
	public void creatcontacts(String fname,String lname, String depart,String desc, String mail) {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver= new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys(fname);
		driver.findElement(By.id("lastNameField")).sendKeys(lname);
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys(depart);
		driver.findElement(By.id("createContactForm_description")).sendKeys(desc);
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(mail);
		WebElement ele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd4=new Select(ele);
		dd4.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("important_Notes");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		
	}
	
	

}
