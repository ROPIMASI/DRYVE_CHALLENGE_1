package dev.ronaldomarques.dryve.challenge1.domain.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ronaldomarques.dryve.challenge1.api.dto.MotorVehicleDtoInlet;
import dev.ronaldomarques.dryve.challenge1.api.service.KbbApiService;
import dev.ronaldomarques.dryve.challenge1.api.service.MotorVehicleDtoConversion;
import dev.ronaldomarques.dryve.challenge1.domain.model.entity.MotorVehicleEntity;
import dev.ronaldomarques.dryve.challenge1.domain.model.repository.MotorVehicleRepository;



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
		
		return motorVehicleRepo.save(mvEntity);
		
	}
	
}
