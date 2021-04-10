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
package dev.ronaldomarques.dryve.challenge1.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ronaldomarques.dryve.challenge1.api.dto.AMotorVehicleDTO;
import dev.ronaldomarques.dryve.challenge1.domain.model.entity.MotorVehicleEntity;



/**
 * @author      Ronaldo Marques.
 * @since       20210410.
 * @last_change 20210410.
 * @version     0.2.0-beta.
 * @category    Factory Service: class specialized in factoring a specific type object from converting a given objetct.
 * @analysis    ... TODO: this description: something about OVERLOAD two types of MotorVehicleDTO:
 *              - MotorVehicle-ENTRY-DTO, and
 *              - MotorVehicle-OUTLET-DTO.
 */
@Service
public class MotorVehicleDTOConversion {
	
	/* This service class needs to know some details about a business(domain)-class: MotorVehicleEntity. */
	@Autowired
	MotorVehicleEntity mveFactoring;
	
	
	
	public MotorVehicleEntity toEntity(AMotorVehicleDTO aDTO) {
		
		/* TODO: real procedures to evaluate that properties below. */
		mveFactoring.setPlate(null);
		mveFactoring.setModelYear(null);
		mveFactoring.setPriceAdv(null);
		mveFactoring.setPriceKBB(null);
		mveFactoring.setRegistryDate(null);
		mveFactoring.setVeAdvStatus(null);
		
		return mveFactoring;
		
	}
	
}
