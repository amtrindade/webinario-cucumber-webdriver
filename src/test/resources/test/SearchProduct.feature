#language: pt

Funcionalidade: Compras no Mercado Livre

	Sendo um usuário do ecommerce Mercado Livre
	Posso realizar pesquisas por produtos de meu interesse
	Pois assim consigo identificar as melhoras oportunidades para compra
				
#	Esquema do Cenário: Realizar pesquisa de produtos
#		Dado que estou acessando a tela de pesquisa de produtos
#		Quando realizo uma pesquisa pelo termo <product>
#		Então <quantity> produtos que se enquadram nesta pesquisa são exibidos
#		
#		Cenários: 
#		|product					|quantity|
#		|'iPhone 11'				|32|
#		|'dvd rock in rio 30 anos'	|51|
#		|'samsung galaxy s11'		|100|
		
	Cenário: Adicionar produto ao carrinho
		Dado que estou acessando a tela de pesquisa de produtos
			E realizo uma pesquisa pelo termo 'iPhone 11'
		Quando seleciono o primeiro produto listado
			E adiciono o produto ao carrinho
		Então devo ser direcionado para tela de login	
	