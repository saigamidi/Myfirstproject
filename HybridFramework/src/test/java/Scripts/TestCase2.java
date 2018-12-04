package Scripts;

import org.testng.annotations.Test;

import HybridFrameworkConfig.StartBrowser;
import ReUse.CommonFuncLogin;

public class TestCase2 extends StartBrowser{
  @Test
  public void TestSignReuse() throws Exception  {
	  CommonFuncLogin cfs = new CommonFuncLogin();
	  cfs.Signin();
	  cfs.SignOut();
	  
  }
}
