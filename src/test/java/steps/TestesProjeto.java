package steps;

import org.junit.Assert;
import org.junit.Test;

import Page.BasePage;
import Page.InicialPage;
import utils.PegarNaLista;

public class TestesProjeto {
	BasePage op = new BasePage();
	PegarNaLista pg = new PegarNaLista();
	InicialPage ip = new InicialPage();
	String diretor = "";
	String filme = "";
	Hooks hs = new Hooks();

	@Test
	public void TestarGoogle() {
		hs.setUp("https://www.google.com/");
		diretor = pg.Diretor().get(1);
		filme = pg.Filmes().get(1);
		ip.sendCampoPesquisa(diretor + " " + filme);
		ip.clickBtnPesquisar();
		String mensagem = ip.isMensagemgetText().getText();
		System.out.println(">>>>>>>>> " + mensagem);
		Assert.assertEquals(true, ip.isMsgVerificar());
	}
}