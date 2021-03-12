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
public final class ParametrosGlobais {
	private static String NOME_APLICACAO = "-";
	private static byte VERSAO_MAIOR = 0;
	private static byte VERSAO_MENOR = 0;
	private static byte VERSAO_CORRECAO = 0;
	private static String VERSAO_ESTADO = "-";
	private static String VERSAO_APLICACAO =
			VERSAO_MAIOR + "." + VERSAO_MENOR + "." + VERSAO_CORRECAO + "-" + VERSAO_ESTADO;
	public static final String DESCRICAO_APLICACAO = "[" + NOME_APLICACAO + "versão:" + VERSAO_APLICACAO + "]\n"
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
	
	/* Pré-Constructor para processar dados para esta static-class que servirá dados à aplicação porém, obviamente, esta
	 * não possuirá constructor padrão de uma instância por ser uma static-class. */
	static {
		/* Ler os valores de parâmetros do arquivo externo (application.properties) à aplicação para dentro de suas
		 * respectivas properties. SEGUINDO BOAS PRÁTICAS DE MANTER A CODIFICAÇÃO COM O MÍNIMO DE 'HARD-CODE'
		 * POSSÍVEL. */
		setNOME_APLICACAO("Dryve Desafio #1");
		setVERSAO_MAIOR((byte) 0);
		setVERSAO_MENOR((byte) 0);
		setVERSAO_CORRECAO((byte) 0);
		setVERSAO_ESTADO("dev");
	}
	
	
	
	public static String getNOME_APLICACAO() { return NOME_APLICACAO; }
	
	
	
	public static void setNOME_APLICACAO(String nome) { NOME_APLICACAO = nome; }
	
	
	
	public static int getVERSAO_MAIOR() { return VERSAO_MAIOR; }
	/* Apesar desta propriedade ser tipo byte, este retorno faz uso do casting automático (e hierarquia de tipos
	 * primitivos, o 'byte' é menor então se enquadra no 'int') para uma experiência mais prática do desenvolvedor
	 * pelos algoritmos da aplicação, assim guarda-se o objeto com menor tamanho de memória (byte) e na utilização não
	 * precisa lembrar-se de converter o tipo da propriedade em toda linha de comando que usá-la. */
	
	
	
	public static void setVERSAO_MAIOR(byte versao) { VERSAO_MAIOR = versao; }
	
	
	
	public static int getVERSAO_MENOR() { return VERSAO_MENOR; }
	/* Apesar desta propriedade ser tipo byte, este retorno faz uso do casting automático (e hierarquia de tipos
	 * primitivos, o 'byte' é menor então se enquadra no 'int') para uma experiência mais prática do desenvolvedor
	 * pelos algoritmos da aplicação, assim guarda-se o objeto com menor tamanho de memória (byte) e na utilização não
	 * precisa lembrar-se de converter o tipo da propriedade em toda linha de comando que usá-la. */
	
	
	
	public static void setVERSAO_MENOR(byte versao) { VERSAO_MENOR = versao; }
	
	
	
	public static int getVERSAO_CORRECAO() { return VERSAO_CORRECAO; }
	/* Apesar desta propriedade ser tipo byte, este retorno faz uso do casting automático (e hierarquia de tipos
	 * primitivos, o 'byte' é menor então se enquadra no 'int') para uma experiência mais prática do desenvolvedor
	 * pelos algoritmos da aplicação, assim guarda-se o objeto com menor tamanho de memória (byte) e na utilização não
	 * precisa lembrar-se de converter o tipo da propriedade em toda linha de comando que usá-la. */
	
	
	
	public static void setVERSAO_CORRECAO(byte versao) { VERSAO_CORRECAO = versao; }
	
	
	
	public static String getVERSAO_ESTADO() { return VERSAO_ESTADO; }
	
	
	
	public static void setVERSAO_ESTADO(String versao) { VERSAO_ESTADO = versao; }
	
	
	
	public static String getVERSAO_APLICACAO() { return VERSAO_APLICACAO; }
	// VERSAO_APLICACAO não possui setter. String dinâmica pré-determinada pela classe.
	
	
	
	public static String getDESCRICAO_APLICACAO() { return DESCRICAO_APLICACAO; }
	// DESCRICAO_APLICACAO não possui setter. String dinâmica pré-determinada pela classe.
}
