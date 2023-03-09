package TelaPrincipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.DSL;

public class TelaPrincipalPage {

	private DSL dsl;

	public TelaPrincipalPage(WebDriver navegador) {
		dsl = new DSL(navegador);
	}

	public void fillSearchField(String message) {
		dsl.digitar(By.id("search_form_input_homepage"), message);
	}

	public void submit() {
		dsl.submit(By.id("search_form_input_homepage"));
	}

	public void clickOnFirstLink() {
		dsl.clicar(By.xpath("//div[@id='links']//div//article//div[2]//h2[1]//a[1]//span[contains(text(),'football')]"));
	}
}


