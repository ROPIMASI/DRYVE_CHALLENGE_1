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


import java.util.UUID;
import org.springframework.stereotype.Component;



/**
 * @author      Ronaldo Marques.
 * @since       20210410.
 * @last_change 20210410.
 * @version     0.2.0-beta.
 * @category    Modelagem da API, classe de representação de objeto transferidor de dados de entidade: para entidade
 *              veículos automotores.
 * @analysis    Boa conduta na transferência de dados em uma REST API. DTO contem apenas os dados necessários, não expõe
 *              dados sensíveis, ainda podem desempenhar as regras lógicas necessárias aos requisitos do projeto para
 *              comparação de objetos.
 */
@Component
public class MotorVehicleDtoInlet extends AMotorVehicleDto {
	
	/* This is the Abs-DTO has: */
	/* private String plate;
	 * private BigDecimal priceAdv;
	 * private short year; */
	
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
	
	private UUID brandId;
	private UUID modelId;
	
	
	
	public UUID getBrandId() { return this.brandId; }
	
	
	
	public void setBrandId(UUID brandId) { this.brandId = brandId; }
	
	
	
	public UUID getModelId() { return this.modelId; }
	
	
	
	public void setModelId(UUID modelId) { this.modelId = modelId; }
	
}
