import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ChromeDownload {
	
	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void BeforeDownloadFile(){
		//will create directory 
		folder =new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		//Chrome
		//setup code for chrome browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hkalmegh\\Desktop\\jaa\\geckodriver.exe");
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> prefs=new HashMap<String, Object>();
		//while downloading pop should be zero
		prefs.put("profile.default_content_setting_popups", 0);
		//Directory path
		prefs.put("download.default_directory", folder.getAbsolutePath());
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver=new ChromeDriver();
	}
	
	@Test
	public void DownloadFile(){
		File listfiles[]=folder.listFiles();
		//make sure the directory is not empty
		Assert.assertTrue(listfiles.length>0);
		//make sure that downloaded file is not empty
		for(File file:listfiles){
		Assert.assertTrue(file.length()>0);	
		}
	}
	
	@AfterMethod
	public void exit(){		
		for(File file:folder.listFiles()){
			file.delete();
		}
		folder.delete();
	}
}
