# Projeto de automação Zé Delivery

Criação do projeto para o teste do enviado por Leticia ZTech

Para os cenários mais importantes ou fluxo mais importantes da plataforma do Zé Delivery posso pontuar vários cenários.

Mas como eu nunca usei o Zé Delivery vou pontuar os que achei mais críticos
até o ponto onde cheguei para realizar a automação.

Desafio 1

 - Criação de usuário
    - Esse fluxo é uns dos principais para o uso da plataforma, então temos que garantir que essa funcionalidade
      esteja sempre disponível para que o usuário possa ter uma boa experência ao usar a plataforma pela primeira vez.
 - Alteração de dados
    - Para a alteração do celular caso o usuário mude de número (Acho que encontrei um problema aqui). 
    Eu alterei o celular mas não confirmei porque era um número que não existe, agora tento voltar para
    o meu número e não consigo. Dá a mensagem de telefone já em uso :(
 - Login de usuário
    - Como descrito no desafio esse fluxo é essencial para que o usuário possa usar a plataforma.
    Garantir que a funcionalidade sempre esteja funcionando a cada atualização da aplicação
 - Login via Facebook
    - Mesma descrição acima, porém é um facilitador de cadastro. Usabilidade
 - logout de usuário
    - Segurança dos dados do usuário, garantir que o usuário faça o logout com sucesso.
 - Recuperação de senha
    - Fluxo muito importante para que o usuário ao tentar a plataforma, possa recuperar sua senha e utilizar o serviço
    sem problemas
 - Cadastro de endereço
    - Outro fluxo importante para que o usuário possa receber corretamente seu pedido.
 - Edição de endereço
    - Garantir que a alteração do endereço esteja sendo atualizado quando o cliente solicita
 - Busca de endereços
    - Outro fluxo importante para que o usuário possa receber seu pedido no local em que esta e garantir que não irá 
    receber em outro local
 - Busca de produtos disponíveis
    - Busca de produtos efetiva e assertiva para o usuário ter a melhor experiência.
 
Desafio 2

O fluxo mais importante é a efetivação de um pedido então foi o fluxo que automatizei. Coloquei um comentário no final do teste
pois não finalizei o pedido. Mas para mim o mais importante de tudo é a efetivação do pedido.
Eu fiz o teste automatizado mais simples possível, mas o importante é validar os valores, os dados, alterações do pedido, as restrições ao realizar um pedido,
os métodos de pagamentos selecionados entre outros.
Neste teste indiretamente testa o login.
Nas o correto é ter um teste para cada funcionalidade e depois esse integrado para validar o cenário completo.
OBS: Colocar um login e senha válidos no teste.


O teste mobile eu usaria o Appium para realizar as validações, com um build do APK e executando os testes sobre esta versão.
Sobre testes mobile eu não tenho tanta experiência, mas consigo me virar bem em questão de automação e/ou testes manunais.

Desafio 3

O teste da API Open Weather fiz somente dois, os valores estão mockados, mas podemos interagir entre elas.
Exemplo: buscar uma cidade por Nome fazer as validações necessárias, pegar o ID da cidade e buscar via id
fazendo as validações necessarias, como o nome da cidade e etc.

Na resposta podemos validar diversas informações guardando essas informações e buscando nos outros endpoints.
Existe também a possíbilidade de realizar um teste de contrato das API para valida o retorno das respostas
Assim garantimos a integração com o serviço não "quebre" quem está consumindo.


# Para executar o projeto

 - Abrir na sua IDE, usei IntelliJ e executar os testes que foram feitos com JUnit.