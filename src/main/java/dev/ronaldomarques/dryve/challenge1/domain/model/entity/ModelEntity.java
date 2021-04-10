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
 * @last_change 20210409.
 * @version     0.2.0-beta.
 * @category    Modelagem do Negócio, classe concreta.
 * @analysis    Representa os modelos existentes na aplicação.
 */
@Entity
@Table(name = "model")
public class ModelEntity {
	
	/* FURTHER: Futura versão: por segurança da informação, integridade (diminuindo a probabilidade de código repetido e
	 * principalmente atrelando o código UUID à string do campo 'brand.id' para que nunca se registre
	 * duas tuplas(reg no bd) com mesmos valores, sem ter que fazer esta conferência em código-fonte, mas sim na geração
	 * da chave primaria diretamente dentro do BD, então transferir responsabilidade do gerador de UUID para o
	 * POSTGRSQL. */
	// @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "gen_model_id")
	@Id
	@Column(name = "id", nullable = false)
	private UUID id = UUID.randomUUID();
	/* PK at DB. Por agora ao instanciar o objeto já define-se seu 'id' com UUID-v4-random, posteriormente será valor da
	 * chave UUID.function_v4() do PostgreSQL. */
	
	@Column(name = "name", length = 255, nullable = false)
	private String name; // Apesar de raríssimo, 'modelos' podem ser homônimos: por enquanto não será UNIQUE no BD.
	
	// @Column(name = "brand_id", nullable = false)
	@ManyToOne // (cascade? set null? delete?) FIXME: this cascade is not working at DB, it isn't declaring "actions"
	@JoinColumn(name = "brand_id", nullable = false)
	// for the constraint.
	private BrandEntity brand; // FK(BrandEntity.id) at DB.
	
	
	
	public ModelEntity() {
		
		super();
		
	}
	
	
	
	public UUID getId() { return id; }
	
	
	
	public void setId(UUID id) { this.id = id; }
	
	
	
	public String getName() { return name; }
	
	
	
	public void setName(String name) { this.name = name.toUpperCase(); }
	/* .setName() possui .upperCase() para garantir que todo nome-de-modelo mantenha seu padrão de grafia MAIÚSCULO,
	 * mesmo que usuário envie a representação JSON com nome em letras minúsculas. */
	
	
	
	public BrandEntity getBrand() { return brand; }
	
	
	
	public void setBrand(BrandEntity brand) { this.brand = brand; }
	
	
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.brand == null) ? 0 : this.brand.hashCode());
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (!(obj instanceof ModelEntity)) return false;
		ModelEntity other = (ModelEntity) obj;
		
		if (this.brand == null) {
			if (other.brand != null) return false;
		}
		else if (!this.brand.equals(other.brand)) return false;
		
		if (this.id == null) {
			if (other.id != null) return false;
		}
		else if (!this.id.equals(other.id)) return false;
		
		if (this.name == null) {
			if (other.name != null) return false;
		}
		else if (!this.name.equals(other.name)) return false;
		
		return true;
		
	}
	
}
