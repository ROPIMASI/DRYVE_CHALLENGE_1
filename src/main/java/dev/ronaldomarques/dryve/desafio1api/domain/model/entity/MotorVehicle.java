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
package dev.ronaldomarques.dryve.desafio1api.domain.model.entity;


import dev.ronaldomarques.dryve.desafio1api.domain.model.VeAdStatus;




/**
 * @author   Ronaldo Marques.
 * @since    20210314.
 * @version  20210314.
 * @category Modelagem do Negócio, classe concreta que representa diferentes veículos automotores.
 * @Análise  para o "Time DEV": os quais se assemelham e são registrados da mesma forma (com os mesmo atributos) no
 *           banco de dados. Esta abordagem permite futura modelagem de outras classes que representarão outros tipos de
 *           veículos que serão registrados de forma diferente destes (com diferentes atributos) deixando a aplicação
 *           mais flexível/desacoplada, possível de integrar com banco de dados relacional e principalmente
 *           Não-Relacional (NOSQL) se o presente projeto tiver tal evolução. Mesmo que tal hipótese futura não venha a
 *           acontecer, esta abordagem não causa nenhum prejuizo considerável para a applicação nem seu desenvolvimento.
 *           Ex: carros e pickups com atributo um 'short emissaoCO2;' e bikes com um atributo 'boolean
 *           eletricamenteAssistida;'.
 */
public class MotorVehicle extends Vehicle {
	public VeAdStatus status;
	
	
	
	public MotorVehicle() {
		super();
	}
}
