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


import static dev.ronaldomarques.myutility.debugger.DP.pdln;
import java.math.BigDecimal;



/**
 * @author      Ronaldo Marques.
 * @since       20210430.
 * @last_change 20210430.
 * @version     0.2.1-beta.
 * @category    Service: class specialized in fetche a specific price based on a long argument 'kbbId'.
 * @analysis    Now this class has "Single responsibility principle", "Don't Repeat Yourself", Keep It Stupidly Simple",
 *              FURTHER: this class will be associate with an interface (implementing it) such as
 *              'IExternalResourceFetcher' which will use "Interface Segregation Principle" providing "Inversion of
 *              Dependence Principle" in 'MotorVehicleRegistreService.registrar();'.
 */
public final class KbbApiService {
	
	public static BigDecimal findPrice(long kbbId) {
		
		// To access https://6048bdf1fb5dcc0017968e3f.mockapi.io/api/v1/kbb/prices/{bkkId}
		
		// Get the respective price, and return.
		
		// If not exist : handle error.
		pdln("KbbApiService.findPrice(kbbId);"); // Simple debug printing, using my personal LIB.
		
		/* FURTHER: real value, temporarily bkkId value as price. */
		// double tmp = (kbbId < 0) ? 9.99 : kbbId;
		return BigDecimal.valueOf(((kbbId > 0) ? kbbId : 9.99));
		
	}
	
}
