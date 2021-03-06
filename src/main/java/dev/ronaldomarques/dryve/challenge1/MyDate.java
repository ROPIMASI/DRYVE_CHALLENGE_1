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


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * @author      Ronaldo Marques.
 * @since       20210413.
 * @last_change 20210414.
 * @version     0.2.0-beta.
 * @category    Date Tool Class Lib.
 * @analysis    Under dedevelopment...
 */
public final class MyDate {
	
	private static Date myDate;
	private static SimpleDateFormat mySdf;
	
	
	
	public static Date myToday() {
		
		mySdf = new SimpleDateFormat("yyyy-mm-dd");
		
		try {
			myDate = mySdf.parse(new Date().toString());
			return myDate;
		}
		catch (ParseException excep1) {
			System.out.println("EXCEPTION: 'ParseException'."); // Under dedevelopment.
			excep1.printStackTrace();
		}
		catch (Exception excep2) {
			System.out.println("EXCEPTION: Any else, different from 'ParseException'."); // Under dedevelopment.
			excep2.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
	public static String myDateFormatToString(Date date) {
		
		mySdf = new SimpleDateFormat("yyyy-mm-dd");
		
		try {
			myDate = mySdf.parse(date.toString());
			return myDate.toString();
		}
		catch (ParseException excep1) {
			System.out.println("EXCEPTION: 'ParseException'."); // Under dedevelopment.
			excep1.printStackTrace();
		}
		catch (Exception excep2) {
			System.out.println("EXCEPTION: Any else, different from 'ParseException'."); // Under dedevelopment.
			excep2.printStackTrace();
		}
		
		return null;
		
	}
	
}
