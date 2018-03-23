package com.ping.PingServer;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws InterruptedException 
     */
    public void testApp() throws InterruptedException
    {

        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        
        ChromeDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("http://111.93.27.187:8889/niku/nu");
     
        WebDriverWait wait = new WebDriverWait(driver, 20);

		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='userName']")));
		
		     driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		     driver.findElement(By.xpath("//input[@id='ppm_login_password']")).sendKeys("Clarity1");
		     driver.findElement(By.xpath("//input[@id='ppm_login_button']")).click();
		     Thread.sleep(3000);
		     driver.navigate().to("http://111.93.27.187:8889/niku/nu");
		     Thread.sleep(3000);
		     driver.quit();


    }
}
