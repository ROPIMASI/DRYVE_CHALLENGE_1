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
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import dev.ronaldomarques.dryve.challenge1.domain.model.EStatus;



/**
 * @author      Ronaldo Marques.
 * @since       20210314.
 * @last_change 20210409.
 * @version     0.2.0-beta.
 * @category    Modelagem do Negócio, classe concreta que representa diferentes veículos automotores.
 * @analysis    para o "Time DEV": os quais se assemelham e são registrados da mesma forma (com os mesmo atributos) no
 *              banco de dados. Esta abordagem permite futura modelagem de outras classes que representarão outros tipos
 *              de veículos que serão registrados de forma diferente destes (com diferentes atributos) deixando a
 *              aplicação mais flexível/desacoplada, possível de integrar com banco de dados relacional e principalmente
 *              Não-Relacional (NOSQL) se o presente projeto tiver tal evolução. Mesmo que tal hipótese futura não venha
 *              a acontecer, esta abordagem não causa nenhum prejuizo considerável para a applicação nem seu
 *              desenvolvimento. Ex: carros e pickups com atributo um 'short emissaoCO2;' e bikes com um atributo
 *              'boolean eletricamenteAssistida;'.
 */

@Entity
@Table(name = "motor_vehicle")
public class MotorVehicleEntity extends AVehicle {
	
	/* Overriding os atributos originais da classe abstrata para Modelagem-Objeto-Relacional do HIBERNATE. */
	@Id
	@Column(name = "plate", length = 7, nullable = false)
	private String plate; // PK at DB.
	
	// @Column(name = "model_year_id", nullable = false)
	@ManyToOne // (cascade = CascadeType.ALL? delete? set null?) FIXME: this cascade is not working at DB, it isn't
				// declaring "actions" for the constraint.
	@JoinColumn(name = "model_year_id", nullable = false)
	private ModelYearEntity modelYear; // FK(modelYearEntity.id) at DB.
	
	/* @Column(name = "year", nullable = false)
	 * private short year; */
	/* This attributi and column on DB is not needed inside this entity, once it exists inside the ModelYearEntity and
	 * model_year table. */
	
	@Column(name = "price_adv", nullable = false, precision = 12, scale = 2)
	private BigDecimal priceAdv; // "preço no anúncio".
	
	@Column(name = "price_kbb", nullable = false, precision = 12, scale = 2)
	private BigDecimal priceKBB; // "preço na API KBB".
	/* BigDecimal: prove a melhor precisão e alcance dos valores monetários esperados para o uso nesta aplicação. */
	/* TODO: integragir esta aplicação com a API pública da KBB para estrair um valor $ para este modelo-ano. */
	
	@Column(name = "registry_date", nullable = false)
	private Date registryDate;
	
	/* Atributos novos, específicos desta classe herdeira.
	 * -
	 * Adicionei este campo/atributo à tabela e classe para dar a possibilidade à aplicação de ativar e desativar cada
	 * veículo anunciado, pois entendi na regra de negócio, que espera-se, que este veículo sejá vendido, logo seu
	 * anúcio registrado precisa ser desativado para não ser anunciado erroneamente. */
	@Column(name = "status", nullable = false)
	private EStatus status = EStatus.ACTIVE;
	/* Instancio o objeto com valor padrão para este atributo = ACTIVE, anúncio é criado ativo. */
	
	
	
	public MotorVehicleEntity() {
		
		super();
		
	}
	
	
	
	@Override
	public String getPlate() { return plate; }
	
	
	
	@Override
	public void setPlate(String plate) { this.plate = plate.toUpperCase(); }
	/* .setPlate() possui .upperCase() para garantir que toda placa mantenha seu padrão de grafia MAIÚSCULO, conforme
	 * atual legislação Brasil-Mercosul, mesmo que usuário envie a representação JSON com plca em letras minúsculas. */
	
	
	
	public EStatus getVeAdvStatus() { return status; }
	
	
	
	public void setVeAdvStatus(EStatus status) { this.status = status; }
	
	
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.modelYear == null) ? 0 : this.modelYear.hashCode());
		result = prime * result + ((this.plate == null) ? 0 : this.plate.hashCode());
		result = prime * result + ((this.priceAdv == null) ? 0 : this.priceAdv.hashCode());
		result = prime * result + ((this.priceKBB == null) ? 0 : this.priceKBB.hashCode());
		result = prime * result + ((this.registryDate == null) ? 0 : this.registryDate.hashCode());
		result = prime * result
				+ ((this.status == null) ? 0 : this.status.hashCode());
		return result;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (!(obj instanceof MotorVehicleEntity)) return false;
		MotorVehicleEntity other = (MotorVehicleEntity) obj;
		
		if (this.modelYear == null) {
			if (other.modelYear != null) return false;
		}
		else if (!this.modelYear.equals(other.modelYear)) return false;
		
		if (this.plate == null) {
			if (other.plate != null) return false;
		}
		else if (!this.plate.equals(other.plate)) return false;
		
		if (this.priceAdv == null) {
			if (other.priceAdv != null) return false;
		}
		else if (!this.priceAdv.equals(other.priceAdv)) return false;
		
		if (this.priceKBB == null) {
			if (other.priceKBB != null) return false;
		}
		else if (!this.priceKBB.equals(other.priceKBB)) return false;
		
		if (this.registryDate == null) {
			if (other.registryDate != null) return false;
		}
		else if (!this.registryDate.equals(other.registryDate)) return false;
		
		if (this.status != other.status) return false;
		return true;
		
	}
	
}
