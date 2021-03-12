# DRYVE-DESAFIO-1
Repositório para o teste de recrutamento à vaga de trabalho de desenvolvedor júnior java/kotlin na Dryve.com.br .   
  
&nbsp;  
  
*Start 20210311 1830-0300*  
*Last change 20210312 1230-0300*  
  
&nbsp;  
  
## Adota influências de "GitFlow" em seu fluxo de trabalho  
  
&nbsp;  
  
### Estrutura básica GitFlow deste projeto:  
  
+ main: *Branch* primário, inicial, e principal para mesclar/entregar a aplicação para o teste final de utilização. Branch De onde se dá o *release*;  
  
+ main/develop: *Branch* base para o desenvolvimento da aplicação, apesar de possível ocorrer implimentação neste *branch*, evita-se, pois utiliza-se os *branches* específicos para a codificação, tais como citados logo abaixo. Este *branch* nunca deve ser excluído. Após cada *sprint* ou lista-de-metas serem concluídas e mescladas a este *branch* **develop** e devidamente testada, lança o *branch* **release-x.y.z** de acordo com a cultura de versionamento time-desenvolvedor, neste caso sugiro o *SemVer - Semantic Versioning*;  
  
  - main/develop/feature/apelido-curto-da-feature: *Branch* criado exclusivamente para implementação da feature em questão. Após *feature* concluída e mesclada ao *branch* superior(ou anterior) pode-se (ou não) excluir o *branch* de acordo com a cultura do time-desenvolvedor;  
  
  - main/develop/bugfix/apelido-curto-do-bug-fix: *Branch* criado exclusivamente para correção do *bug* encontrado em fase de teste (ou equipe de Q&A). Após *bug* corrigido e mesclado ao *branch* superior(ou anterior) pode-se (ou não) excluir o *branch* de acordo com a cultura do time-desenvolvedor;  
  
+ main/hotfix/apelido-curto-do-hotfix: *Branch* exclusivamente para correção de *bugs* de prioridade máxima (encontrado na aplicação em produção ['em produção' = ativa, em funcionamento, produzindo para o cliente/contratante).  
  
&nbsp;  
  
### Roadmap / To-Do / Tasks  
  
  + Restful-API de auto apresentação: Simplesmente descreve brevemente o nome do projeto, sua versão, e seu propósito. *End-point* (ou *alias*) `/hello-dryve`.  
  
&nbsp;  
  
### Changelog / Dones / Features
  
  + ...  
  
&nbsp;  
  
Por Ronaldo Marques: [RonaldoMarques.dev](https://ronaldomarques.dev "Conheça meu portfólio").  
  