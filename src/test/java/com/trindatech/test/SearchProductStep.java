package com.trindatech.test;

import static org.junit.Assert.assertEquals;

import com.trindatech.page.DetailProductPage;
import com.trindatech.page.HomePage;
import com.trindatech.page.ListProductPage;
import com.trindatech.page.LoginPage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SearchProductStep {
	
	private HomePage home = new HomePage();
	private ListProductPage list = new ListProductPage();
	private DetailProductPage detail = new DetailProductPage();
	private LoginPage login = new LoginPage();

	@Dado("que estou acessando a tela de pesquisa de produtos")
	public void que_estou_acessando_a_tela_de_pesquisa_de_produtos() {
	    home.open();
	}

	@Quando("realizo uma pesquisa pelo termo {string}")
	public void realizo_uma_pesquisa_pelo_termo(String search) {
	    home.searchProduct(search);
	}

	@Entao("{int} produtos que se enquadram nesta pesquisa são exibidos")
	public void produtos_que_se_enquadram_nesta_pesquisa_são_exibidos(int numberProducts) {
	    assertEquals(numberProducts +" resultados", list.getQuantityResult());
	}
	
	@Quando("seleciono o primeiro produto listado")
	public void seleciono_o_primeiro_produto_listado() {
		list.selectFirstProduct();
	}

	@Quando("adiciono o produto ao carrinho")
	public void adiciono_o_produto_ao_carrinho() {
	    detail.addCart();
	}

	@Entao("devo ser direcionado para tela de login")
	public void devo_ser_direcionado_para_tela_de_login() {
	    assertEquals("Olá! Para adicionar ao carrinho, acesse a sua conta", login.getTitle());
	}
	
}
