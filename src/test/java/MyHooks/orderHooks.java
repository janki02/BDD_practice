package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class orderHooks {
	
	@Before("@Regression")
	public void setup_app(Scenario sc) {
		System.out.println("launch open cart application");
		System.out.println(sc.getName());
	}
	
//	@Before(order = 2)
//	public void setup_URL() {
//		System.out.println("launch URL");
//	}
//	
//	@After(order = 2)
//	public void tearDown(Scenario sc) {
//		System.out.println("close the browser");
//		System.out.println(sc.getName());
//	}
	
	
	@After("@Regression")
	public void tearDown_logout() {
		System.out.println("logout from application");
	}
//@BeforeStep
//public void takescreenshot() {
//	System.out.println("take the screenshot");
//}
//@AfterStep
//public void RefreshPage() {
//	System.out.println("Refresh the Page");
//}
}
