package br.ce.wcaquino.appium.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.wcaquino.appium.test.AbasTeste;
import br.ce.wcaquino.appium.test.AccordionTeste;
import br.ce.wcaquino.appium.test.AlertTeste;
import br.ce.wcaquino.appium.test.CalculadoraTeste;
import br.ce.wcaquino.appium.test.CliquesTeste;
import br.ce.wcaquino.appium.test.DragNDropTeste;
import br.ce.wcaquino.appium.test.FormularioTeste;
import br.ce.wcaquino.appium.test.OpcaoEscondidaTest;
import br.ce.wcaquino.appium.test.SBTeste;
import br.ce.wcaquino.appium.test.SplashTeste;
import br.ce.wcaquino.appium.test.SwipeElementTeste;
import br.ce.wcaquino.appium.test.WebViewTeste;

@RunWith(Suite.class)
@SuiteClasses({ AbasTeste.class, AccordionTeste.class, AlertTeste.class, CalculadoraTeste.class, CliquesTeste.class,
		DragNDropTeste.class, FormularioTeste.class, OpcaoEscondidaTest.class, SBTeste.class, SplashTeste.class,
		SwipeElementTeste.class, WebViewTeste.class })
public class AppiumRunners {

}
