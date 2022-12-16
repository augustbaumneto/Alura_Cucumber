# language: pt

@leilao
Funcionalidade: Cadastrando um leilão
  
  Cenario: Um usuario logado pode cadastrar um leilão
    Dado um usuário logado
    Quando acessa a página de novo leilão
    E preenche o formulário com dados válidos clicando em salvar
    Então volta para a página de leilões
    E o novo leilão é criado na tabela
    
