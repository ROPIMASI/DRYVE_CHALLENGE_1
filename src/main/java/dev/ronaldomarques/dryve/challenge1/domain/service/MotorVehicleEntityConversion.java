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


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import dev.ronaldomarques.dryve.challenge1.api.dto.MotorVehicleDtoOutlet;
import dev.ronaldomarques.dryve.challenge1.domain.model.entity.MotorVehicleEntity;



/**
 * @author      Ronaldo Marques.
 * @since       20210410.
 * @last_change 20210414.
 * @version     0.2.1-beta.
 * @category    Service: class specialized in factoring a specific type object from converting a given objetct.
 * @analysis    ... TODO: this description: something about OVERLOAD two types of MotorVehicleDTO:
 *              - MotorVehicle-DTO-ENTRY, and
 *              - MotorVehicle-DTO-OUTLET.
 */
@Service
public final class MotorVehicleEntityConversion {
	
	public static MotorVehicleDtoOutlet toDtoOutlet(MotorVehicleEntity mvEntity) {
		
		var mvDtoOutlet = new MotorVehicleDtoOutlet();
		
		mvDtoOutlet.setPlate(mvEntity.getPlate());
		mvDtoOutlet.setPriceAdv(mvEntity.getPriceAdv());
		mvDtoOutlet.setBrandName(mvEntity.getModelYear().getModel().getBrand().getName());
		mvDtoOutlet.setModelName(mvEntity.getModelYear().getModel().getName());
		mvDtoOutlet.setYear(mvEntity.getModelYear().getYear());
		mvDtoOutlet.setPriceAdv(mvEntity.getPriceAdv());
		mvDtoOutlet.setPriceKBB(mvEntity.getPriceKBB());
		mvDtoOutlet.setRegistryDate(mvEntity.getRegistryDate());
		
		return mvDtoOutlet;
		
	}
	
	
	
	public static List<MotorVehicleDtoOutlet> toDtoOutletList(List<MotorVehicleEntity> mvEntities) {
		
		List<MotorVehicleDtoOutlet> mvDtoOutlets = new ArrayList<MotorVehicleDtoOutlet>();
		
		mvEntities.stream().forEach(e -> {
			var mvDtoOutlet = toDtoOutlet(e);
			mvDtoOutlets.add(mvDtoOutlet);
		});
		
		return mvDtoOutlets;
		
	}
	
}
