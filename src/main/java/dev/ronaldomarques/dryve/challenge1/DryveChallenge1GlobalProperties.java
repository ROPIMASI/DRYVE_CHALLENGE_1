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


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



/**
 * @author      Ronaldo Marques.
 * @since       20210312.
 * @last_change 20210329.
 * @version     0.2.0.
 * @category    Parameters Handling.
 * @analysis    Inicia em forma de serviço no servidor Tomcat.
 */
@Component
public final class DryveChallenge1GlobalProperties {
	
	@Value("${dryve.global.major-version}")
	private byte majorVersion;
	
	@Value("${dryve.global.minor-version}")
	private byte minorVersion;
	
	@Value("${dryve.global.patch-version}")
	private byte patchVersion;
	
	@Value("${dryve.global.status-version}")
	private String stageVersion;
	
	@Value("${dryve.global.application-name}")
	private String appName;
	
	/* Valor desta propriedade é determinado no static-constructor. */
	private String appVersion;
	
	/* Valor desta propriedade é determinado no static-constructor. */
	private String appDescription;
	
	/* O Constructor Padrão (na JVM) é chamado ANTES da injeção de valor @Value, então constrói o MenagedBean no
	 * SpringContainer com propriedades 0 e null, valor não-funcional. Sendo assim, farei um método para sincronizar
	 * os valores das propriedades da classe, até eu refatora-la num futuro próximo.
	 * // FURTHER: public DryveChallenge1GlobalProperties() { } */
	
	
	
	public void sinc() {
		
		appVersion = getMajorVersion() + "." + getMinorVersion() + "." + getPatchVersion() + "-" + getStageVersion();
		appDescription = "[" + getAppName() + ", versão " + getAppVersion() + "] é uma "
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
		
	}
	
	
	
	/* Nenhuma destas 7 propriedades a cima, possuem 'setter'. Valores dinâmicos pré-determinados pela classe e arquivo
	 * application.properties, não pelo 'desenvolvedor-coder', nem pelo usuário da aplicação.
	 * -
	 * Apesar destas 3 propriedades a cima referentes aos 'getters' a baixo serem tipo 'byte', este retorno 'int' faz
	 * uso do casting automático (graças a hierarquia de tipos primitivos, o 'byte' é menor então se enquadra no 'int')
	 * para melhor experiência prática do desenvolvedor, assim guarda-se o objeto com menor tamanho de memória (byte) e,
	 * como a maioria dos projetos usam cálculos matemáticos de números inteiros na aplitude das variáveis 'int',
	 * então na utilização destes métodos não precisa lembrar-se de converter o tipo da propriedade em toda linha de
	 * comando que usá-la. */
	public int getMajorVersion() { return majorVersion; }
	
	
	
	public int getMinorVersion() { return minorVersion; }
	
	
	
	public int getPatchVersion() { return patchVersion; }
	
	
	
	public String getStageVersion() { return stageVersion; }
	
	
	
	public String getAppName() { return appName; }
	
	
	
	public String getAppVersion() { return appVersion; }
	
	
	
	public String getAppDescription() { return appDescription; }
	
}
//
//
//
//
//
//
//
//
