# Projeto de automa��o Z� Delivery

Cria��o do projeto para o teste do enviado por Leticia ZTech

Para os cen�rios mais importantes ou fluxo mais importantes da plataforma do Z� Delivery posso pontuar v�rios cen�rios.

Mas como eu nunca usei o Z� Delivery vou pontuar os que achei mais cr�ticos
at� o ponto onde cheguei para realizar a automa��o.

Desafio 1

 - Cria��o de usu�rio
    - Esse fluxo � uns dos principais para o uso da plataforma, ent�o temos que garantir que essa funcionalidade
      esteja sempre dispon�vel para que o usu�rio possa ter uma boa exper�ncia ao usar a plataforma pela primeira vez.
 - Altera��o de dados
    - Para a altera��o do celular caso o usu�rio mude de n�mero (Acho que encontrei um problema aqui). 
    Eu alterei o celular mas n�o confirmei porque era um n�mero que n�o existe, agora tento voltar para
    o meu n�mero e n�o consigo. D� a mensagem de telefone j� em uso :(
 - Login de usu�rio
    - Como descrito no desafio esse fluxo � essencial para que o usu�rio possa usar a plataforma.
    Garantir que a funcionalidade sempre esteja funcionando a cada atualiza��o da aplica��o
 - Login via Facebook
    - Mesma descri��o acima, por�m � um facilitador de cadastro. Usabilidade
 - logout de usu�rio
    - Seguran�a dos dados do usu�rio, garantir que o usu�rio fa�a o logout com sucesso.
 - Recupera��o de senha
    - Fluxo muito importante para que o usu�rio ao tentar a plataforma, possa recuperar sua senha e utilizar o servi�o
    sem problemas
 - Cadastro de endere�o
    - Outro fluxo importante para que o usu�rio possa receber corretamente seu pedido.
 - Edi��o de endere�o
    - Garantir que a altera��o do endere�o esteja sendo atualizado quando o cliente solicita
 - Busca de endere�os
    - Outro fluxo importante para que o usu�rio possa receber seu pedido no local em que esta e garantir que n�o ir� 
    receber em outro local
 - Busca de produtos dispon�veis
    - Busca de produtos efetiva e assertiva para o usu�rio ter a melhor experi�ncia.
 
Desafio 2

O fluxo mais importante � a efetiva��o de um pedido ent�o foi o fluxo que automatizei. Coloquei um coment�rio no final do teste
pois n�o finalizei o pedido. Mas para mim o mais importante de tudo � a efetiva��o do pedido.
Eu fiz o teste automatizado mais simples poss�vel, mas o importante � validar os valores, os dados, altera��es do pedido, as restri��es ao realizar um pedido,
os m�todos de pagamentos selecionados entre outros.
Neste teste indiretamente testa o login.
Nas o correto � ter um teste para cada funcionalidade e depois esse integrado para validar o cen�rio completo.
OBS: Colocar um login e senha v�lidos no teste.


O teste mobile eu usaria o Appium para realizar as valida��es, com um build do APK e executando os testes sobre esta vers�o.
Sobre testes mobile eu n�o tenho tanta experi�ncia, mas consigo me virar bem em quest�o de automa��o e/ou testes manunais.

Desafio 3

O teste da API Open Weather fiz somente dois, os valores est�o mockados, mas podemos interagir entre elas.
Exemplo: buscar uma cidade por Nome fazer as valida��es necess�rias, pegar o ID da cidade e buscar via id
fazendo as valida��es necessarias, como o nome da cidade e etc.

Na resposta podemos validar diversas informa��es guardando essas informa��es e buscando nos outros endpoints.
Existe tamb�m a poss�bilidade de realizar um teste de contrato das API para valida o retorno das respostas
Assim garantimos a integra��o com o servi�o n�o "quebre" quem est� consumindo.


# Para executar o projeto

 - Abrir na sua IDE, usei IntelliJ e executar os testes que foram feitos com JUnit.