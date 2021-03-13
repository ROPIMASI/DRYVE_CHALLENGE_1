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
package dev.ronaldomarques.dryve.desafio1;


/**
 * @author Ronaldo Marques
 *         Last change: 20210312.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class DryveDesafio1Application {
	public static void main(String[] args) {
		
		System.out.println("Dryve: [iniciado]");
		/* Mostrar detalhes de meu interesse na inicialização do serviço e ao mesmo tempo já deixar a static-class
		 * ParametrosGlobais abastecida com os dados atualizados do arquivo 'application.properties'.
		 * SEGUINDO BOAS PRÁTICAS DE MANTER A CODIFICAÇÃO COM O MÍNIMO DE 'HARD-CODE' POSSÍVEL. */
		System.out.println(ParametrosGlobais.getDescricaoAplicacao());
		
		/* Iniciar a aplicação API propriamente dita. */
		SpringApplication.run(DryveDesafio1Application.class, args);
	}
}
