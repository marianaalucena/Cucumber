package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsAmazon {
	    
	WebDriver driver;
    
    @Before
    public void before() {
    	System.out.println("CHEGOU! 1");
    	//WebDriverManager.chromedriver().setup();
    	System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
    	System.out.println("CHEGOU! 2");
    	 
    	driver = new ChromeDriver(); 
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	System.out.println("CHEGOU! 3");
    }

	@Dado("que eu esteja na pagina: {string}")
	public void que_eu_esteja_na_pagina(String url) {
		System.out.println("CHEGOU! 4");
		driver.get(url);
	}

	@Quando("fizer a busca pelo produto: {string}")
	public void fizer_a_busca_pelo_produto(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Entao("vou verificar se o valor esta acima de {string}")
	public void vou_verificar_se_o_valor_esta_acima_de(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
