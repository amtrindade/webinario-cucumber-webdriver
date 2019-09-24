#language: pt

Funcionalidade: Compras no Mercado Livre

	Cenário: Realizar pesquisa de produtos
		Dado que estou acessando a tela de pesquisa de produtos
		Quando realizo uma pesquisa pelo termo 'iphone 11'
		Então 33 produtos que se enquadram nesta pesquisa são exibidos
		
		