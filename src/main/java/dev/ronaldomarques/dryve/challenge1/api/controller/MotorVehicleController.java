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


import static dev.ronaldomarques.myutility.debugger.DP.pdln;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import dev.ronaldomarques.dryve.challenge1.api.dto.MotorVehicleDtoInlet;
import dev.ronaldomarques.dryve.challenge1.api.dto.MotorVehicleDtoOutlet;
import dev.ronaldomarques.dryve.challenge1.domain.model.entity.MotorVehicleEntity;
import dev.ronaldomarques.dryve.challenge1.domain.model.repository.MotorVehicleRepository;
import dev.ronaldomarques.dryve.challenge1.domain.service.MotorVehicleEntityConversion;
import dev.ronaldomarques.dryve.challenge1.domain.service.MotorVehicleRegistryService;



/**
 * @author      Ronaldo Marques.
 * @since       20210315.
 * @last_change 20210430.
 * @version     0.2.1-beta.
 * @category    Controladora: Classe especializada em receber as requisições de clientes.
 * @analysis    Processar dados preliminares, mínimo possível seguindo pricípios de "SOLID", delegar o processamento
 *              principal às respectivas classes de regras de negócio do domínio, e ou de serviços, e então enviar
 *              respostas ao cliente-requisitante.
 */
@RestController
@RequestMapping(value = "/motorvehicles", produces = "application/json;charset=UTF-8")
public class MotorVehicleController {
	
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
	 * Por último, o mais interessante, tratamento de exceções por camadas: versão futura, talvez "0.3.0". */
	@Autowired
	private MotorVehicleRepository motorVehicleRepo;
	private MotorVehicleRegistryService motorVehicleRegistryServ;
	
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> listar() {
		
		pdln(this.getClass().getName() + ".listar();"); // Simple debug printing, using my personal LIB.
		
		/* 1st step get entity list from repository. */
		List<MotorVehicleEntity> mvEntities = new ArrayList<>();
		mvEntities = motorVehicleRepo.findAll();
		
		pdln(" mvEntities.toString() depois de .findAll(); -->[" + mvEntities.toString() + "]");
		
		/* 2nd step convert entity list to DTOOutlet list. */
		List<MotorVehicleDtoOutlet> mvDtoOutlets = new ArrayList<>();
		mvDtoOutlets = MotorVehicleEntityConversion.toDtoOutletList(mvEntities);
		
		pdln(" mvDtoOutlets.toString() depois de .toDtoOutletList(); -->[" + mvDtoOutlets.toString() + "]");
		
		/* 3rd step retun the DTOOutlet list. */
		return ResponseEntity.ok(mvDtoOutlets);
		
	}
	
	
	
	@PostMapping
	public ResponseEntity<?> adicionar(@RequestBody MotorVehicleDtoInlet mvDtoInlet) {
		
		/* FIXME: somewhere deeper I have a bug to be fixed, the storageing MotorVehicle is not correct:
		 * {
		 * "id": "3868cd77-107c-4f80-9030-f327a25506a0", // ok.
		 * "model": null, // it would be a object.
		 * "year": 2021, // ok.
		 * "kbbId": 0 // it would be 2.00.
		 * } */
		
		pdln(this.getClass().getName() + ".adicionar(mvDtoInlet);"); // Simple debug printing, using my personal LIB.
		
		var tmpMvEntity = new MotorVehicleEntity();
		var tmpMvDtoOutlet = new MotorVehicleDtoOutlet();
		
		tmpMvEntity = motorVehicleRegistryServ.registrar(mvDtoInlet);
		
		tmpMvDtoOutlet = MotorVehicleEntityConversion.toDtoOutlet(tmpMvEntity);
		
		pdln(this.getClass().getName() + ".adicionar(); --> tmpMvDtoOutlet.toString(); = " + tmpMvDtoOutlet.toString());
		
		/* FURTHER: Implement a exception handling. */
		return ResponseEntity.status(HttpStatus.CREATED).body(tmpMvDtoOutlet);
		
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
