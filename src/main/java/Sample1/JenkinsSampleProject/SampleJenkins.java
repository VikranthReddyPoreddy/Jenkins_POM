package Sample1.JenkinsSampleProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleJenkins 
{
	@Test
	public void sampleJenkins() throws WebDriverException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\vikky selenium\\prgrms\\JenkinsSampleProject\\Drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.co.in/");  
		System.out.println("Jenkins console");
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		FileUtils.copyFile(scrShot.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\LENOVO\\Desktop\\New folder_J\\jenkins.png"));
		driver.quit();
	}
}
