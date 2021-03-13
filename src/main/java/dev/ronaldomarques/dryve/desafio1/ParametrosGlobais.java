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
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;




/**
 * @author  Ronaldo Marques
 * @since   20210312
 * @version 20210312
 */
@Component
@ConfigurationProperties(prefix = "dryve")
public class ParametrosGlobais {
	
	/* FIXME: A leitura das 'application.properties' para os parâmetros globais da aplicação (os atributos desta classe)
	 * não funcionaram como o esperado, está carregando 0 e null.
	 * 
	 * Verificarei correção desta questão com menos prioridade futuramente, conforme meu objetivo/prioriades de
	 * entrega. Enquanto isso colocarei valores nas propriedades como 'Hard-Code', o que pretendo evitar. */
	@Value("${versaoMaior}")
	private static byte versaoMaior;
	
	@Value("${versaoMenor}")
	private static byte versaoMenor;
	
	@Value("${versaoCorrecao}")
	private static byte versaoCorrecao;
	
	@Value("${versaoEstagio}")
	private static String versaoEstagio;
	
	/* Valor desta propriedade é determinado no pré-constructor. */
	private static String versaoAplicacao;
	
	@Value("${nomeAplicacao}")
	private static String nomeAplicacao;
	
	/* Valor desta propriedade é determinado no pré-constructor. */
	private static final String descricaoAplicacao;
	
	/* Pré-Constructor para processar dados para esta static-class que servirá dados à aplicação porém, obviamente, esta
	 * não possuirá constructor padrão de uma instância por ser uma static-class. */
	static {
		/* FIXME: Temporariamente atribuir valores a estas propriedades modo Hard-Code.
		 * Conforme o 'fixme' citado a cima. */
		versaoMaior = 0;
		versaoMenor = 1;
		versaoCorrecao = 0;
		versaoEstagio = "dev";
		nomeAplicacao = "DRYVE-DESAFIO-1";
		
		/* Ler os valores de parâmetros do arquivo (application.properties) para dentro de suas respectivas properties.
		 * SEGUINDO BOAS PRÁTICAS DE MANTER A CODIFICAÇÃO COM O MÍNIMO DE 'HARD-CODE' POSSÍVEL. */
		
		versaoAplicacao = versaoMaior + "." + versaoMenor + "." + versaoCorrecao + "-" + versaoEstagio;
		descricaoAplicacao = "[" + nomeAplicacao + ", versão " + versaoAplicacao + "]\n"
				+ "\n"
				+ "Serviço web de cadastro de veículos com seus dados básicos o valor estimado aproximado desse\n"
				+ "veículo (valor baseado na consultar na API da KBB).\n"
				+ "\n"
				+ "Dados básicos do veículo são:\n"
				+ "\tPlaca: _\n"
				+ "\tID Marca: _\n"
				+ "\tID Modelo: _\n"
				+ "\tPreço do anúncio: _\n"
				+ "\tAno: _\n";
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
	public static int getVersaoMaior() { return versaoMaior; }
	
	
	
	public static int getVersaoMenor() { return versaoMenor; }
	
	
	
	public static int getVersaoCorrecao() { return versaoCorrecao; }
	
	
	
	public static String getVersaoEstagio() { return versaoEstagio; }
	
	
	
	public static String getVersaoAplicacao() { return versaoAplicacao; }
	
	
	
	public static String getNomeAplicacao() { return nomeAplicacao; }
	
	
	
	public static String getDescricaoAplicacao() { return descricaoAplicacao; }
}
