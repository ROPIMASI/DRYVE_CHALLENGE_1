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
 * @category Modelagem do Negócio, classe concreta que representa os modelos existentes na aplicação.
 */
@Entity
@Table(name = "model")
public class Model {
	@Id
	private UUID id = null;
	/* PK at DB. Garantir iniciado com null, pois ao ser persistido pela primeira vez no BD receberá automaticamente o
	 * valor da chave UUID.function_v4() do PostgreSQL. */
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "band_id", nullable = false)
	private UUID brandId; // FK(Brand.id) at DB.
	
	
	
	public Model() {
		super();
	}
	
	
	
	public UUID getId() { return id; }
	
	
	
	public void setId(UUID id) { this.id = id; }
	
	
	
	public String getName() { return name; }
	
	
	
	public void setName(String name) { this.name = name; }
	
	
	
	public UUID getBrandId() { return brandId; }
	
	
	
	public void setBrandId(UUID brandId) { this.brandId = brandId; }
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Model other = (Model) obj;
		
		if (brandId == null) {
			if (other.brandId != null) return false;
		}
		else if (!brandId.equals(other.brandId)) return false;
		
		if (id == null) {
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		
		if (name == null) {
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", brandId=" + brandId + "]";
	}
}
