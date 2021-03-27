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
package dev.ronaldomarques.dryve.challenge1.domain.model.repository;


import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.ronaldomarques.dryve.challenge1.domain.model.entity.Brand;




/**
 * @author   Ronaldo Marques.
 * @since    20210315.
 * @version  20210315.
 * @category Repositório: Classa/Interface especializada em acesso e alteração de dados na base de dados da aplicação.
 * @Análise  Este é um Repositório especialmente implimentado em tempo de execução pelo Spring Data JPA e Hibernate, por
 *           isso este código é uma interface que extende 'JpaRepository'. Esta abordagem aumenta a produtividade do
 *           desenvolvedor em projetos como este que não demandam algum processamento em particularmente diferente dos
 *           processos padrões que já estão disponíveis no framework.
 */
@Repository
public interface BrandRepository extends JpaRepository<Brand, UUID> {
	
}
