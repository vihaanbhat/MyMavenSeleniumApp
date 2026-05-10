// Add this import at the top
import org.openqa.selenium.chrome.ChromeDriverService;

// Inside your main method:
ChromeOptions options = new ChromeOptions();
options.setBinary("/usr/bin/chromium-browser"); // Path to your Chromium
options.addArguments("--headless");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");

// This line is the "Magic Fix": it tells Selenium exactly where the driver is
System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

WebDriver driver = new ChromeDriver(options);
