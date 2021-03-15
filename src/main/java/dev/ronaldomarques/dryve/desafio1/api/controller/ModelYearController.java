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
package dev.ronaldomarques.dryve.desafio1.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import dev.ronaldomarques.dryve.desafio1.domain.model.repository.ModelYearRepository;




/**
 * @author   Ronaldo Marques.
 * @since    20210315.
 * @version  20210315.
 * @category Controladora: Classa especializada em receber as requisições de clientes, processar dados preliminares
 *           (mínimo possível seguindo pricípios de "SOLID"), delegar o processamento principal às respectivas classes
 *           de regras de negócio do domínio, e ou de serviços, e então enviar respostas ao cliente-requisitante.
 * @Análise  ...
 */
@RestController
@RequestMapping(value = "/modelsyears", produces = "application/json;charset=UTF-8")
public class ModelYearController {

	@Autowired
	private ModelYearRepository modelYearRepo;
	
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> listar() {
		
		System.out.println("[DEBUG: "+ this.getClass().getName() +"]");
	
		return ResponseEntity.ok(modelYearRepo.findAll());
	}
}
