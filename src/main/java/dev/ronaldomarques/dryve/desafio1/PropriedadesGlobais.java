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


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;




/**
 * @author  Ronaldo Marques
 * @since   20210312
 * @version 20210313
 */
@Component
public final class PropriedadesGlobais {
	
	/* FIXME: A leitura das 'application.properties' para os parâmetros globais da aplicação (os atributos desta classe)
	 * não funcionaram como o esperado, está carregando 0 e null.
	 * 
	 * Verificarei correção desta questão com menos prioridade futuramente, conforme meu objetivo/prioriades de
	 * entrega. Enquanto isso colocarei valores nas propriedades como 'Hard-Code', o que pretendo evitar. */
	@Value("${dryve.global.versao-maior}")
	private byte versaoMaior;
	
	@Value("${dryve.global.versao-menor}")
	private byte versaoMenor;
	
	@Value("${dryve.global.versao-correcao}")
	private byte versaoCorrecao;
	
	@Value("${dryve.global.versao-estagio}")
	private String versaoEstagio;
	
	@Value("${dryve.global.nome-aplicacao}")
	private String nomeAplicacao;
	
	/* Valor desta propriedade é determinado no constructor. */
	private String versaoAplicacao;
	
	/* Valor desta propriedade é determinado no constructor. */
	private String descricaoAplicacao;
	
	
	
	public PropriedadesGlobais() {
		/* Ler os valores do arquivo (application.properties) para dentro de suas respectivas properties.
		 * SEGUINDO BOAS PRÁTICAS DE MANTER A CODIFICAÇÃO COM O MÍNIMO DE 'HARD-CODE' POSSÍVEL. */
		
		/* FIXME: Temporariamente atribuir valores a estas propriedades modo Hard-Code.
		 * Conforme o 'fixme' citado a cima. */
		/* versaoMaior = 0;
		 * versaoMenor = 1;
		 * versaoCorrecao = 0;
		 * versaoEstagio = "dev";
		 * nomeAplicacao = "DRYVE-DESAFIO-1"; */
	}
	
	
	
	
	/* Nenhuma destas 7 propriedades a baixo, possuem 'setter'. Valores dinâmicos pré-determinados pela classe e arquivo
	 * application.properties, não pelo 'desenvolvedor-coder', nem pelo usuário da aplicação.
	 * -
	 * Apesar destas 3 propriedades referentes aos 'getters' a baixo serem tipo 'byte', este retorno 'int' faz uso do
	 * casting automático (graças a hierarquia de tipos primitivos, o 'byte' é menor então se enquadra no 'int') para
	 * melhor experiência prática do desenvolvedor, assim guarda-se o objeto com menor tamanho de memória (byte) e,
	 * como a maioria dos projetosdos usam cálculos matemáticos de números inteiros na aplitude das variáveis 'int',
	 * então na utilização destes métodos não precisa lembrar-se de converter o tipo da propriedade em toda linha de
	 * comando que usá-la. */
	public int getVersaoMaior() { return versaoMaior; }
	
	
	
	public int getVersaoMenor() { return versaoMenor; }
	
	
	
	public int getVersaoCorrecao() { return versaoCorrecao; }
	
	
	
	public String getVersaoEstagio() { return versaoEstagio; }
	
	
	
	public String getVersaoAplicacao() {
		this.versaoAplicacao =
				this.getVersaoMaior()
						+ "." + this.getVersaoMenor()
						+ "." + this.getVersaoCorrecao()
						+ "-" + this.getVersaoEstagio();
		
		return versaoAplicacao;
	}
	
	
	
	public String getNomeAplicacao() { return nomeAplicacao; }
	
	
	
	public String getDescricaoAplicacao() {
		this.descricaoAplicacao = "[" + this.getNomeAplicacao() + ", versão " + this.getVersaoAplicacao() + "] é uma "
				+ "aplicação-serviço-web de \n"
				+ "cadastro de veículos com seus dados básicos e seu valor estimado na consulta da API da KBB.\n"
				+ "\n"
				+ "Dados de entrada da API: \t Dados armazenados da API: \t Dados de resposta da API:\n"
				+ "Placa Veículo; \t\t\t Placa Veículo; \t\t Placa Veículo;\n"
				+ "ID Marca; \t\t\t --- \t\t\t\t Nome Marca;\n"
				+ "ID Modelo; \t\t\t --- \t\t\t\t Nome Modelo;\n"
				+ "Preço no anúncio; \t\t Preço no anúncio; \t\t Preço no anúncio;\n"
				+ "Ano Veículo. \t\t\t Ano Veículo; \t\t\t Ano Veículo;\n"
				+ "\t\t \t\t Preço KBB; \t\t\t Preço KBB;\n"
				+ "\t\t \t\t Data Cadastro; \t\t Data Cadastro;\n"
				+ "\n"
				+ "\n"
				+ "Para sumário da API pública desta aplicação acesse URI \"/help\" .";
		
		return descricaoAplicacao;
	}
}
