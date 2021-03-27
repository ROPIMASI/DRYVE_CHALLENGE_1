package dev.ronaldomarques.dryve.challenge1;


import java.util.UUID;
import dev.ronaldomarques.dryve.challenge1.domain.model.EnunVehicleAdvertisingStatus;
import dev.ronaldomarques.dryve.challenge1.domain.model.entity.MotorVehicle;
import dev.ronaldomarques.myutility.debugger.DP;



public final class MeuTeste {
	
	public static void main(String[] args) {
		
		MotorVehicle mv = new MotorVehicle();
		
		System.out.println(mv.getVeAdvStatus());
		mv.setVeAdvStatus(EnunVehicleAdvertisingStatus.ACTIVE);
		System.out.println(mv.getVeAdvStatus());
		mv.setVeAdvStatus(EnunVehicleAdvertisingStatus.INACTIVE);
		System.out.println(mv.getVeAdvStatus());
		
		System.out.println(UUID.fromString("ca43ec74-5bb0-4288-ab11-5df094ca4dc4").version());
		// versão-4 ...-(4)288-... = correto.
		
		DP.pd("teste 1");
		
	}
	
}
