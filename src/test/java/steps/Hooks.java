package steps;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Page.BasePage;

public class Hooks extends BasePage {

	@Before

	public WebDriver setUp(String url) {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-infobars");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get(url);

		return driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
