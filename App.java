package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App
{
public static void main(String[] args) throws InterruptedException
{
  System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver");
ChromeOptions options = new ChromeOptions();
options.addArguments("--headless"); // Essential for Jenkins/Server environments
WebDriver driver = new ChromeDriver(options);

WebDriver driver = new ChromeDriver();
Thread.sleep(2000);
driver.get("https://www.saucedemo.com/");
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.id("user-name")).sendKeys("standard_user");
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("secret_sauce");
Thread.sleep(2000);
driver.findElement(By.id("login-button")).click();
}}44
