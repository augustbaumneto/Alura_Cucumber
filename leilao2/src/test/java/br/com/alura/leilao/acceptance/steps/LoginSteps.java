package br.com.alura.leilao.acceptance.steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import br.com.alura.leilao.e2e.pages.Browser;
import br.com.alura.leilao.e2e.pages.LeiloesPage;
import br.com.alura.leilao.e2e.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
	private static final String USUARIO_VALIDO = "fulano";
	private static final String SENHA_VALIDA = "pass";
	
	private Browser navegador;
	private LoginPage paginalogin;
	private LeiloesPage paginaleiloes;
	private String usuariologin;
	private String senhalogin;

	@Before
	public void setup() {
		
	}
	
	@Dado("um usuario valido")
	public void um_usuario_valido() {
		this.navegador = new Browser();
		navegador.seed();
		this.paginalogin = this.navegador.getLoginPage();
		usuariologin = USUARIO_VALIDO;
		senhalogin = SENHA_VALIDA;
	}
	
	@Quando("realiza login")
	public void realiza_login() {
		this.paginaleiloes = this.paginalogin.realizaLoginComo(usuariologin, senhalogin); 		
		
	}
	
	@Entao("e redirecionado para a pagina de leiloes logada")
	public void e_redirecionado_para_a_pagina_de_leiloes_logada() {
		assertTrue(this.paginaleiloes.estaNaPaginaDeLeiloes());
	}
	
	@Dado("um usuario invalido")
	public void um_usuario_invalido() {

		this.navegador = new Browser();
		navegador.seed();
		this.paginalogin = this.navegador.getLoginPage();
		usuariologin = USUARIO_VALIDO;
		senhalogin = SENHA_VALIDA+"RTF";
		
	}
	
	@Quando("tenta se logar")
	public void tenta_se_logar() {
		this.paginaleiloes = this.paginalogin.realizaLoginComo(usuariologin, senhalogin);

	}
	
	@Entao("continua na pagina de login")
	public void continua_na_pagina_de_login() {
		assertFalse(this.paginaleiloes.estaNaPaginaDeLeiloes());
	}
	
}
