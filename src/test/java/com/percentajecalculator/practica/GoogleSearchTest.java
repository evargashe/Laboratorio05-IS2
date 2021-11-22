package com.percentajecalculator.practica;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotEquals;


import org.openqa.selenium.support.ui.*;


//import static org.junit.Assert.assertEquals;

//import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window();
		driver.get("https://www.calculator.net/percent-calculator.html");
	}

	@Test
	public void testGooglePage() {
		//Calculadora de porcentaje
	    WebElement cpar1 = driver.findElement(By.name("cpar1"));
	    cpar1.sendKeys("8");
	    
	    WebElement cpar2 = driver.findElement(By.name("cpar2"));
	    cpar2.sendKeys("5");
	    
	    driver.findElement(By.xpath(".//*[@id = 'content']/table[1]/tbody/tr[2]/td/input[2]")).click();
	    
	    

	    
	    //Calculadora de porcentaje en frases comunes

	    WebElement c21par1 = driver.findElement(By.name("c21par1"));
	    c21par1.sendKeys("80");
	    
	    WebElement c21par2 = driver.findElement(By.name("c21par2"));
	    c21par2.sendKeys("18");
	    
	    driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr/td[2]/input[2]")).click();

	   
	    
	    
	   
	    
	    
	    WebElement c22par1 = driver.findElement(By.name("c22par1"));
	    c22par1.sendKeys("800");
	    
	    WebElement c22par2 = driver.findElement(By.name("c22par2"));
	    c22par2.sendKeys("180");
	    
	    //driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr/td[2]/input[2]")).click();

	    
	    
	    
	    WebElement c23par1 = driver.findElement(By.name("c23par1"));
	    c23par1.sendKeys("8000");
	    
	    WebElement c23par2 = driver.findElement(By.name("c23par2"));
	    c23par2.sendKeys("1800");
	    
	    

	    
	    
	    //Calculadora de diferencia porcentual

	    WebElement c3par1 = driver.findElement(By.name("c3par1"));
	    c3par1.sendKeys("100");
	    
	    WebElement c3par2 = driver.findElement(By.name("c3par2"));
	    c3par2.sendKeys("10");
	    
	    driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[3]/td/input[2]")).click();

	    

	    //Calculadora de cambio de porcentaje

	    WebElement c2par1 = driver.findElement(By.name("c2par1"));
	    c2par1.sendKeys("78");
	    
	    WebElement c2par2 = driver.findElement(By.name("c2par2"));
	    c2par2.sendKeys("10");
	    
	    Select se = new Select(driver.findElement(By.xpath("//*[@name='c2type']")));
	    se.selectByValue("decrease");

	    
	    driver.findElement(By.xpath(".//*[@id = 'content']/table[6]/tbody/tr[2]/td/input[2]")).click();

	    String result2 =
			      driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/font/b")).getText();	
		    WebElement capturar2 = driver.findElement(By.name("c2par3"));
		    	capturar2.sendKeys(result2);
		    	
		System.out.println(" The Result is " + result2);    	
		assertEquals(result2, "70.2");
		System.out.println("Assert passed");
		
		
		assertNotEquals(result2, "70.5");
		System.out.println("Assert passed");
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
