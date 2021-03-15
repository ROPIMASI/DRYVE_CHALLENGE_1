package dev.ronaldomarques.dryve.teste;


import dev.ronaldomarques.dryve.desafio1api.domain.model.VeAdStatus;
import dev.ronaldomarques.dryve.desafio1api.domain.model.entity.MotorVehicle;




public final class Teste {
	public static void main(String[] args) {
		MotorVehicle mv = new MotorVehicle();
		
		System.out.println(mv.getStatus());
		mv.setStatus(VeAdStatus.ACTIVE);
		System.out.println(mv.getStatus());
		mv.setStatus(VeAdStatus.INACTIVE);
		System.out.println(mv.getStatus());
	}
}
