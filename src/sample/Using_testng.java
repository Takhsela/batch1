package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_testng {
	
public String baseURL ="http://newtours.demoaut.com/";
public WebDriver driver;

@BeforeTest
public void SetBaseURL() {
	driver=new ChromeDriver();
	driver.get(baseURL);
	
}
@Test
public void verifyHomePage() {
String expectedTitle ="Welcome:Mercury Tours";
String actualTitle=driver.getTitle();
Assert.assertEquals(actualTitle,expectedTitle);

}
@AfterTest

public void endSession() {

	driver.quit();
}

}








