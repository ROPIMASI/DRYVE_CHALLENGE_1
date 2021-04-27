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


import static dev.ronaldomarques.dryve.challenge1.MyDate.myToday;
import static dev.ronaldomarques.myutility.debugger.DP.pdln;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ronaldomarques.dryve.challenge1.api.dto.AMotorVehicleDto;
import dev.ronaldomarques.dryve.challenge1.api.dto.MotorVehicleDtoInlet;
import dev.ronaldomarques.dryve.challenge1.api.dto.MotorVehicleDtoOutlet;
import dev.ronaldomarques.dryve.challenge1.domain.model.EStatus;
import dev.ronaldomarques.dryve.challenge1.domain.model.entity.ModelYearEntity;
import dev.ronaldomarques.dryve.challenge1.domain.model.entity.MotorVehicleEntity;
import dev.ronaldomarques.dryve.challenge1.domain.model.repository.ModelYearRepository;
import dev.ronaldomarques.myutility.debugger.DP;



/**
 * @author      Ronaldo Marques.
 * @since       20210410.
 * @last_change 20210426.
 * @version     0.2.1-beta.
 * @category    Service: class specialized in factoring a specific type object from converting a given objetct.
 * @analysis    This description something about using 'INTERFACES' it's possible two types of MotorVehicleDTO (Inlet
 *              and OutLet) be processed by this 'SERVICE' FHURTHER: melhorar esta descrição. ;
 */
@Service
public final class MotorVehicleDtoConversion {
	
	@Autowired
	private static ModelYearRepository modelYearRepo;
	
	
	
	/* DOUBT: is it better use interface or abstract on param ? */
	public static MotorVehicleEntity toEntity(AMotorVehicleDto mvDto) {
		
		pdln("MotorVehicleDtoConversion" + ".toEntity(mvDto);"); // Simple debug printing, using my personal LIB.
		
		/* 1st step: Verify whether input is MotorVehicleDtoOutlet or MotorVehicleDTOInLet. */
		if (mvDto instanceof MotorVehicleDtoOutlet) {
			// return dtoOutletToEntity((MotorVehicleDtoOutlet) mvDto); // FURTHER: to verify wheter this block-statment
			// is unnecessery, maybe
			// refactore.
			DP.pdln("Esta conversão de  Dto Outlet  para  Entity (retroceder) me parece desnecessário: não é requisito ...");
			return null;
		}
		else if (mvDto instanceof MotorVehicleDtoInlet) {
			return dtoInletToEntity((MotorVehicleDtoInlet) mvDto);
		}
		else {
			// FURTHER: ajustar esta frase a baixo, verificar a MyUtility como imprimi txt padrao da pdln();
			DP.pdln("nome da classe: MotorVehicleDtoConversion,  .toEntity() , erro case!");
			return (null); // ERROR CASE !!!
		}
		
	}
	
	
	
	/* DOUBT: is it better use interface or abstract on param ? */
	private static MotorVehicleEntity dtoInletToEntity(MotorVehicleDtoInlet mtVhDtoInlet) {
		
		pdln("MotorVehicleDtoConversion" + ".dtoInletToEntity(mvDtoInlet);"); // Simple debug printing, using my
																				// personal LIB.
		
		var mdYrEntity = new ModelYearEntity();
		var mtVhEntity = new MotorVehicleEntity();
		
		mtVhEntity.setPlate(mtVhDtoInlet.getPlate());
		
		/* FURTHER: é possível de se refatorar este código com pesquisa direta ao repositorio com JPQL;
		 * importante lembrar que a implementação atual com modelRepo e modelyearRepo considera como regra de negócio
		 * que o ModelName é UNIQ no banco de dados, e que na relação modelYear NÃO há modelo-ano registrados
		 * repetidamente. */
		
		mdYrEntity = modelYearRepo.findByModelIdAndYear(((MotorVehicleDtoInlet) mtVhDtoInlet).getModelId(),
				mtVhDtoInlet.getYear());
		
		mtVhEntity.setModelYear(mdYrEntity);
		
		mtVhEntity.setPriceAdv(mtVhDtoInlet.getPriceAdv());
		
		/* FURTHER: below, for now temporarily 0, but, maybe using kbb api here, maybe delegated to a validation
		 * service, or mainly to a finder/fetcher api-service, which is better according SRP-Single-Pesponsability. */
		mtVhEntity.setPriceKBB(new BigDecimal(0.0));
		
		mtVhEntity.setRegistryDate((myToday()));
		
		mtVhEntity.setStatus(EStatus.INACTIVE); // FURTHER: reanalyze, maybe some validations service will be implemented.
		
		return mtVhEntity;
		
	}
	
	
	
	/* DOUBT: is it better use interface or abstract on param ? */
	public List<MotorVehicleEntity> toEntityList(List<AMotorVehicleDto> mvDtos) {
		
		/* FURTHER: 1st step: verify mvDtos not null. */
		/* DOUBT: "if" or "Optional" or "Another" technique ? */
		
		/* 2st step: Verify whether input's first element is MotorVehicleDtoOutlet or MotorVehicleDTOInLet. */
		if (mvDtos.get(0) instanceof MotorVehicleDtoOutlet) {
			// return dtoOutletListToEntityList(mvDtos); // FURTHER: to verify wheter this block-statment is
			// unnecessery, maybe repactore.
			DP.pdln("Esta conversão de  Dto Outlet  para  Entity (retroceder)  me parece desnecessário: não é requisito ...");
			return null;
		}
		else if (mvDtos.get(0) instanceof MotorVehicleDtoInlet) {
			var mvDtosInlets = new ArrayList<MotorVehicleDtoInlet>();
			
			mvDtos.stream().forEach(e -> { mvDtosInlets.add((MotorVehicleDtoInlet) e); });
			
			return dtoIntletListToEntityList(mvDtosInlets);
		}
		else {
			return (null); // ERROR CASE !!!
		}
		
	}
	
	
	
	/* DOUBT: is it better use interface or abstract on param ? */
	private List<MotorVehicleEntity> dtoIntletListToEntityList(List<MotorVehicleDtoInlet> mvDtos) {
		
		List<MotorVehicleEntity> mvEntities = new ArrayList<>();
		
		mvDtos.stream().forEach(e -> {
			var mvEntity = dtoInletToEntity(e);
			mvEntities.add(mvEntity);
		});
		
		return mvEntities;
		
	}
	
}
