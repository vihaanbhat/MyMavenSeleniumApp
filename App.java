package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
[span_1](start_span)import org.openqa.selenium.chrome.ChromeOptions;[span_1](end_span)

public class App {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        
        // Essential for your Ubuntu/Chromium setup
        options.setBinary("/usr/bin/chromium-browser");
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        try {
            [span_2](start_span)driver.get("https://www.saucedemo.com/");[span_2](end_span)
            [span_3](start_span)Thread.sleep(2000);[span_3](end_span)
            
            [span_4](start_span)driver.findElement(By.id("user-name")).sendKeys("standard_user");[span_4](end_span)
            [span_5](start_span)driver.findElement(By.id("password")).sendKeys("secret_sauce");[span_5](end_span)
            [span_6](start_span)driver.findElement(By.id("login-button")).click();[span_6](end_span)
            
            Thread.sleep(2000);
        } finally {
            driver.quit(); 
        }
    }
}
