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
package dev.ronaldomarques.dryve.desafio1.domain.model.entity;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;




/**
 * @author   Ronaldo Marques.
 * @since    20210314.
 * @version  20210314.
 * @category Modelagem do Negócio, classe abstrata que prove características em comum para as classes heredeiras.
 * @Análise  Esta abordagem possibilita implementação de diferentes tipos de veículos que precisarão do polimorfismo
 *           para terem diferentes tratamentos na aplicação e futura integração com NOSQL-DB.
 */
public abstract class AbstractVehicle {
	protected String plate; // PK at DB.
	protected UUID modelYearId; // FK(modelYear.id) at DB.
	protected short year;
	/* short: pois, ocupar apenas 2 bytes de armazenamento contra 4 bybtes se forsse String[4], por conda de operações
	 * lógicas e matemáticas com tipos primitivos (números tais como byte, short, int, long...) tem MENOR custo de
	 * processamento que operações lógicas e matemáticas com String. */
	protected BigDecimal priceAdv; // "preço no anúncio".
	protected BigDecimal priceKBB; // "preço na API KBB".
	/* BigDecimal: prove a melhor precisão e alcance dos valores monetários esperados para o uso nesta aplicação. */
	protected Date registryDate;
	
	
	
	public AbstractVehicle() {
		super();
	}
	
	
	
	public String getPlate() { return plate; }
	
	
	
	public void setPlate(String plate) { this.plate = plate; }
	
	
	
	public UUID getModelYearId() { return modelYearId; }
	
	
	
	public void setModelYearId(UUID modelYearId) { this.modelYearId = modelYearId; }
	
	
	
	public short getYear() { return year; }
	
	
	
	public void setYear(short year) { this.year = year; }
	
	
	
	public BigDecimal getPriceAdv() { return priceAdv; }
	
	
	
	public void setPriceAdv(BigDecimal priceAdv) { this.priceAdv = priceAdv; }
	
	
	
	public BigDecimal getPriceKBB() { return priceKBB; }
	
	
	
	public void setPriceKBB(BigDecimal priceKBB) { this.priceKBB = priceKBB; }
	
	
	
	public Date getRegistryDate() { return registryDate; }
	
	
	
	public void setRegistryDate(Date registryDate) { this.registryDate = registryDate; }
}
