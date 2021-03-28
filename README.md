# DRYVE CHALLENGE 1  
pt-BR: Repositório para o teste de recrutamento à vaga de trabalho de desenvolvedor júnior java/kotlin na [Dryve.com.br](https://dryve.com.br).  
  
en-US: Repository for the recruitment test for the junior java/kotlin job vacancy at [Dryve.com.br](https://dryve.com.br).  
  
&nbsp;  
&nbsp;  
  
*Start 202103112130-UTC/GMT/Z-time*  
*Last change 202103281321-UTC/GMT/Z-time*  
  
&nbsp;  
&nbsp;  
  
## O QUÊ É / WHAT IT IS
pt-BR: Projeto de uma RESTful-API que utiliza-se de um web-service, com finalidade de cadastrar anúncios de venda de veículo. Esta API recebe alguns dados básicos de um veículo, recupera uma informação (o preço) deste veículo em uma API pública do web-service KBB, grava tais informações em seu banco de dados, e responde as mesmas para o requisitante.  
pt-BR:  **Agora, projeto _refatorado_ em nova fase** de desenvolvimento volutário para posteridade e portfólio.  
  
en-US: Project of a RESTful-API that uses a web-service, in order to register ads for vehicle sales. This API receives some basic data from a vehicle, retrieves an information (the price) of this vehicle in a public API of the KBB web-service, records such information in its database, and responds to the requestor.  
en-US: **Now, _refactored_ project in a new phase** of voluntary development for posterity and portfolio.  
  
  > **Nota / Note: next project's version is going to be implemented and documented in english only.**  
  
&nbsp;  
&nbsp;  
  
## VERSÕES / VERSIONS
  
### Versão atual / Current Version 0.2.0-dev
Todas as funcionalidades da versão anteior, mais... / All features from last version, plus...
+ Cadastro de marcas / Brands registry
  > *End-point* `/brands`, http-method `POST`, corpo *(payload)* `objeto em JSON`;  
  
+ Cadastro de modelos / Models registry
  > *End-point* `/models`, http-method `POST`, corpo *(payload)* `objeto em JSON`;  
  
+ Cadastro de relações modelo-ano / Model-year relation registry
  > *End-point* `/modelsyears`, http-method `POST`, corpo *(payload)* `objeto em JSON`;  
  
+ Cadastro de veículos-anunciados *(automotores)* / Advertised vehicles registry (motor vehicles)
  > *End-point* `/motorvehicles`, http-method `POST`, corpo *(payload)* `objeto em JSON`;    
  
&nbsp;
  
### Versão anterior / Last Version 0.1.0-beta
+ Listagem de marcas / Brands listing
    > *End-point* `/brands`, http-method `GET`;  
  
+ Listagem de modelo / Models listing
  > *End-point* `/models`, http-method `GET`;  
  
+ Listagem de relações modelo-ano / Model-year relation listing
  > *End-point* `/modelsyears`, http-method `GET`;  
  
+ Listagem de veículos-anunciados (automotores) / Advertised vehicles listing (motor vehicles)
  > *End-point* `/motorvehicles`, http-method `GET`;  
  
&nbsp;  
&nbsp;  
  
## Diretrizes Roteiro / Guideline Roadmap
### Futura versão / Future version 0.**3**.0-beta
+ Description..
  
&nbsp;  
  
### Futura versão / Future version 0.**4**.0-beta
+ Description..
  
&nbsp;  
  
### Futura versão / Future version 0.**5**.0-beta
+ Description..
  
&nbsp;  
  
### Versão objetivo final / Final objective version 1.0.0-release
+ Autoapresentação: retorna pequeno texto com nome e versão da aplicação, e uma instrução inicial. / Self-presentation: returns a smal text with application's version name, and an initial introduction.
  > *End-point* `/hello`, http-method `GET`.  
  
+ Sumário de funcionalidades: retorna uma lista de cada end-point disponível no projeto e uma breve descrição de sua função. / Summary fo the features: returns a list of each avalable end-point in the project and a breif description of its fuction.
  > *End-point* `/help`, http-method `GET`.  
  
+ Listagem de cada URI / Listing of each URI
  - Listagem de todos os objetos registrados em seu respectivo URI. Retorna uma `ResponseEntity` com uma `List` vazia ou populada no `body` da `Response`. / List of all objects registered in their respective URI. Returns a `ResponseEntity` with an empty or populated `List` in `body` of the `Response`.
  > *End-point* `/brands`, http-method `GET`;  
  > *End-point* `/models`, http-method `GET`;  
  > *End-point* `/modelsyears`, http-method `GET`;  
  > *End-point* `/motovehicles`, http-method `GET`;  
  
  - Filtrando por uma determinada 'placa' (ou parte dela) informada pelo usuário. Retorna uma `ResponseEntity` com uma `list` vazia ou populada no `body` da `Response`. / Filtering for a particular 'plate' (or part of it) informed by the user. Returns a `ResponseEntity` with an empty or populated `List` in `body` of the `Response`.
  > *End-point* `/motorvehicles/{some_value}`, http-method `GET`.  
  
+ Cadastro de marcas / Registry of brands
  - Retorna uma `ResponseEntity` com uma instância do objeto persistido/excluído no `body` da `Response`, em caso de procedimento bem sucedido; caso contrário `ResponseEntity` não tem instância do objeto (nulo) no `body` da `Response`. / Returns a `ResponseEntity` with an instance of the just persisted/deleted object in `body` of the `Response`, in case of successful procedure; Otherwise `Response` has no instance of the object (null) in `body` of the `Response`.
  > *End-point* `/brands`, http-method `POST`, payload `JASON`;  
  > *End-point* `/brands`, http-method `PUT`, payload `JASON`;  
  > *End-point* `/brands`, http-method `PATCH`, payload `JASON`;  
  > *End-point* `/brands`, http-method `DELETE`, payload `JASON`.  
  
+ Consulta de **uma** marca específica / Consultation of **a** specific brand
  - Por **um** `id`. Retorna uma `ResponseEntity` com uma instância do objedo consultado, ou nulo, no `body` da `Response`. / By **an** `id`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/brands/id/{some_value}`, http-method `GET`.  
  
  - Por **um** `nome` da marca. Retorna uma `ResponseEntity` com uma instância do objedo consultado, ou nulo, no `body` da `Response`. / By **a** brand's `name`. Returns a `ResponseEntity` with an instance of the consulted object, or null in `body` of the `Response`.
  > *End-point* `/brands/name/{some_value}`, http-method `GET`.  
  
+ Cadastro de modelos / Registry of models
  - Retorna uma `ResponseEntity` com uma instância do objedo persistido/excluído no `body` da `Response`, em caso de procedimento bem sucedido; caso contrário `ResponseEntity` não tem instância do objeto (nulo) no `body` da `Response`. / Returns a `ResponseEntity` with an instance of the just persisted/deleted object in `body` of the `Response`, in case of successful procedure; Otherwise `Response` has no instance of the object (null) in `body` of the `Response`.
  > *End-point* `/models`, http-method `POST`, payload `JASON`;  
  > *End-point* `/models`, http-method `PUT`, payload `JASON`;  
  > *End-point* `/models`, http-method `PATCH`, payload `JASON`;  
  > *End-point* `/models`, http-method `DELETE`, payload `JASON`.  
  
+ Consulta de **um** modelo / Consultation of a specific model
  - Por **um** `id`. Retorna uma `ResponseEntity` com uma instância do objedo consultado, ou nulo, no `body` da `Response`. / By **an** `id`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/models/id/{some_value}`, http-method `GET`.
  
  - Por **um** `nome` do modelo. Retorna uma `ResponseEntity` com uma instância do objedo consultado, ou nulo, no `body` da `Response`. / By **a** model's `name`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/models/name/{some_value}`, http-method `GET`.  
  
+ Cadastro de relações modelo-ano / Registry of model-year relation
  - Retorna uma `ResponseEntity` com uma instância do objedo persistido/excluído no `body` da `Response`, em caso de procedimento bem sucedido; caso contrário `ResponseEntity` não tem instância do objeto (nulo) no `body` da `Response`. / Returns a `ResponseEntity` with an instance of the just persisted/deleted object in `body` of the `Response`, in case of successful procedure; Otherwise `Response` has no instance of the object (null) in `body` of the `Response`.
  > *End-point* `/modelsyears`, http-method `POST`, payload `JASON`;  
  > *End-point* `/modelsyears`, http-method `PUT`, payload `JASON`;  
  > *End-point* `/modelsyears`, http-method `PATCH`, payload `JASON`;  
  > *End-point* `/modelsyears`, http-method `DELETE`, payload `JASON`.  
  
+ Consulta de **uma ou mais** relação modelo-ano / Consultation of **one or more** model-year relation
  - Por **um** `id`. Retorna uma `ResponseEntity` com uma instância do objedo consultado, ou nulo, no `body` da `Response`. / By **an** `id`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/modelsyears/id/{some_value}`, http-method `GET`.
  
  - Por **um** `nome` do modelo. Retorna uma `ResponseEntity` com uma `list` populada ou vazia de instância do objedo consultado, no `body` da `Response`. By **a** model's `name`. Returns a `ResponseEntity` with an `list` populated or empty of instance of the consulted object, in `body` of the `Response`.
  > *End-point* `/modelsyears/name/{some_value}`, http-method `GET`.
  
+ Cadastro de veículo-anunciado (automotor) / Registry of advertised-vehicle (motor vehicles)
  - Retorna uma `ResponseEntity` com uma instância do objedo persistido/excluído no `body` da `Response`, em caso de procedimento bem sucedido; caso contrário `ResponseEntity` não tem instância do objeto (nulo) no `body` da `Response`. / Returns a `ResponseEntity` with an instance of the just persisted/deleted object in `body` of the `Response`, in case of successful procedure; Otherwise `Response` has no instance of the object (null) in `body` of the `Response`.
  > *End-point* `/motorvehicles`, http-method `POST`;  
  > *End-point* `/motorvehicles`, http-method `PUT`;  
  > *End-point* `/motorvehicles`, http-method `PATCH`;  
  >> Integrados API KBB externa para armazenar o atributo `kbb_id`.  
  >  
  > *End-point* `/motorvehicles`, http-method `DELETE`.  
  >   
  
+ Consulta de **um** veículo-anunciado. / Consultation of a specific advertised vehicle (motor vehicle)
  - Por **uma** `placa`. Retorna uma `ResponseEntity` com uma instância do objedo consultado, ou nulo, no `body` Response. / By **a** `plate`. Returns a `ResponseEntity` with an instance of the consulted object, or null, in `body` of the `Response`.
  > *End-point* `/motorvehicles/plate/{some_value}`, http-method `GET`.  
  
###### More details about the end-points, their methods, and their features, see [project documentation](documentation/ "Soon...").
  
&nbsp;  
&nbsp;  
  
## TECNOLOGIAS / TECHNOLOGIES  
+ Java, Spring Boot, Spring Web, Spring Data JPA (Hibernate), Maven, PostgreSQL, Apache-Tomcat, Postman;  
+ Built as a standalone/self-contained application with "file.jar" packaging (the famous "fat-jar", which contains the built-in Apache-Tomcat server);
  
&nbsp;  
&nbsp;

  /* parei aki
   After each sprint ends goals list be reached and merged to this branch (develop) so properly tested, lança o *branch* **release-x.y.z** de acordo com a cultura de versionamento do time-de-desenvolvedores, neste caso sugiro o *SemVer - Semantic Versioning*
 */
  
## INFLUÊNCIAS DE GITFLOW / GITFLOW INFLUENCES
### *GITFLOW*'s Basic Structure In This Projeto
+ **_main_**: primary branch, the initial one, and the main one, which receive (merging) else branches, then to perform the full-test of the version before release. This is the branch from which the "release branch" occurs; This branch must never be deleted;
+ main/**_develop_**: the base-branch to the application development, although it is possible to occur some implementation in it, it is discouraged, as exists specifics branches to the features coding, such as the pointed ones below. This branch must never be deleted;
  - main/develop/**_feature_**/**_shot_alias_**: this branch is created exclusively for feature implementation, a chosen feature according to the Project Backlog and Sprint Backlog, as it can be noticed through this feature's name. After the feature is completed and merged with the source branch, you can (or not) delete the branch according to the development team's culture and the needs of the project;  
  - main/develop/**_bugfix_**/**_bug's_short_alias_**: this branch is created exclusively for currection of the bug (or else issues) mentioned at the branch's alias, which used to be found in test phase (or Q&A team). After the job on the bug/issue has been completed and merged with the source branch, you can (or not) delete the branch according to the development team's culture and the needs of the project;  
+ main/**_hotfix_**/**_hotfix's_short_alias_**: this branch is created exclusively for correction of the max priority bugs (or else issues) mentioned at the branch's alias, which are found in the prerelease test phase (or Q&A team) or more commonly found by the user, so reported after release.
  
  
&nbsp;  
&nbsp;  
  
## ARQUITETURA DO PROJETO / PROJECT ARCHITECTURE
### Pacotes / Packages
Description...  
  
  
### Classes e seus propósitos / Classes and their purposes
Description...  
  
&nbsp;  
&nbsp;  
  
<a name="author"></a>
## Att. Ronaldo Marques.
###### | https://ronaldomarques.dev | [linkedin @ronaldo marques](https://linkedin.com/in/ropimasi/) | [twitter @ropimasi](https://twitter.com/ropimasi/) | [insta @ropimasi](https://instagram.com/ropimasi/) | ronaldomarques@email.com |  
&nbsp;  
  
  