/**
 * DIREITOS, LICENSA E ISENÇÃO DE RESPONSABILIDADE:
 * Este arquivo é parte integrante, indivisível, inseparável de um projeto particular, o qual tem seu uso expressamente
 * exclusivo à seu autor, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * É vetado qualquer utilização, venda, aluguél, distribuição, em partes ou integral deste projeto;
 * Este projeto tem finalidade exclusiva de demonstração de conhecimento e habilidades no desenvolvimento de software
 * para apresentação no processo de recrutamento da empresa Dryve.com.br;
 * Sendo assim, o autor deste projeto não reconhece nem assume qualquer responsabilidade pela utilização do mesmo,
 * tão pouco por qualquer possível reflexos ou consequência de tal utilização.
 * ---
 * RIGHTS, LICENSE AND DISCLAIMER:
 * This file is an integral, indivisible, inseparable part of a particular project, which has its use expressly
 * exclusive to its author, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * Any use, sale, rental, distribution, in parts or integral of this project is prohibited;
 * This project has the sole purpose of demonstrating knowledge and skills in software development
 * for presentation in the recruitment process of Dryve.com.br;
 * Therefore, the author of this project does not recognize or assume any responsibility for the use of it,
 * neither for any possible reflexes or consequence of such use.
 */
package dev.ronaldomarques.dryve.challenge1.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.ronaldomarques.dryve.challenge1.domain.model.entity.ModelYearEntity;
import dev.ronaldomarques.dryve.challenge1.domain.model.repository.ModelYearRepository;
import dev.ronaldomarques.myutility.debugger.DP;



/**
 * @author      Ronaldo Marques.
 * @since       20210315.
 * @last_change 20210328.
 * @version     0.2.0.
 * @category    Controladora: Classa especializada em receber as requisições de clientes.
 * @analysis    Processar dados preliminares, mínimo possível seguindo pricípios de "SOLID", delegar o processamento
 *              principal às respectivas classes de regras de negócio do domínio, e ou de serviços, e então enviar
 *              respostas ao cliente-requisitante.
 */
@RestController
@RequestMapping(value = "/modelsyears", produces = "application/json;charset=UTF-8")
public class ModelYearController {
	
	/* ######## ATENÇÃO: IMPORTANTE REFLEXÃO RELACIONADA AO TAMANHO/COMPLEXIDADE DO PROJETO ########
	 * Dependendo da complexidade e objetivos de cada projeto, determina-se seus design-paterns e princípios de
	 * programação, sem contar fatores culturais da equipe desenvolvedora e fatores relacionados aos recursos
	 * tecnológicos disponíveis e curva-de-aprendizado.
	 * -
	 * Mesmo que este projeto seja pequeno e somente para uma avaliação, demonstrarei um modo de trabalho que criei, que
	 * pode parecer mais complexo do que o simples projeto merece, mas, eu o entendo como bom para uma web-api com
	 * grande longevidade, incrementos e manuteção relativamente frequentes, e desenvolvida por multiplo/as
	 * desenvolvedores ou equipes.
	 * -
	 * Adoto, se é que existe, um design-pattern mesclado de MVC e DDD, deixando perceptível existência de partes
	 * distintas da codificação, cada qual com seu foco/propósito: modelagem de objetos e processos; controladoria do
	 * fluxo de trabalho e divisão de tarefas priorizando a COESÃO e o DESACOPLAMENTO das classes; organização e
	 * disponibilização da comunicação visual; processamento das informações da infraestrutura da aplicação ou de
	 * requisitos técnicos separados do processamento das informações do domínio do negócio.
	 * -
	 * Por último, o mais interessante, tratamento de exceções por camadas: versão futura, talvez "v0.3.0-dev". */
	@Autowired
	private ModelYearRepository modelYearRepo;
	
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> listar() {
		
		DP.pdln(this.getClass().getName() + ".listar();"); // Simple debug printing, using my personal LIB.
		
		return ResponseEntity.ok(modelYearRepo.findAll());
		
	}
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> adicionar(@RequestBody ModelYearEntity modelYearEntity) {
		
		DP.pdln(this.getClass().getName() + ".adicionar();"); // Simple debug printing, using my personal LIB.
		
		return ResponseEntity.status(HttpStatus.CREATED).body(modelYearRepo.save(modelYearEntity));
		
		/* TODO: AINDA POR TERMINAR...
		 * IMPLEMENTAR A CAMADA DE REGRAS DE NEGÓCIO "SERVICE" CONFORME ARQUITETURA DO PROJETO,
		 * NO PACOTE 'dev.ronaldomarques.dryve.challenge1.domain.service'. */
	}
	
}
//
//
//
//
//
//
//
//
