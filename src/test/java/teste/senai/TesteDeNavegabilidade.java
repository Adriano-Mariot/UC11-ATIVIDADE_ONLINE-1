package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteDeNavegabilidade {

	ChromeDriver driver;
	
	// before-test

	@Before 
	public void PreTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedrive\\chromedriver.exe");
		//open browser
		this.driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.get("https://informatica.sp.senai.br");
	}
	
	// real time test
	@Test
	public void TesteIni() { 
		driver.findElementById("Busca1_txtFiltro").sendKeys("Excel");
//		driver.findElementById("Busca1_btnBusca").click();
		driver.findElementById("Busca1_txtFiltro").sendKeys(Keys.ENTER);
	}
	
	//after test
	@After
	public void PosTeste() {
		
	}
	
}
