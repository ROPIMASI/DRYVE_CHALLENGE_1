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

import java.util.UUID;

/**
 * @author   Ronaldo Marques.
 * @since    20210314.
 * @version  20210314.
 * @category Modelagem do Negócio, classe concreta que representa a singularidade de cada registro importado da API-KBB,
 *           permitindo um único preço para cada associação "modelo-ano".
 */
public class ModelYear {
	UUID id; // PK at DB.
	UUID modelId; // FK(Model.id) at DB.
	short year = 0;
	/* Inicia o atributo com valor ZERO para garantir um valor não nulo, esta aplicação considera tal valor como
	 * desconhecido, ou não informado, ou erro de informação pelo usuário. */
	long kbbId = 0;
	/* Inicia o atributo com valor ZERO para garantir um valor não nulo, já que a documentação da KBB-API afirma que não
	 * existe registro com id=0 em seus registros. */
}
