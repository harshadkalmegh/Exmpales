import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Lisneter.class)
public class TestFailed {

	@Test
	public void failed(){
		
		Assert.assertEquals(false, true);
	}
}
