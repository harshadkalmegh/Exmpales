import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RandomName {

	
	WebDriver driver;
	
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
