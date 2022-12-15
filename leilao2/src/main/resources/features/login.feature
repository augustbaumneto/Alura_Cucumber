# language: pt

Funcionalidade: Apenas usuarios cadastrados podem se logar
  

  Cenario: Um usuario valido consegue se logar
    Dado um usuario valido
    Quando realiza login
    Entao e redirecionado para a pagina de leiloes logada
    
   Cenario: Um usuario invalido não consegue se logar
    Dado um usuario invalido
    Quando tenta se logar
    Entao continua na pagina de login
