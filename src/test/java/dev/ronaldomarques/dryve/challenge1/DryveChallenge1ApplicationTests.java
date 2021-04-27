package dev.ronaldomarques.dryve.challenge1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import dev.ronaldomarques.myutility.debugger.DP;



@SpringBootTest
class DryveChallenge1ApplicationTests {
	
	@Test
	void contextLoads() {
		
		/* Iniciar minha "static LIB" pessoal com propriedade "FALSE" ou "TURE" para "I T P D". */
		// DP.pdOff();
		DP.pdOn();
		
		/* Starts the application itself. */
		SpringApplication.run(DryveChallenge1Application.class);
		
	}
	
}
