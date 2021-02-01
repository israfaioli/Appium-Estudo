package br.ce.wcaquino.appium.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.appium.core.BaseTest;
import br.ce.wcaquino.appium.page.CliquesPage;
import br.ce.wcaquino.appium.page.MenuPage;

public class CliquesTeste extends BaseTest {

	private static MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();
	
	@BeforeClass
	public static void setup(){
		menu.acessarCliques();
	}
	
	@Test
	public void deveRealizarCliqueLongo(){
		//clique longo
		page.cliqueLongo();
		
		//verificar texto
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}
	
	@Test
	public void deveRealizarCliqueDuplo(){
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
	}
}
