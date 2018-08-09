package TS_WebLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumSoftware\\geckodriver-v0.20.0-win64\\geckodriver.exe" );
		WebDriver obj = new FirefoxDriver();
		obj.get("https://www.google.com/");

	}

}
