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


import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * @author      Ronaldo Marques.
 * @since       20210314.
 * @last_change 20210413.
 * @version     0.2.0-beta.
 * @category    Modelagem do Negócio, classe concreta;
 * @analysis    Representa a singularidade de cada registro importado da API-KBB, permitindo um único preço para cada
 *              associação "modelo-ano".
 */
@Entity
@Table(name = "model_year")
public class ModelYearEntity {
	
	/* Futuras versões: por segurança da informação, integridade (diminuindo a probabilidade de código repetido e
	 * principalmente atrelando o código UUID à string do campo-derivado 'model.id'+'year' para que nunca se registre
	 * duas tuplas(reg do bd) com mesmos valores, sem ter que fazer esta conferência em código-fonte, mas sim na geração
	 * da chave primaria diretamente dentro do BD, então transferir responsabilidade do gerador de UUID para o
	 * POSTGRSQL. */
	// @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "gen_model_year_id")
	@Id
	@Column(name = "id", nullable = false)
	private UUID id = UUID.randomUUID();
	/* PK at DB. Por agora ao instanciar o objeto já define-se seu 'id' com UUID-v4-random, posteriormente será valor da
	 * chave UUID.function_v4() do PostgreSQL. */
	
	// @Column(name = "model_id", nullable = false)
	@ManyToOne // (cascade = CascadeType.ALL? delete? set null?) FIXME: this cascade is not working at DB, it isn't
				// declaring "actions" for the constraint.
	@JoinColumn(name = "model_id", nullable = false)
	private ModelEntity model; // FK(ModelEntity.id) at DB.
	
	@Column(name = "year", nullable = false)
	private short year = 0;
	/* Inicia o atributo com valor ZERO para garantir um valor não nulo, esta aplicação considera zero como um valor
	 * desconhecido, ou não informado, ou erro de informação pelo usuário. */
	
	@Column(name = "kbb_id", nullable = false)
	private long kbbId = 0;
	/* Inicia o atributo com valor ZERO para garantir um valor não nulo, já que a documentação da KBB-API afirma que não
	 * existe registro com id=0 em seus registros. */
	
	
	
	public UUID getId() { return id; }
	
	
	
	public void setId(UUID id) { this.id = id; }
	
	
	
	public ModelEntity getModel() { return model; }
	
	
	
	public void setModel(ModelEntity model) { this.model = model; }
	
	
	
	public short getYear() { return year; }
	
	
	
	public void setYear(short year) { this.year = year; }
	
	
	
	public long getKbbId() { return kbbId; }
	
	
	
	public void setKbbId(long kbbId) { this.kbbId = kbbId; }
	/* FURTHER: 0.3.0 fetch kbb id from kbb public api */
	
	
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + (int) (this.kbbId ^ (this.kbbId >>> 32));
		result = prime * result + ((this.model == null) ? 0 : this.model.hashCode());
		result = prime * result + this.year;
		return result;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (!(obj instanceof ModelYearEntity)) return false;
		ModelYearEntity other = (ModelYearEntity) obj;
		
		if (this.id == null) {
			if (other.id != null) return false;
		}
		else if (!this.id.equals(other.id)) return false;
		
		if (this.kbbId != other.kbbId) return false;
		
		if (this.model == null) {
			if (other.model != null) return false;
		}
		else if (!this.model.equals(other.model)) return false;
		
		if (this.year != other.year) return false;
		return true;
		
	}
	
}
