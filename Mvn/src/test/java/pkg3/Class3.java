package pkg3;

import org.testng.annotations.Test;

public class Class3 {
	@Test
	public void jen() {
		System.out.println("help");
		
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
	}

}
