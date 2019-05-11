package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InicialPage extends BasePage {

	public InicialPage() {
		super();
	}

	
	//--------------------------------------- Xpath do Campo de Pesquisa ---------------------------//
	private WebElement getCampoPesquisa() {
		return driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	}

	public void sendCampoPesquisa(String value) {
		getCampoPesquisa().sendKeys(value);
	}

	//---------------------------------------Xpath do Botão Pesquisar ---------------------------//
	private WebElement BtnPesquisar() {
		return driver.findElement(By.xpath("(//input[contains(@name,'btnK')])[2]"));

	}

	public void clickBtnPesquisar() {
		BtnPesquisar().click();
	}

	public boolean isMsgVerificar() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("resultStats")));
		driver.findElement(By.id("resultStats"));
		return true;
	}

	public WebElement isMensagemgetText() {
		return driver.findElement(By.id("resultStats"));
		
		
	}
}