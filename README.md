# DRYVE-DESAFIO-1
Repositório para o teste de recrutamento à vaga de trabalho de desenvolvedor júnior java/kotlin na [Dryve.com.br](https://dryve.com.br).
  
&nbsp;  
  
*Start 20210311 1830-0300*  
*Last change 20210313 1240-0300*  
  
&nbsp;  
  
## O quê é  
Projeto de uma RESTful-API que utiliza-se de um web-service, com finalidade de cadastrar anúncios de venda de veículo.  
  
Esta API recebe alguns dados básicos de um veículo, recupera uma informação (o preço) deste veículo em uma API pública
do web-service KBB, grava tais informações em seu banco de dados, e responde a mesma para o requisitante.  
Continuará...  
  
&nbsp;  
  
## Influências de "GitFlow"  
  
&nbsp;  
  
### Estrutura básica GitFlow deste projeto:  
+ main: *Branch* primário, inicial, e principal para mesclar/entregar a aplicação para o teste final de utilização. Branch De onde se dá o *release*;  
+ main/develop: *Branch* base para o desenvolvimento da aplicação, apesar de possível ocorrer implimentação neste *branch*, evita-se, pois utiliza-se os *branches* específicos para a codificação, tais como citados logo abaixo. Este *branch* nunca deve ser excluído. Após cada *sprint* ou lista-de-metas serem concluídas e mescladas a este *branch* **develop** e devidamente testada, lança o *branch* **release-x.y.z** de acordo com a cultura de versionamento time-desenvolvedor, neste caso sugiro o *SemVer - Semantic Versioning*;  
  - main/develop/feature/apelido-curto-da-feature: *Branch* criado exclusivamente para implementação da feature em questão. Após *feature* concluída e mesclada ao *branch* superior(ou anterior) pode-se (ou não) excluir o *branch* de acordo com a cultura do time-desenvolvedor;  
  - main/develop/bugfix/apelido-curto-do-bug-fix: *Branch* criado exclusivamente para correção do *bug* encontrado em fase de teste (ou equipe de Q&A). Após *bug* corrigido e mesclado ao *branch* superior(ou anterior) pode-se (ou não) excluir o *branch* de acordo com a cultura do time-desenvolvedor;  
+ main/hotfix/apelido-curto-do-hotfix: *Branch* exclusivamente para correção de *bugs* de prioridade máxima (encontrado na aplicação em produção ['em produção' = ativa, em funcionamento, produzindo para o cliente/contratante).  
  
&nbsp;  
  
## Roadmap / To-Do / Tasks  
+ Sumário de funcionalidades: Lista cada End-point disponível no projeto e uma breve descrição de sua função. *End-point* (ou *alias*) `/help`, verbo `GET`.  
+ Cadastro de veículo: Lista cada End-point disponível no projeto e uma breve descrição de sua função. *End-point* (ou *alias*) `/veiculo`.  
+ Consulta de veículo: ...  
###### Mais detalhes sobre cada end-point, seus verbos, e suas funcionalidades, vide [documentação do projeto](#) ou o `/help` da aplicação.       
  
&nbsp;  
  
## Changelog / Dones / Features  
+ Auto apresentação: Descreve brevemente o nome do projeto, sua versão, e seu propósito. *End-point* (ou *alias*) `/hello`, verbo `GET`.  
  
&nbsp;  
  
## Tecnologia  
+ Java, Spring Boot, Spring Web, Spring Data JPA, Maven, PostgreSQL, Apache-Tomcat;  
+ Build da aplicação autocontida em pacote `.jar` (Fat Jar, que contem o servidor Tomcat embutido);
  
&nbsp;  
  
Por Ronaldo Marques: [RonaldoMarques.dev](https://ronaldomarques.dev "Conheça meu portfólio").  
  
  
<!--
&nbsp;  
  
## Tópico  
A...  
  
-->