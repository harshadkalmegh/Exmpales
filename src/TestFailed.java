import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Lisneter.class)
public class TestFailed extends Base{
	
	@BeforeMethod
	public void openchrome(){
		
		initilization();
	}

	@Test
	public void failed(){
		
		Assert.assertEquals(false, true);
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}
}
