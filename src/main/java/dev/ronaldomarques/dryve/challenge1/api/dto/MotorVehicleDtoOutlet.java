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
import dev.ronaldomarques.dryve.challenge1.MyDate;



/**
 * @author      Ronaldo Marques.
 * @since       20210410.
 * @last_change 20210414.
 * @version     0.2.1-beta.
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
	private String priceKBB;
	private String registryDate;
	
	
	
	public String getBrandName() { return this.brandName; }
	
	
	
	public void setBrandName(String brandName) { this.brandName = brandName; }
	
	
	
	public String getModelName() { return this.modelName; }
	
	
	
	public void setModelName(String modelName) { this.modelName = modelName; }
	
	
	
	public String getPriceKBB() { return this.priceKBB; }
	
	
	
	public void setPriceKBB(BigDecimal priceKBB) {
		
		this.priceKBB = (priceKBB == null) ? "0" : priceKBB.toString();
		
	}
	
	
	
	public String getRegistryDate() { return this.registryDate; }
	
	
	
	public void setRegistryDate(Date registryDate) { this.registryDate = MyDate.myDateFormatToString(registryDate); }
	
	
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.brandName == null) ? 0 : this.brandName.hashCode());
		result = prime * result + ((this.modelName == null) ? 0 : this.modelName.hashCode());
		result = prime * result + ((this.priceKBB == null) ? 0 : this.priceKBB.hashCode());
		result = prime * result + ((this.registryDate == null) ? 0 : this.registryDate.hashCode());
		return result;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		MotorVehicleDtoOutlet other = (MotorVehicleDtoOutlet) obj;
		
		if (this.brandName == null) {
			if (other.brandName != null) return false;
		}
		else if (!this.brandName.equals(other.brandName)) return false;
		
		if (this.modelName == null) {
			if (other.modelName != null) return false;
		}
		else if (!this.modelName.equals(other.modelName)) return false;
		
		if (this.priceKBB == null) {
			if (other.priceKBB != null) return false;
		}
		else if (!this.priceKBB.equals(other.priceKBB)) return false;
		
		if (this.registryDate == null) {
			if (other.registryDate != null) return false;
		}
		else if (!this.registryDate.equals(other.registryDate)) return false;
		
		return true;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "MotorVehicleDtoOutlet [brandName=" + this.brandName + ", modelName=" + this.modelName + ", priceKBB="
				+ this.priceKBB + ", registryDate=" + this.registryDate + ", plate=" + this.plate + ", year="
				+ this.year + ", priceAdv=" + this.priceAdv + "]";
		
	}
	
}
