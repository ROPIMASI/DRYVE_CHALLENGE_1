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
package dev.ronaldomarques.dryve.challenge1.api.exception;


/**
 * @author   Ronaldo Marques.
 * @since    20210315.
 * @version  20210315.
 * @category Serviço para Exceção: Classe final static para servir classes herdeiras de 'RuntimeException'.
 * @Análise  ...
 */
public final class DescritorExcecaoService {
	
	public static String descrever(RuntimeException excep) {
		
		return "\n---------\n"
				+ "\nExceção: " + excep.getClass().getName() + "\n"
				+ "\n---\n"
				+ "\n" + excep.getMessage() + "\n"
				+ "\n---\n"
				+ excep.getStackTrace() + "\n"
				+ "\n---------\n\n";
		
	}
	
	
	
	public static String descreverInesperada(RuntimeException excep) {
		
		return "\n--------\n"
				+ "\n####  EXCEÇÃO  INESPERADA!  ####\n"
				+ descrever(excep);
		
	}
	
}
