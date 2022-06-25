package week5day1assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5day2assignment.Readexcelcreateleadeditlead;

public class BaseClass {
	 public ChromeDriver driver;
	 public String sn;
	 
	@Parameters({"url","username","password"})
	@BeforeMethod
	public  void pre(String url,String uname, String pwd) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("uname");
		driver.findElement(By.id("password")).sendKeys("pwd");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@AfterMethod
	public  void post() {
		driver.close();

	}
	@DataProvider(name="getcelead")
	public String[][] fetchcreateleaddata() throws IOException
	{
		String[][] data = Readexcelcreateleadeditlead.readcreatelead(sn);
		return data;
	}

}
