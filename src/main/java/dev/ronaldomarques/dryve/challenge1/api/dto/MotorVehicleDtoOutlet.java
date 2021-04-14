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
import java.util.Date;
import org.springframework.stereotype.Component;



/**
 * @author      Ronaldo Marques.
 * @since       20210410.
 * @last_change 20210413.
 * @version     0.2.0-beta.
 * @category    Modelagem da API, classe concreta de representação de objeto transferidor de dados de entidade: para
 *              entidade veículos automotores.
 * @analysis    Boa conduta na transferência de dados em uma REST API. DTO contem apenas os dados necessários, não expõe
 *              dados sensíveis, ainda podem desempenhar as regras lógicas necessárias aos requisitos do projeto para
 *              comparação de objetos.
 */
@Component
public class MotorVehicleDtoOutlet extends AMotorVehicleDto {
	
	/* This is the Abs-DTO has: */
	/* private String plate;
	 * private short year; *
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
	
	private String brandName;
	private String modelName;
	private BigDecimal priceKBB;
	private Date registryDate;
	
	
	
	public String getBrandName() { return this.brandName; }
	
	
	
	public void setBrandName(String brandName) { this.brandName = brandName; }
	
	
	
	public String getModelName() { return this.modelName; }
	
	
	
	public void setModelName(String modelName) { this.modelName = modelName; }
	
	
	
	public BigDecimal getPriceKBB() { return this.priceKBB; }
	
	
	
	public void setPriceKBB(BigDecimal priceKBB) { this.priceKBB = priceKBB; }
	
	
	
	public Date getRegistryDate() { return this.registryDate; }
	
	
	
	public void setRegistryDate(Date registryDate) { this.registryDate = registryDate; }
	
	
	
	@Override
	public String toString() {
		
		return "MotorVehicleDtoOutlet [brandName=" + this.brandName + ", modelName=" + this.modelName + ", priceKBB="
				+ this.priceKBB + ", registryDate=" + this.registryDate + ", plate=" + this.plate + ", priceAdv="
				+ this.priceAdv + ", year=" + this.year + "]";
		
	}
	
}