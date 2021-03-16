# DRYVE-DESAFIO-1  
Repositório para o teste de recrutamento à vaga de trabalho de desenvolvedor júnior java/kotlin na [Dryve.com.br](https://dryve.com.br).  
  
&nbsp;  
  
*Start 20210311 1830-0300*  
*Last change 20210316 0810-0300*  
  
&nbsp;  
  
## O quê é  
Projeto de uma RESTful-API que utiliza-se de um web-service, com finalidade de cadastrar anúncios de venda de veículo.  
  
Esta API recebe alguns dados básicos de um veículo, recupera uma informação (o preço) deste veículo em uma API pública 
do web-service KBB, grava tais informações em seu banco de dados, e responde as mesmas para o requisitante.  
  
&nbsp;  
  
## Versões  
  
### Versão anterior 0.1.0-**beta** &nbsp; ::concluída
+ Listagem de marcas
    > *End-point* `/brands`, método-http `GET`;  
  
+ Listagem de modelo  
  > *End-point* `/models`, método-http `GET`;  
  
+ Listagem de relações modelo-ano  
  > *End-point* `/modelsyears`, método-http `GET`;  
  
+ Listagem de veículos-anunciados *(automotores)*
  > *End-point* `/motorvehicles`, método-http `GET`;  
  
&nbsp;  
  
### Versão atual 0.2.0-**dev** &nbsp; ::em desenvolvimento
+ Todas as funcionalidades da versão anteior, mais...
+ Cadastro de marcas
  > *End-point* `/brands`, método-http `POST`, corpo *(payload)* `objeto em JSON`;  
  
+ Cadastro de modelos  
  > *End-point* `/models`, método-http `POST`, corpo *(payload)* `objeto em JSON`;  
  
+ Cadastro de relações modelo-ano  
  > *End-point* `/modelsyears`, método-http `POST`, corpo *(payload)* `objeto em JSON`;  
  
+ Cadastro de veículos-anunciados *(automotores)*  
  > *End-point* `/motorvehicles`, método-http `POST`, corpo *(payload)* `objeto em JSON`;    
  
&nbsp;
  
## Roadmap / To-Do / Tasks  
### Versão Objetivo 1.0.0-**release**  
+ Autoapresentação: Retorna pequeno texto com nome e versão da aplicação, e uma instrução inicial.  
  > *End-point* `/hello`, método-http `GET`.  
  
+ Sumário de funcionalidades: Retorna uma **lista** de cada end-point disponível no projeto e uma breve descrição de sua função.  
  > *End-point* `/help`, método-http `GET`.  
  
+ Listagem de URIs  
  - Listagem comun de todos registros de cada URI. Retorna uma _**ResponseEntity**_ com uma **lista** vazia ou populada no _**body**_.
  > *End-point* `/brands`, método-http `GET`;
  > *End-point* `/models`, método-http `GET`;
  > *End-point* `/modelsyears`, método-http `GET`;
  > *End-point* `/motovehicles`, método-http `GET`;
  
  - **Todos** os veículos cadastrados. Retorna uma _**ResponseEntity**_ com uma lista **vazia** ou populada no _**body**_;  
  > *End-point* `/motorvehicles`, método-http `GET`.  
  
  - **Filtrando por uma** determinada 'placa' (ou parte dela) informada pelo usuário. Retorna uma _**ResponseEntity**_ com uma lista **vazia** ou populada no _**body**_.  
  > *End-point* `/motorvehicles/{um_valor}`, método-http `GET`.  
  
+ Cadastro de marcas
  - Retorna uma _**ResponseEntity**_ com uma **instância** do objedo persistido ou nulo no _**body**_.  
  > *End-point* `/brands`, método-http `POST`;  
  > *End-point* `/brands`, método-http `PUT`;  
  > *End-point* `/brands`, método-http `PATCH`;  
  > *End-point* `/brands`, método-http `DELETE`.  
  
+ Consulta de **uma** marca  
  - Por **um** 'id'. Retorna uma _**ResponseEntity**_ com uma **instância** do objedo consultado ou nulo no _**body**_.    
  > *End-point* `/brands/id/{um_valor}`, método-http `GET`.  
  
  - Por **um** 'nome-da-marca'. Retorna uma _**ResponseEntity**_ com uma **instância** do objedo consultado ou nulo no _**body**_.  
  > *End-point* `/brands/name/{um_valor}`, método-http `GET`.  
  
+ Cadastro de modelos  
  - Retorna uma _**ResponseEntity**_ com uma **instância** do objedo persistido ou nulo no _**body**_.
  > *End-point* `/models`, método-http `POST`;  
  > *End-point* `/models`, método-http `PUT`;  
  > *End-point* `/models`, método-http `PATCH`;  
  > *End-point* `/models`, método-http `DELETE`.  
  
+ Consulta de **um** modelo  
  - Por **um** 'id'. Retorna uma _**ResponseEntity**_ com uma **instância** do objedo consultado ou nulo no _**body**_.  
  > *End-point* `/modelo/id/{um_valor}`, método-http `GET`.
  
  - Por **um** 'nome-do-modelo'. Retorna uma _**ResponseEntity**_ com uma **instância** do objedo consultado ou nulo no _**body**_.  
  > *End-point* `/modelo/name/{um_valor}`, método-http `GET`.  
  
+ Cadastro de relações modelo-ano  
  - Retorna uma _**ResponseEntity**_ com uma **instância** do objedo persistido ou nulo no _**body**_.  
  > *End-point* `/modelsyears`, método-http `POST`;  
  > *End-point* `/modelsyears`, método-http `PUT`;  
  > *End-point* `/modelsyears`, método-http `PATCH`;  
  > *End-point* `/modelsyears`, método-http `DELETE`.  
  
+ Consulta de **uma ou mais** relação modelo-ano  
  - Por **um** 'id'. Retorna uma _**ResponseEntity**_ com uma **instância** do objedo consultado ou nulo no _**body**_.  
  > *End-point* `/modelsyears/id/{um_valor}`, método-http `GET`.
  
  - Por **um** 'nome-do-modelo'. Retorna uma _**ResponseEntity**_ com uma lista **vazia** ou populada no _**body**_;  
  > *End-point* `/modelsyears/name/{um_valor}`, método-http `GET`.
  
+ Cadastro de veículo-anunciado *(automotor)*
  - Retorna uma _**ResponseEntity**_ com uma **instância** do objedo persistido ou nulo no _**body**_.  
  > *End-point* `/motorvehicles`, método-http `POST`;  
  >> Integrado API KBB externa para armazenar o atributo `kbb_id`.  
  > *End-point* `/motorvehicles`, método-http `PUT`;  
  >> Integrado API KBB externa para armazenar o atributo `kbb_id`.  
  > *End-point* `/motorvehicles`, método-http `PATCH`;  
  >> Integrado API KBB externa para armazenar o atributo `kbb_id`.  
  > *End-point* `/motorvehicles`, método-http `DELETE`.  
  
+ Consulta de **um** veículo-anunciado.
  - Por **uma** 'placa'. Retorna uma _**ResponseEntity**_ com uma **instância** do objedo consultado ou nulo no _**body**_.
  > *End-point* `/motorvehicles/plate/{um_valor}`, método-http `GET`.  
  
###### Mais detalhes sobre cada end-point, seus verbos, e suas funcionalidades, vide [documentação do projeto](documentation/ "Em breve...").  
  
&nbsp;  
  
  
## Tecnologia  
+ Java, Spring Boot, Spring Web, Spring Data JPA - Hibernate, Maven, PostgreSQL, Apache-Tomcat, Postman;  
+ Build da aplicação autocontida em pacote `.jar` (o famoso *"fat-jar"*, que contém o servidor Tomcat embutido);
  
&nbsp;  
  
## Influências de "GitFlow"  
### Estrutura básica GitFlow deste projeto:  
+ main: *Branch* primário, inicial, e principal para mesclar/entregar a aplicação para o teste final de utilização. Branch De onde se dá o *release*;  
+ main/develop: *Branch* base para o desenvolvimento da aplicação, apesar de possível ocorrer implementação neste *branch*, evita-se, pois utiliza-se os *branches* específicos para a codificação, tais como citados logo abaixo. Este *branch* nunca deve ser excluído. Após cada *sprint* ou lista-de-metas serem concluídas e mescladas a este *branch* **develop** e devidamente testada, lança o *branch* **release-x.y.z** de acordo com a cultura de versionamento do time-de-desenvolvedores, neste caso sugiro o *SemVer - Semantic Versioning*;  
  - main/develop/feature/apelido-curto-da-feature: *Branch* criado exclusivamente para implementação da feature em questão. Após *feature* concluída e mesclada ao *branch* superior(ou anterior) pode-se (ou não) excluir o *branch* de acordo com a cultura do time de desenvolvedores;  
  - main/develop/bugfix/apelido-curto-do-bug-fix: *Branch* criado exclusivamente para correção do *bug* encontrado em fase de teste (ou equipe de Q&A). Após *bug* corrigido e mesclado ao *branch* superior(ou anterior) pode-se (ou não) excluir o *branch* de acordo com a cultura do time-desenvolvedor;  
+ main/hotfix/apelido-curto-do-hotfix: *Branch* exclusivamente para correção de *bugs* de prioridade máxima (encontrado na aplicação em produção ['em produção' = ativa, em funcionamento, produzindo para o cliente/contratante).  
  
&nbsp;  
  
## A Arquitetura do Projeto  
### Pacotes
T...  
  
  
### Classes e seus propósitos
T...  
  
&nbsp;  
  
Por Ronaldo Marques: [RonaldoMarques.dev](https://ronaldomarques.dev "Conheça meu portfólio").  
  
  
