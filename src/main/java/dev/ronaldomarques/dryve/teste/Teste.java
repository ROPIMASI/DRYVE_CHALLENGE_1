package dev.ronaldomarques.dryve.teste;


import dev.ronaldomarques.dryve.desafio1api.domain.model.VeAdStatus;
import dev.ronaldomarques.dryve.desafio1api.domain.model.entity.MotorVehicle;




public final class Teste {
	public static void main(String[] args) {
		MotorVehicle mv = new MotorVehicle();
		
		System.out.println(mv.status);
		System.out.println(mv.status.ACTIVE);
		System.out.println(mv.status.INACTIVE);
		
		mv.status = VeAdStatus.ACTIVE;
		System.out.println(mv.status);
		mv.status = VeAdStatus.INACTIVE;
		System.out.println(mv.status);
	}
}
