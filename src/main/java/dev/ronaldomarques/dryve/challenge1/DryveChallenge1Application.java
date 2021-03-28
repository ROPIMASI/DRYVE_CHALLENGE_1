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
package dev.ronaldomarques.dryve.challenge1;


/**
 * @author		Ronaldo Marques.
 * @since		20210312.
 * @last_change	20210328.
 * @version		0.2.0.
 * @category	Launcher da aplicação: inicia em forma de serviço no servidor Tomcat.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import dev.ronaldomarques.myutility.debugger.DP;



@SpringBootApplication
public class DryveChallenge1Application {
	
	public static void main(String[] args) {
		
		/* Iniciar minha "static LIB" pessoal com propriedade "FALSE" para "I T P D". */
//		DP.pdOff();
		
		/* Iniciar minha "static LIB" pessoal com propriedade "TRUE" para "I T P D". */
		System.out.println("antes");
		DP.pdOn();
		DP.pdln("durante");
		System.out.println("depois");
		
		/* Iniciar a aplicação API propriamente dita. */
		SpringApplication.run(DryveChallenge1Application.class, args);
		
	}
	
}
