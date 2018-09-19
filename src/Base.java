import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {

	WebDriver driver;
	
	public void initilization(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hkalmegh\\Desktop\\jaa\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
	}
	
	public void screenshot(){
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File ("C:\\Users\\hkalmegh\\Desktop\\jaa\\geckodriver.exe"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
