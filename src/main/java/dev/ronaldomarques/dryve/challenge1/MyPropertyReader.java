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


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



/**
 * @author      Ronaldo Marques.
 * @since       20210413.
 * @last_change 20210413.
 * @version     0.1.0-beta.
 * @category    Properties File Reader Tool Class Lib.
 * @analysis    Under dedevelopment...
 */
public final class MyPropertyReader {
	
	private String propertyFilePath = new String();
	private Properties properties = new Properties();
	private final String DRYVE_PROPERTIES_FILE = "./src/main/resources/dryvechallenge1.properties";
	
	
	
	public MyPropertyReader() {
		
		/* My personal shortcut. */
		this.propertyFilePath = DRYVE_PROPERTIES_FILE;
		
	}
	
	
	
	public MyPropertyReader(String propertyFilePath) {
		
		/* My personal shortcut. */
		if (propertyFilePath.equalsIgnoreCase("dryve"))
			this.propertyFilePath = DRYVE_PROPERTIES_FILE;
		
		this.propertyFilePath = propertyFilePath;
		
	}
	
	
	
	public Properties load() {
		
		try {
			FileInputStream fis = new FileInputStream(this.propertyFilePath);
			properties.load(fis);
		}
		catch (FileNotFoundException excep) {
			System.out.println(excep.getMessage());
			excep.printStackTrace();
		}
		catch (IOException excep) {
			System.out.println(excep.getMessage());
			excep.printStackTrace();
		}
		
		return properties;
		
	}
	
	
	
	public Properties load(String propertyFilePath) {
		
		try {
			FileInputStream fis = new FileInputStream(propertyFilePath);
			properties.load(fis);
		}
		catch (FileNotFoundException excep) {
			System.out.println(excep.getMessage());
			excep.printStackTrace();
		}
		catch (IOException excep) {
			System.out.println(excep.getMessage());
			excep.printStackTrace();
		}
		
		return properties;
		
	}
	
}
