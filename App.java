public static void main(String[] args) {
    // 1. Manually set the driver path to the one you installed via apt
    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

    ChromeOptions options = new ChromeOptions();
    
    // 2. Set the path to the Chromium browser
    options.setBinary("/usr/bin/chromium-browser");

    // 3. ESSENTIAL FLAGS for Ubuntu VirtualBox/Jenkins
    options.addArguments("--headless=new"); // Runs without a GUI
    options.addArguments("--no-sandbox");    // Required for Linux root/jenkins users
    options.addArguments("--disable-dev-shm-usage"); // Prevents memory crashes in VMs
    options.addArguments("--remote-allow-origins=*"); // Fixes connection issues

    WebDriver driver = new ChromeDriver(options);

    try {
        driver.get("https://www.saucedemo.com/");
        System.out.println("Page title is: " + driver.getTitle());
        // Your login code...
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        driver.quit();
    }
}
