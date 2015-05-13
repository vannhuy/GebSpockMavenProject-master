///*
//	This is the Geb configuration file.
//
//	See: http://www.gebish.org/manual/current/configuration.html
//*/
//
//
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
// config use firefox browser
driver = {
	def driver = new FirefoxDriver()
	driver.manage().window().maximize()
	return driver
}
// config use chrome browser
//driver = {
//	System.setProperty("webdriver.chrome.driver", new File("G:/SELENIUM_Webdriver/Test/lib/chromedriver.exe").getAbsolutePath())
//	def driver = new ChromeDriver()
//	driver.manage().window().maximize()
//	return driver
//}
baseUrl = "http://ngocthoainguyen.herokuapp.com/"