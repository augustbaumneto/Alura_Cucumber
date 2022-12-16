package br.com.alura.leilao.acceptance.steps;

import static org.junit.Assert.assertTrue;

import br.com.alura.leilao.e2e.pages.Browser;
import br.com.alura.leilao.e2e.pages.LeiloesPage;
import br.com.alura.leilao.e2e.pages.LoginPage;
import br.com.alura.leilao.e2e.pages.NovoLeilaoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LeilaoSteps {

	private LoginPage paginalogin;
	private LeiloesPage paginaleiloes;
	private NovoLeilaoPage paginacriacaoleilao;
	private Browser navegador;
	
	private final String USUARIO = "fulano";
	private final String SENHA = "pass";
	private final String NOMELEILAO1 = "AUDI TX40";
	private final String VALORINICIALVALIDO = "100000.00";
	private final String DATAABERTURAVALIDA = "10/01/2023";
	
	private String nomeleilao;
	private String valorinicialleilao;
	private String dataaberturaleilao;
	
	
	@Dado("um usuário logado")
	public void um_usuário_logado() {
		this.navegador = new Browser();
		this.navegador.seed();
		this.paginalogin = navegador.getLoginPage();
		this.paginaleiloes=this.paginalogin.realizaLoginComo(USUARIO, SENHA);
		
		this.nomeleilao=NOMELEILAO1;
		this.valorinicialleilao=VALORINICIALVALIDO;
		this.dataaberturaleilao=DATAABERTURAVALIDA;
		
	}
	
	@Quando("acessa a página de novo leilão")
	public void acessa_a_página_de_novo_leilão() {
		this.paginacriacaoleilao=this.paginaleiloes.visitaPaginaParaCriarUmNovoLeilao();
		
	}
	
	@Quando("preenche o formulário com dados válidos clicando em salvar")
	public void preenche_o_formulário_com_dados_válidos() {
		this.paginaleiloes=this.paginacriacaoleilao.preencheForm(nomeleilao, valorinicialleilao, dataaberturaleilao);

	}
	
	@Então("volta para a página de leilões")
	public void volta_para_a_página_de_leilões() {
		assertTrue(this.paginaleiloes.estaNaPaginaDeLeiloes());
	}

	@Então("o novo leilão é criado na tabela")
	public void o_novo_leilão_é_criado_na_tabela() {
		assertTrue(this.paginaleiloes.existe(NOMELEILAO1, VALORINICIALVALIDO, USUARIO));
		navegador.clean();
	}
	
}
