# DRYVE-DESAFIO-1  
Repositório para o teste de recrutamento à vaga de trabalho de desenvolvedor júnior java/kotlin na [Dryve.com.br](https://dryve.com.br).  
  
&nbsp;  
  
*Start 20210311 1830-0300*  
*Last change 20210314 1730-0300*  
  
&nbsp;  
  
## O quê é  
Projeto de uma RESTful-API que utiliza-se de um web-service, com finalidade de cadastrar anúncios de venda de veículo.  
  
Esta API recebe alguns dados básicos de um veículo, recupera uma informação (o preço) deste veículo em uma API pública 
do web-service KBB, grava tais informações em seu banco de dados, e responde as mesmas para o requisitante.  
  
&nbsp;  
  
## Versões  
  
### Versão autal 0.1.0-dev
+ Cadastro de marca
  > *End-point* `/marca`, verbo `POST`;  
  
+ Cadastro de modelo  
  > *End-point* `/modelo`, verbo `POST`;  
  
+ Cadastro de relações modelo-ano  
  > *End-point* `/modelo-ano`, verbo `POST`;  
  
&nbsp;  
  
### Próxima versão 0.2.0-dev
+ Cadastro de marca
  > *End-point* `/marca`, verbo `POST`;  
  
+ Consulta de **uma** marca  
  - Por 'id'. Retorna um objeto, ou nulo;  
  > *End-point* `/marca/id/{um_valor}`, verbo `GET`.
  
+ Cadastro de modelo  
  > *End-point* `/modelo`, verbo `POST`;  
  
+ Consulta de **um** modelo  
  - Por 'id'. Retorna um objeto, ou nulo;  
  > *End-point* `/modelo/id/{um_valor}`, verbo `GET`.
  
+ Cadastro de relações modelo-ano  
  > *End-point* `/modelo-ano`, verbo `POST`;  
  
+ Consulta de **uma** relação modelo-ano  
  - Por 'id'. Retorna um objeto, ou nulo;  
  > *End-point* `/modelo-ano/id/{um_valor}`, verbo `GET`.
  
&nbsp;
  
## Roadmap / To-Do / Tasks  
+ Sumário de funcionalidades: Listar cada end-point disponível no projeto e uma breve descrição de sua função.  
  > *End-point* `/help`, verbo `GET`.  
  
+ Cadastro de marca  
  > *End-point* `/marca`, verbo `POST`;  
  > *End-point* `/marca`, verbo `PUT`;  
  > *End-point* `/marca`, verbo `PATCH`;  
  > *End-point* `/marca`, verbo `DELETE`.  
  
+ Consulta de **uma** marca  
  - Por 'id'. Retorna um objeto, ou nulo;  
  > *End-point* `/marca/id/{um_valor}`, verbo `GET`.  
  
  - Por 'nome-da-marca'. Retorna um objeto, ou nulo.  
  > *End-point* `/marca/nome/{um_valor}`, verbo `GET`.  
  
+ Cadastro de modelo  
  > *End-point* `/modelo`, verbo `POST`;  
  > *End-point* `/modelo`, verbo `PUT`;  
  > *End-point* `/modelo`, verbo `PATCH`;  
  > *End-point* `/modelo`, verbo `DELETE`.  
  
+ Consulta de **um** modelo  
  - Por 'id'. Retorna um objeto, ou nulo;  
  > *End-point* `/modelo/id/{um_valor}`, verbo `GET`.
  
  - Por 'nome-do-modelo'. Retorna um objeto, ou nulo.  
  > *End-point* `/modelo/nome/{um_valor}`, verbo `GET`.  
  
+ Cadastro de relações modelo-ano  
  > *End-point* `/modelo-ano`, verbo `POST`;  
  > *End-point* `/modelo-ano`, verbo `PUT`;  
  > *End-point* `/modelo-ano`, verbo `PATCH`;  
  > *End-point* `/modelo-ano`, verbo `DELETE`.  
  
+ Consulta de **uma** relação modelo-ano  
  - Por 'id'. Retorna um objeto, ou nulo;  
  > *End-point* `/modelo-ano/id/{um_valor}`, verbo `GET`.
  
  - Por 'nome-do-modelo'. Retorna um objeto, ou nulo.  
  > *End-point* `/modelo-ano/nome/{um_valor}`, verbo `GET`.
  
+ Cadastro de veículo  
  > *End-point* `/veiculo`, verbo `POST`;  
  > *End-point* `/veiculo`, verbo `PUT`;  
  > *End-point* `/veiculo`, verbo `PATCH`;  
  > *End-point* `/veiculo`, verbo `DELETE`.  
  
+ Consulta de **um** veículo. Por 'placa'. Retorna um objeto, ou nulo  
  > *End-point* `/veiculo/placa/{um_valor}`, verbo `GET`.  
  
+ Listagem de veículos  
  - **Todos** os veículos cadastrados *(futura funcionalidade: com paginação)*. Retorna uma lista vazia ou populada;  
  > *End-point* `/veiculo`, verbo `GET`.  
  
  - Filtrando por uma determinada 'placa' (ou parte dela) informada pelo usuário. Retorna uma lista vazia ou populada.  
  > *End-point* `/veiculo/{um_valor}`, verbo `GET`.  
  
###### Mais detalhes sobre cada end-point, seus verbos, e suas funcionalidades, vide [documentação do projeto](# "Em breve...") ou o `/help` da aplicação.  
  
&nbsp;  
  
<!--
## Changelog / Dones / Features  
+ Autoapresentação: Descreve brevemente o nome do projeto, sua versão, e seu propósito. *End-point* `/hello`, verbo `GET`.
+ Modelagem das entidades do domínio de negócio: .
  
&nbsp;  
-->
  
## Tecnologia  
+ Java, Spring Boot, Spring Web, Spring Data JPA - Hibernate, Maven, PostgreSQL, Apache-Tomcat, Postman;  
+ Build da aplicação autocontida em pacote `.jar` (o famoso *"fat-jar"*, que contém o servidor Tomcat embutido);
  
&nbsp;  
  
## Influências de "GitFlow"  
  
&nbsp;  
  
### Estrutura básica GitFlow deste projeto:  
+ main: *Branch* primário, inicial, e principal para mesclar/entregar a aplicação para o teste final de utilização. Branch De onde se dá o *release*;  
+ main/develop: *Branch* base para o desenvolvimento da aplicação, apesar de possível ocorrer implementação neste *branch*, evita-se, pois utiliza-se os *branches* específicos para a codificação, tais como citados logo abaixo. Este *branch* nunca deve ser excluído. Após cada *sprint* ou lista-de-metas serem concluídas e mescladas a este *branch* **develop** e devidamente testada, lança o *branch* **release-x.y.z** de acordo com a cultura de versionamento do time-de-desenvolvedores, neste caso sugiro o *SemVer - Semantic Versioning*;  
  - main/develop/feature/apelido-curto-da-feature: *Branch* criado exclusivamente para implementação da feature em questão. Após *feature* concluída e mesclada ao *branch* superior(ou anterior) pode-se (ou não) excluir o *branch* de acordo com a cultura do time de desenvolvedores;  
  - main/develop/bugfix/apelido-curto-do-bug-fix: *Branch* criado exclusivamente para correção do *bug* encontrado em fase de teste (ou equipe de Q&A). Após *bug* corrigido e mesclado ao *branch* superior(ou anterior) pode-se (ou não) excluir o *branch* de acordo com a cultura do time-desenvolvedor;  
+ main/hotfix/apelido-curto-do-hotfix: *Branch* exclusivamente para correção de *bugs* de prioridade máxima (encontrado na aplicação em produção ['em produção' = ativa, em funcionamento, produzindo para o cliente/contratante).  
  
&nbsp;  
  
Por Ronaldo Marques: [RonaldoMarques.dev](https://ronaldomarques.dev "Conheça meu portfólio").  
  
  
