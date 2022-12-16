# language: pt

@login
Funcionalidade: Apenas usuarios cadastrados podem se logar
  

  Cenario: Um usuario valido consegue se logar
    Dado um usuario valido
    Quando tenta se logar
    Entao e redirecionado para a pagina de leiloes logada
    
   Cenario: Um usuario invalido não consegue se logar
    Dado um usuario invalido
    Quando tenta se logar
    Entao continua na pagina de login
