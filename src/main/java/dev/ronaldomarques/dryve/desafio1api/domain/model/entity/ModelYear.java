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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




/**
 * @author   Ronaldo Marques.
 * @since    20210314.
 * @version  20210315.
 * @category Modelagem do Negócio, classe concreta que representa a singularidade de cada registro importado da API-KBB,
 *           permitindo um único preço para cada associação "modelo-ano".
 */
@Entity
@Table(name = "model_year")
public class ModelYear {
	@Id
	private UUID id = null;
	/* PK at DB. Garantir iniciado com null, pois ao ser persistido pela primeira vez no BD receberá automaticamente o
	 * valor da chave UUID.function_v4() do PostgreSQL. */
	
	@Column(name = "model_id", nullable = false)
	private UUID modelId; // FK(Model.id) at DB.
	
	@Column(name = "year", nullable = false)
	private short year = 0;
	/* Inicia o atributo com valor ZERO para garantir um valor não nulo, esta aplicação considera zero como um valor
	 * desconhecido, ou não informado, ou erro de informação pelo usuário. */
	
	@Column(name = "kbb_id", nullable = false)
	private long kbbId = 0;
	
	
	
	public ModelYear() {
		super();
	}
	
	
	
	/* Inicia o atributo com valor ZERO para garantir um valor não nulo, já que a documentação da KBB-API afirma que não
	 * existe registro com id=0 em seus registros. */
	public UUID getId() { return id; }
	
	
	
	public void setId(UUID id) { this.id = id; }
	
	
	
	public UUID getModelId() { return modelId; }
	
	
	
	public void setModelId(UUID modelId) { this.modelId = modelId; }
	
	
	
	public short getYear() { return year; }
	
	
	
	public void setYear(short year) { this.year = year; }
	
	
	
	public long getKbbId() { return kbbId; }
	
	
	
	public void setKbbId(long kbbId) { this.kbbId = kbbId; }
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (int) (kbbId ^ (kbbId >>> 32));
		result = prime * result + ((modelId == null) ? 0 : modelId.hashCode());
		result = prime * result + year;
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ModelYear other = (ModelYear) obj;
		
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		
		if (kbbId != other.kbbId) return false;
		
		if (modelId == null) {
			if (other.modelId != null) return false;
		}
		else if (!modelId.equals(other.modelId)) return false;
		
		if (year != other.year) return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "ModelYear [id=" + id + ", modelId=" + modelId + ", year=" + year + ", kbbId=" + kbbId + "]";
	}
}
