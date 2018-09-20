import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RandomName {

	
	WebDriver driver;
	File folder;
	WebElement guru;

	public void RandomNameFirst(){
		String Randomname=RandomStringUtils.randomAlphabetic(5).toUpperCase();
		driver.findElement(By.xpath("")).sendKeys(Randomname);
		
	}
	
	public void SaveEelment(){		
		List <WebElement> list=new ArrayList<WebElement>();
		list=driver.findElements(By.xpath(""));
		list.size();
		String str="Harshad";
	}
	
	
	
	public void RandomEmail(){
		String Randomemail=RandomStringUtils.randomAlphabetic(5)+"yopmail.com";
		driver.findElement(By.xpath("")).sendKeys(Randomemail);
		
	}
	
	public void waitpage(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait waitutil = new WebDriverWait(driver, 10);
		guru=waitutil.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		guru.click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, SECONDS)
			    .pollingEvery(5, SECONDS)
			    .ignoring(NoSuchElementException.class);
	}
	
	public void frame(){
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();		
	}
	
	public void ScreenShot(){
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str="c://destFile";
		FileUtils.copyFile(file, str);	
	}
}
