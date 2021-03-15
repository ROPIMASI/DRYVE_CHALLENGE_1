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


import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import dev.ronaldomarques.dryve.desafio1api.domain.model.VeAdStatus;




/**
 * @author   Ronaldo Marques.
 * @since    20210314.
 * @version  20210315.
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
@Entity
@Table(name = "motor_vehicle")
public class MotorVehicle extends Vehicle {
	
	/* Overriding os atributos originais da classe abstrata para Modelarem-Objeto-Relacional do HIBERNATE. */
	@Id
	@Column(name = "plate")
	private String plate; // PK at DB.
	
	@Column(name = "model_year_id", nullable = false)
	private UUID modelYearId; // FK(modelYear.id) at DB.
	
	@Column(name = "year", nullable = false)
	private short year;
	/* short: pois, ocupar apenas 2 bytes de armazenamento contra 4 bybtes se forsse String[4], por conda de operações
	 * lógicas e matemáticas com tipos primitivos (números tais como byte, short, int, long...) tem MENOR custo de
	 * processamento que operações lógicas e matemáticas com String. */
	
	@Column(name = "price_adv", nullable = false)
	private BigDecimal priceAdv; // "preço no anúncio".
	
	@Column(name = "price_kbb", nullable = false)
	private BigDecimal priceKBB; // "preço na API KBB".
	/* BigDecimal: prove a melhor precisão e alcance dos valores monetários esperados para o uso nesta aplicação. */
	
	@Column(name = "registry_date", nullable = false)
	private Date registryDate;
	
	/* Atributos novos, específicos desta classe herdeira. */
	@Column(name = "ve_ad_status", nullable = false)
	private VeAdStatus status; // "Vehicle Advertising Status" = "Estado de Anuncio de Veículo".
	
	
	
	public MotorVehicle() {
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
	
	
	
	public VeAdStatus getStatus() { return status; }
	
	
	
	public void setStatus(VeAdStatus status) { this.status = status; }
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelYearId == null) ? 0 : modelYearId.hashCode());
		result = prime * result + ((plate == null) ? 0 : plate.hashCode());
		result = prime * result + ((priceAdv == null) ? 0 : priceAdv.hashCode());
		result = prime * result + ((priceKBB == null) ? 0 : priceKBB.hashCode());
		result = prime * result + ((registryDate == null) ? 0 : registryDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + year;
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		MotorVehicle other = (MotorVehicle) obj;
		
		if (modelYearId == null) {
			if (other.modelYearId != null) return false;
		}
		else if (!modelYearId.equals(other.modelYearId)) return false;
		
		if (plate == null) {
			if (other.plate != null) return false;
		}
		else if (!plate.equals(other.plate)) return false;
		
		if (priceAdv == null) {
			if (other.priceAdv != null) return false;
		}
		else if (!priceAdv.equals(other.priceAdv)) return false;
		
		if (priceKBB == null) {
			if (other.priceKBB != null) return false;
		}
		else if (!priceKBB.equals(other.priceKBB)) return false;
		
		if (registryDate == null) {
			if (other.registryDate != null) return false;
		}
		else if (!registryDate.equals(other.registryDate)) return false;
		
		if (status != other.status) return false;
		if (year != other.year) return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "MotorVehicle [plate=" + plate + ", modelYearId=" + modelYearId + ", year=" + year + ", priceAdv="
				+ priceAdv + ", priceKBB=" + priceKBB + ", registryDate=" + registryDate + ", status=" + status + "]";
	}
}
