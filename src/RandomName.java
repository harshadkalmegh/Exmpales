import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RandomName {

	
	WebDriver driver;
	File folder;
	public void RandomNameFirst(){
		String Randomname=RandomStringUtils.randomAlphabetic(5).toUpperCase();
		driver.findElement(By.xpath("")).sendKeys(Randomname);
		
	}
	
	public void SaveEelment(){		
		List <WebElement> list=new ArrayList<WebElement>();
		list=driver.findElements(By.xpath(""));
		list.size();
	}
	
	
	
	public void RandomEmail(){
		String Randomemail=RandomStringUtils.randomAlphabetic(5)+"yopmail.com";
		driver.findElement(By.xpath("")).sendKeys(Randomemail);
		
	}
	
	public void frame(){
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();		
	}
	
	public void ScreenShot(){
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, destFile);	
	}
}
