/**
 * Soon this micro classe will be exported to my personal java tools library.
 */
package dev.ronaldomarques.dryve.challenge1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * @author ropim
 */
public final class MyDate {
	
	private static Date myDate;
	private static SimpleDateFormat mySdf;
	
	
	
	public static Date myToday() {
		
		try {
			mySdf = new SimpleDateFormat("yyyy-mm-dd");
			myDate = mySdf.parse(new Date().toString());
			return myDate;
		}
		catch (ParseException excep1) {
			System.out.println("EXCECAO 'ParseException'."); // Sob desenvolvimento.
			excep1.printStackTrace();
		}
		catch (Exception excep2) {
			System.out.println("EXCECAO diferente de 'ParseException'."); // Sob desenvolvimento.
			excep2.printStackTrace();
		}
		
		return null;
		
	}
	
}
