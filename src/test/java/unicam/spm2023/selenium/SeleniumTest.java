package unicam.spm2023.selenium;

import static org.junit.jupiter.api.Assertions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTest {



	static String projectPath;
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
		projectPath = System.getProperty("user.dir");
	}


	@AfterAll
	static void tearDownAfterClass() throws Exception {		
	}


	@BeforeEach
	void setUp() throws Exception {
	}





	@AfterEach
	void tearDown() throws Exception {
		driver.close();
		driver.quit();

	}







	@Test
	@Disabled
	void checkProsSite() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		// "C:/Users/longh/OneDrive/Desktop/SPM2023-MavenWebApp-Project"
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/java/unicam/spm2023/drivers/chromedriver.exe");

		//System.out.println(projectPath)
		WebDriver driver = new ChromeDriver();
		driver.get("https://pros.unicam.it/");

		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "PROS - PROcesses & Services lab | Computer Science division @Unicam";
		
		//System.out.println(at);		
		Thread.sleep(4000);

		assertEquals(et,at);
		driver.close();
		driver.quit();
		
	}

}
