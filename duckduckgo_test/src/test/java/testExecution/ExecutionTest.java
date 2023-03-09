package testExecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import TelaPrincipal.PesquisaVerification;
import TelaPrincipal.TelaPrincipalPage;
import core.SystemConfigs;

public class ExecutionTest {
	
	private SystemConfigs config;
	private TelaPrincipalPage telaPage;
	private PesquisaVerification telaVerif;

	
	@Before
	public void before() {
		config = new SystemConfigs();
		telaPage = new TelaPrincipalPage(getDriver());
		telaVerif = new PesquisaVerification(getDriver());
	}
	
	@After
	public void after() {
		getDriver().quit();
	}
	
	
	@Test
	public void duckduckgoTest() {
		telaPage.fillSearchField("The dev-friendly football API");
		telaPage.submit();
		telaPage.clickOnFirstLink();
		telaVerif.checkURL();
	}

	public WebDriver getDriver() {
		return this.config.retornarDriver();
	}
	
	
	
	
	
}
