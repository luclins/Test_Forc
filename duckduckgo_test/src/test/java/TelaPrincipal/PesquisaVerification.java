package TelaPrincipal;

import core.SystemConfigs;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.DSL;

public class PesquisaVerification {
	
	private WebDriver driver;
	DSL dsl;
	public PesquisaVerification(WebDriver driver) {
		dsl = new DSL(driver);
		this.driver = driver;
	}

	public void checkURL() {
		String currentURL = dsl.getURL();
		Assert.assertTrue(currentURL.equals("https://www.football-data.org/"));
	}
}
