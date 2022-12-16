# language: pt

@leilao
Funcionalidade: Cadastrando um leilão
  
  Contexto: 
  	Dado um usuário logado
  
  
  Cenario: Um usuario logado pode cadastrar um leilão
    
    Quando acessa a página de novo leilão
    E preenche o formulário com dados válidos clicando em salvar
    Então volta para a página de leilões
    E o novo leilão é criado na tabela
    
