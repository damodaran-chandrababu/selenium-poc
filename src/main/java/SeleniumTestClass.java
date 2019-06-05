import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SeleniumTestClass {
 
 public static void main(String[] args) {
 
 /*declaration and instantiation of objects/variables*/
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\damodaran\\Downloads\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 String baseWebUrl = "https://www.linkedin.com/";
 String expectedWebsiteTitle = "World’s Largest Professional Network | LinkedIn";
 String actualWebsiteTitle = "";
 
 /*Launch Firefox browser and browse the Base URL*/
 driver.get(baseWebUrl);
 
 /* get the actual value of the title*/
 actualWebsiteTitle = driver.getTitle();
 
 /*
 * Compare the Website actual title against the expected title
 * If both titles matches then result is "Passed" else "Failed"
 */
 if (actualWebsiteTitle.contentEquals(expectedWebsiteTitle)){
 System.out.println("Test Passed!");
 } else {
 System.out.println("Test Failed!");
 }
 
 /*closing Firefox Browser*/
 driver.close();
 
 /*Exiting the System*/
 System.exit(0);
 }
}

