public static void main(String[] args) throws InterruptedException {
    ChromeOptions options = new ChromeOptions();
    
    // 1. Tell Selenium where your Chromium is located
    options.setBinary("/usr/bin/chromium-browser"); 
    
    // 2. Add essential flags for Linux VirtualBox
    options.addArguments("--headless");
    options.addArguments("--no-sandbox"); // Fixes permissions issues
    options.addArguments("--disable-dev-shm-usage"); // Fixes memory issues in VMs

    // 3. Initialize ONLY this one driver
    WebDriver driver = new ChromeDriver(options);

    try {
        [span_4](start_span)driver.get("https://www.saucedemo.com/");[span_4](end_span)
        [span_5](start_span)// ... your login logic ...[span_5](end_span)
    } finally {
        driver.quit(); 
    }
}
