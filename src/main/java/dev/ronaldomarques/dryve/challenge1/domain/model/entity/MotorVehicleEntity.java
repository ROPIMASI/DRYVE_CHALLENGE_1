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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import dev.ronaldomarques.dryve.challenge1.domain.model.EStatus;



/**
 * @author      Ronaldo Marques.
 * @since       20210314.
 * @last_change 20210424.
 * @version     0.2.1-beta.
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
@Component
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
	
	@Column(name = "price_adv", nullable = false, precision = 12, scale = 2)
	private BigDecimal priceAdv; // "preço no anúncio".
	
	@Column(name = "price_kbb", nullable = true, precision = 12, scale = 2) // fixme: null to false, temporarilly true.
	private BigDecimal priceKBB; // "preço na API KBB".
	/* BigDecimal: prove a melhor precisão e alcance dos valores monetários esperados para o uso nesta aplicação. */
	
	@Column(name = "registry_date", nullable = true, columnDefinition = "date default CURRENT_DATE")
	private Date registryDate;
	
	/* Atributos novos, específicos desta classe herdeira.
	 * -
	 * Adicionei este campo/atributo à tabela e classe para dar a possibilidade à aplicação de ativar e desativar cada
	 * veículo anunciado, pois entendi na regra de negócio, que espera-se, que este veículo sejá vendido, logo seu
	 * anúcio registrado precisa ser desativado para não ser anunciado erroneamente. Além de ajudar no controle do
	 * objeto que já foi validado (verificado qualidade de dados) quanto às regras de negócio. */
	@Column(name = "status", nullable = false, columnDefinition = "smallint default 0")
	private EStatus status = EStatus.INACTIVE;
	/* Instancio o objeto com valor padrão para este atributo = INACTIVE, anúncio é criado inativo, só fica ativo após
	 * passar por uma classe tipo service de validação. */
	
	
	
	public MotorVehicleEntity() {
		
		super();
		
	}
	
	
	
	@Override
	public String getPlate() { return this.plate; }
	
	
	
	/* .setPlate() possui .upperCase() para garantir que toda placa mantenha seu padrão de grafia MAIÚSCULO, conforme
	 * atual legislação Brasil-Mercosul, mesmo que usuário envie a representação JSON com plca em letras minúsculas. */
	@Override
	public void setPlate(String plate) { this.plate = plate.toUpperCase(); }
	
	
	
	@Override
	public ModelYearEntity getModelYear() { return this.modelYear; }
	
	
	
	@Override
	public void setModelYear(ModelYearEntity modelYear) { this.modelYear = modelYear; }
	
	
	
	@Override
	public BigDecimal getPriceAdv() { return this.priceAdv; }
	
	
	
	@Override
	public void setPriceAdv(BigDecimal priceAdv) { this.priceAdv = priceAdv; }
	
	
	
	@Override
	public BigDecimal getPriceKBB() { return this.priceKBB; }
	
	
	
	@Override
	public void setPriceKBB(BigDecimal priceKBB) { this.priceKBB = priceKBB; }
	
	
	
	@Override
	public Date getRegistryDate() { return this.registryDate; }
	
	
	
	@Override
	public void setRegistryDate(Date registryDate) { this.registryDate = registryDate; }
	
	
	
	public EStatus getStatus() { return this.status; }
	
	
	
	public void setStatus(EStatus status) { this.status = status; }
	
}
