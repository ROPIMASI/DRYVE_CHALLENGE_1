package dev.ronaldomarques.dryve.challenge1;


import java.util.UUID;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MyPersonalTests {
	
	public static void main(String[] args) {
		/* MotorVehicleEntity mv = new MotorVehicleEntity();
		 * 
		 * System.out.println(mv.getVeAdvStatus());
		 * mv.setVeAdvStatus(EStatus.ACTIVE);
		 * System.out.println(mv.getVeAdvStatus());
		 * mv.setVeAdvStatus(EStatus.INACTIVE);
		 * System.out.println(mv.getVeAdvStatus());
		 * 
		 * System.out.println(UUID.fromString("ca43ec74-5bb0-4288-ab11-5df094ca4dc4").version());
		 * // versão-4 ...-(4)288-... = correto.
		 * 
		 * DP.pd("teste 1"); */
		
		System.out.println("\n# Teste uuid #\n");
		
		String strUuid = "ca43ec74-5bb0-4288-ab11-5df094ca4dc4";
		UUID uuid = UUID.fromString(strUuid);
		
		System.out.println("strUuid => [" + strUuid + "]\n");
		
		System.out.println("uuid de fato => [" + uuid + "]\n");
		
		System.out.println("uuid.toString() => [" + uuid.toString() + "]\n");
		
		System.out.println("(strUuid == uuid.toString()) ? => [" + (strUuid == uuid.toString()) + "]\n");
		
		System.out.println("(strUuid.equals(uuid.toString()) ? => [" + (strUuid.equals(uuid.toString())) + "]\n");
		
	}
	
}
