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
package dev.ronaldomarques.dryve.challenge1.domain.model.entity;


import java.math.BigDecimal;
import java.util.Date;



/**
 * @author      Ronaldo Marques.
 * @since       20210314.
 * @last_change 20210414.
 * @version     0.2.1-beta.
 * @category    Modelagem do Negócio, classe abstrata que prove características em comum para as classes heredeiras.
 * @analysis    Esta abordagem possibilita implementação de diferentes tipos de veículos que precisarão do polimorfismo
 *              para terem diferentes tratamentos na aplicação e futura integração com NOSQL-DB.
 */
public abstract class AVehicle {
	
	protected String plate; // PK at DB.
	protected ModelYearEntity modelYear; // FK(modelYear.id) at DB.
	protected BigDecimal priceAdv; // "preço no anúncio".
	protected BigDecimal priceKBB; // "preço na API KBB".
	/* BigDecimal: prove a melhor precisão e alcance dos valores monetários esperados para o uso nesta aplicação. */
	protected Date registryDate;
	
	
	
	public AVehicle() {
		
		super();
		
	}
	
	
	
	public String getPlate() { return this.plate; }
	
	
	
	public void setPlate(String plate) { this.plate = plate; }
	
	
	
	public ModelYearEntity getModelYear() { return this.modelYear; }
	
	
	
	public void setModelYear(ModelYearEntity modelYear) { this.modelYear = modelYear; }
	
	
	
	public BigDecimal getPriceAdv() { return this.priceAdv; }
	
	
	
	public void setPriceAdv(BigDecimal priceAdv) { this.priceAdv = priceAdv; }
	
	
	
	public BigDecimal getPriceKBB() { return this.priceKBB; }
	
	
	
	public void setPriceKBB(BigDecimal priceKBB) { this.priceKBB = priceKBB; }
	
	
	
	public Date getRegistryDate() { return this.registryDate; }
	
	
	
	public void setRegistryDate(Date registryDate) { this.registryDate = registryDate; }
	
}
