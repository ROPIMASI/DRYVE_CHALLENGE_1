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
package dev.ronaldomarques.dryve.challenge1.api.dto;


import java.math.BigDecimal;



/**
 * @author      Ronaldo Marques.
 * @since       20210410.
 * @last_change 20210414.
 * @version     0.2.1-beta.
 * @category    Modelagem da API, classe abstrata para um DTO.
 * @analysis    Base da representação de objeto transferidor de dados de entidade: para entidade veículos automotores.
 */
abstract public class AMotorVehicleDto {
	
	/* This is the Abs-DTO has: */
	/* private String plate;
	 * private short year;
	 * private BigDecimal priceAdv; */
	
	/* This is the DTO Inlet has: */
	/* private String plate; // Abs
	 * private short year; // Abs
	 * private BigDecimal priceAdv; // Abs
	 * private UUID brandId;
	 * private UUID modelId; */
	
	/* This is the DTO Outlet has: */
	/* private String plate; // Abs
	 * private short year; // Abs
	 * private BigDecimal priceAdv; // Abs
	 * private String brandName;
	 * private String modelName;
	 * private BigDecimal priceKBB;
	 * private Date registryDate; */
	
	protected String plate;
	protected short year;
	protected BigDecimal priceAdv;
	
	
	
	public String getPlate() { return this.plate; }
	
	
	
	public void setPlate(String plate) { this.plate = plate; }
	
	
	
	public short getYear() { return this.year; }
	
	
	
	public void setYear(short year) { this.year = year; }
	
	
	
	public BigDecimal getPriceAdv() { return this.priceAdv; }
	
	
	
	public void setPriceAdv(BigDecimal priceAdv) { this.priceAdv = priceAdv; }
	
}
