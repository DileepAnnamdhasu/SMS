package org.pageObjectRep;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class basePage {
	public static WebDriver driver;

	public WebDriver getChromeDriver() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-orgins=*");
//		options.addArguments("--disable notifications");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
//
//		DesiredCapabilities cp = new DesiredCapabilities();
//		cp.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(cp);

		driver = new ChromeDriver();
		driver.get("https://smsqa.chinmayablossomsva.org/SMS/");
		Thread.sleep(3000);
		return driver;
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

}
