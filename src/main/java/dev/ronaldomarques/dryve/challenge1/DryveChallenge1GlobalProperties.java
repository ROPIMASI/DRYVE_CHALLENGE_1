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
package dev.ronaldomarques.dryve.challenge1;


import java.util.Properties;



/**
 * @author      Ronaldo Marques.
 * @since       20210312.
 * @last_change 20210413.
 * @version     0.2.0-beta.
 * @category    Parameters Handling.
 * @analysis    Inicia em forma de serviço no servidor Tomcat.
 */
public final class DryveChallenge1GlobalProperties {
	
	/* A dependency tool. Instantied without arg, set MY TEMP default source file. */
	private MyPropertyReader mpr = new MyPropertyReader();
	
	/* This class' properties */
	private byte majorVersion;
	private byte minorVersion;
	private byte patchVersion;
	private String statusVersion;
	private String buildVersion;
	private String appName;
	private String appVersion;
	private String appDescription;
	
	
	
	/* Special task for CONSTRUCTOR: to load all values from dryvechallenge1.properties file to their respective
	 * variables/properties. */
	public DryveChallenge1GlobalProperties() {
		
		/* Temporarily special var (properties organizer) to catch the read properties from the file. */
		var properties = new Properties();
		
		/* Loading the properties from the properties file to tmp var, without arg, set MY TEMP default source file. */
		properties = mpr.load();
		
		/* Attributing each property's value to its respective variable-property. */
		this.majorVersion = Byte.parseByte(properties.getProperty("dryve.global.major-version"));
		this.minorVersion = Byte.parseByte(properties.getProperty("dryve.global.minor-version"));
		this.patchVersion = Byte.parseByte(properties.getProperty("dryve.global.patch-version"));
		this.statusVersion = properties.getProperty("dryve.global.status-version");
		this.buildVersion = properties.getProperty("dryve.global.build-version");
		this.appName = properties.getProperty("dryve.global.application-name");
		
		this.appVersion =
				getMajorVersion() + "." + getMinorVersion() + "." + getPatchVersion() + "-" + getStatusVersion()
						+ "+" + getBuildVersion();
		
		this.appDescription = "[" + getAppName() + ", versão " + getAppVersion() + "] "
				+ "é uma aplicação-serviço-web de cadastro de veículos com seus dados básicos e seu valor estimado na consulta da API da KBB.\n"
				+ "\n"
				+ "Dados de entrada para API:\n"
				+ "\tPlaca do veículo;\n"
				+ "\tID da marca;\n"
				+ "\tID do modelo;\n"
				+ "\tAno do veículo;\n"
				+ "\tPreço no anúncio.\n"
				+ "\n"
				+ "Dados armazenados na API:\n"
				+ "\tPlaca do veículo;\n"
				+ "\tID da marca;\n"
				+ "\tNome da marca;\n"
				+ "\tID do modelo;\n"
				+ "\tNome do modelo;\n"
				+ "\tAno do veículo;\n"
				+ "\t\tRelação entre modelo, ano, e sua referência na KBB-API;\n"
				+ "\tPreço no anúncio;\n"
				+ "\tPreço na API KBB;\n"
				+ "\tData do cadastro.\n"
				+ "\n"
				+ "Dados de resposta da API:\n"
				+ "\tPlaca do veículo;\n"
				+ "\tNome da marca;\n"
				+ "\tNome do modelo;\n"
				+ "\tAno do veículo;\n"
				+ "\tPreço no anúncio;\n"
				+ "\tPreço na API KBB;\n"
				+ "\tData do cadastro.\n"
				+ "\n"
				+ "Para sumário da API pública desta aplicação acesse o URI \"/help\" .";
		
	}
	
	
	
	/* Nenhuma destas 7 propriedades a cima, possuem 'setter'. Valores dinâmicos pré-determinados pela classe e arquivo
	 * <file_name>.properties, não pelo 'desenvolvedor-coder', nem pelo usuário da aplicação.
	 * -
	 * Apesar destas 3 propriedades a cima serem tipo 'byte' seus 'getters' a baixo são tipo retorno 'int' para fazer
	 * uso do casting automático (graças a hierarquia de tipos primitivos, o 'byte' é menor então se enquadra no 'int')
	 * para melhor experiência prática do desenvolvedor, assim guarda-se o objeto com menor tamanho de memória (byte) e,
	 * como a maioria dos projetos usam cálculos matemáticos de números inteiros na aplitude das variáveis 'int',
	 * então na utilização destes métodos não precisa lembrar-se de converter o tipo da propriedade em toda linha de
	 * comando que usá-la. */
	public int getMajorVersion() { return majorVersion; }
	
	
	
	public int getMinorVersion() { return minorVersion; }
	
	
	
	public int getPatchVersion() { return patchVersion; }
	
	
	
	public String getStatusVersion() { return statusVersion; }
	
	
	
	public String getBuildVersion() { return buildVersion; }
	
	
	
	public String getAppName() { return appName; }
	
	
	
	public String getAppVersion() { return appVersion; }
	
	
	
	public String getAppDescription() { return appDescription; }
	
}
