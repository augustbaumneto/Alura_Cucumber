# language: pt

Funcionalidade: Propondo lances ao leilao
  

  Cenario: Propondo um unico lance valido
    Dado um lance valido
    Quando propoe ao leilao
    Entao o lance e aceito
    
   Cenario: Propondo varios lances validos
    Dado um lance de 10.0 reais do usuario "fulano"
    E um lance de 15.0 reais do usuario "beltrano"
    Quando propoe varios lances ao leilao
    Entao os lances sao aceitos
    
   Esquema do Cenario: Propondo um lance invalido
    Dado um lance de <valor> reais e usuario '<nomeusuario>'
    Quando propoe ao leilao
    Entao o lance nao e aceito
    
    Exemplos: 
    | valor 	| nomeusuario	|
    | 0.0     | fulano			|
    | -1.0    | cigano			|
    | -100.0  | beltrano		|
 
    
   Cenario: Propondo uma sequencia de lances
    Dado dois lances para o mesmo usuario
    | valor 	| nomeusuario	|
    | 10.0    | fulano			|
    | 15.0    | fulano			|
    Quando propoe varios lances ao leilao
    Entao o segundo lance nao e aceito
    