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


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author      Ronaldo Marques.
 * @since       20210312.
 * @last_change 20210417.
 * @version     0.2.1-beta.
 * @category    Controller base: apresenta e instrui o usuário em sua utilização.
 * @analysis    ...
 */

@RestController
@RequestMapping(value = "/")
public final class DryveChallenge1Controller {
	
	private DryveChallenge1GlobalProperties dcgp = new DryveChallenge1GlobalProperties();
	
	
	
	/* Simples apresentação da aplicação. */
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		System.out.println("\n\nHello Dryve!\n"
				+ "\n"
				+ "Nome da aplicação:\t" + dcgp.getAppName() + "\n"
				+ "Versão:\t\t\t" + dcgp.getAppVersion() + "\n"
				+ "Descrição:\t\t" + dcgp.getAppDescription() + "\n");
		
		return "<HTML>"
				+ "<H1>Hello Dryve!</H1>"
				+ "<BR/> <BR/>"
				+ "<H4><B>Nome da aplicação: </B><I>" + dcgp.getAppName() + "</I></H4>"
				+ "<H4><B>Versão: </B><I>" + dcgp.getAppVersion() + "</I></H4>"
				+ "<H4><B>Descrição: </B><I>" + dcgp.getAppDescription() + "</I></H4>"
				+ "</HTML>";
		
	}
	
	
	
	/* Simples lista das funcionalidades disponíveis na versão. */
	@GetMapping("/help")
	@ResponseBody
	public String help() {
		
		System.out.println("\n\nHELP:\n"
				+ "\n"
				+ "Lista das funcionalidades disponíveis nesta versão.\n"
				+ "\n"
				+ "  - Presentation, GET, http/1.1, '/hello'\n"
				+ "\n"
				+ "  - Help (basic version), GET, http/1.1, '/help'\n"
				+ "\n"
				+ "  - Brands listing, GET, http/1.1, '/brands'\n"
				+ "\n"
				+ "  - Models listing, GET, http/1.1, '/models'\n"
				+ "\n"
				+ "  - Models-Years-Relation listing, GET, http/1.1, '/modelsyears'\n"
				+ "\n"
				+ "  - Vehicles listing (motor vehicles category only), GET, http/1.1, '/motorvehicles'\n"
				+ "\n"
				+ "  - Brands addition, POST, http/1.1, '/brands',\n"
				+ "    body payload in JSON: { \"name\": \"<value>\"  }\n"
				+ "\n"
				+ "  - Models addition, POST, http/1.1, '/models',\n"
				+ "    body payload in JSON:\n"
				+ "    {\n"
				+ "      \"name\": \"<value>\",\n"
				+ "      \"brand\": {\n"
				+ "        \"id\": \"<UUID-value>\"\n"
				+ "      }\n"
				+ "    }\n"
				+ "\n"
				+ "  - Models-Years-Relation addition, POST, http/1.1, '/models',\n"
				+ "    body payload in JSON:\n"
				+ "    {\n"
				+ "      \"....\": \"<value>\",\n"
				+ "      \"....\": {\n"
				+ "        \"...under construction...\": \"<UUID-value>\"\n"
				+ "      }\n"
				+ "    }\n"
				+ "\n"				
				+ "  - Vehicles addition (motor vehicles category only) POST, http/1.1, '/models',\n"
				+ "    body payload in JSON:\n"
				+ "    {\n"
				+ "      \"....\": \"<value>\",\n"
				+ "      \"....\": {\n"
				+ "        \"...under construction...\": \"<UUID-value>\"\n"
				+ "      }\n"
				+ "    }\n"
				+ "\n");
		
		return "<HTML>\r\n"
				+ "<H1>HELP:</H1>\r\n"
				+ "<BR/>\r\n"
				+ "<BR/>\r\n"
				+ "<H4><B>Lista das funcionalidades disponíveis nesta versão.</B></H4>\r\n"
				+ "<BR/>\r\n"
				+ "<li>Presentation, GET, http/1.1, '/hello'<BR/>\r\n"
				+ "<BR/>\r\n"
				+ "<ul>\r\n"
				+ "	<li>Help (basic version), GET, http/1.1, '/help'<BR/>\r\n"
				+ "	<BR/>\r\n"
				+ "	<li>Brands listing, GET, http/1.1, '/brands'<BR/>\r\n"
				+ "	<BR/>\r\n"
				+ "	<li>Models listing, GET, http/1.1, '/models'<BR/>\r\n"
				+ "	<BR/>\r\n"
				+ "	<li>Models-Years-Relation listing, GET, http/1.1, '/modelsyears'<BR/>\r\n"
				+ "	<BR/>\r\n"
				+ "	<li>Vehicles listing (motor vehicles category only), GET, http/1.1, '/motorvehicles'<BR/>\r\n"
				+ "	<BR/>\r\n"
				+ "	<li>Brands addition, POST, http/1.1, '/brands',<BR/>\r\n"
				+ "	body payload in JSON: { \"name\": \"<value>\"  }<BR/>\r\n"
				+ "	<BR/>\r\n"
				+ "	<li>Models addition, POST, http/1.1, '/models',<BR/>\r\n"
				+ "	body payload in JSON:<BR/>\r\n"
				+ "	{<BR/>\r\n"
				+ "		\"name\": \"<value>\",<BR/>\r\n"
				+ "		\"brand\": {<BR/>\r\n"
				+ "			\"id\": \"<UUID-value>\"<BR/>\r\n"
				+ "		}<BR/>\r\n"
				+ "	}<BR/>\r\n"
				+ "	<BR/>\r\n"
				+ "	<li>Models-Years-Relation addition, POST, http/1.1, '/models',<BR/>\r\n"
				+ "	body payload in JSON:<BR/>\r\n"
				+ "	{<BR/>\r\n"
				+ "		\"....\": \"<value>\",<BR/>\r\n"
				+ "		\"....\": {<BR/>\r\n"
				+ "			\"...under construction...\": \"<UUID-value>\"<BR/>\r\n"
				+ "		}<BR/>\r\n"
				+ "	}<BR/>\r\n"
				+ "	<BR/>\r\n"
				+ "	<li>Vehicles addition (motor vehicles category only) POST, http/1.1, '/models',<BR/>\r\n"
				+ "	body payload in JSON:<BR/>\r\n"
				+ "	{<BR/>\r\n"
				+ "		\"....\": \"<value>\",<BR/>\r\n"
				+ "		\"....\": {<BR/>\r\n"
				+ "			\"...under construction...\": \"<UUID-value>\"<BR/>\r\n"
				+ "		}<BR/>\r\n"
				+ "	}<BR/>\r\n"
				+ "<BR/>\r\n"
				+ "</ul>\r\n"
				+ "</HTML>\r\n"
				+ "";
		
	}
	
}
