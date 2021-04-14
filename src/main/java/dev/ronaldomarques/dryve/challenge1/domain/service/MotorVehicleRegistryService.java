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
package dev.ronaldomarques.dryve.challenge1.domain.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ronaldomarques.dryve.challenge1.api.dto.MotorVehicleDtoInlet;
import dev.ronaldomarques.dryve.challenge1.api.service.KbbApiService;
import dev.ronaldomarques.dryve.challenge1.api.service.MotorVehicleDtoConversion;
import dev.ronaldomarques.dryve.challenge1.domain.model.entity.MotorVehicleEntity;
import dev.ronaldomarques.dryve.challenge1.domain.model.repository.MotorVehicleRepository;



/**
 * @author      Ronaldo Marques.
 * @since       20210409.
 * @last_change 20210413.
 * @version     0.2.0-beta.
 * @category    Service: Operations of business.
 * @analysis    ...
 */
@Service
public class MotorVehicleRegistryService {
	
	@Autowired
	MotorVehicleRepository motorVehicleRepo;
	
	
	
	public MotorVehicleEntity registrar(MotorVehicleDtoInlet mvDtoInlet) {
		
		/* HERE: I'm implementing a part of business rules layer, according project architeture on "service" layer. */
		var mvEntity = new MotorVehicleEntity();
		
		/* 1st step: to convert de DTO Inlet to an Entity. */
		mvEntity = MotorVehicleDtoConversion.toEntity(mvDtoInlet);
		
		/* 2nd step: fetch priceKBB from the KBB-API-Service. */
		KbbApiService.findPrice(mvEntity.getModelYear().getKbbId());
		
		/* FURTHER: Errors/Exceptions handling. */
		return motorVehicleRepo.save(mvEntity);
		
	}
	
}
