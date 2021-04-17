/**
 * 
 */
package dev.ronaldomarques.dryve.challenge1.api.service;


import java.math.BigDecimal;



/**
 * @author ropim
 */
public final class KbbApiService {
	
	public static BigDecimal findPrice(long kbbId) {
		
		// To access https://6048bdf1fb5dcc0017968e3f.mockapi.io/api/v1/kbb/prices/{bkkId}
		
		// Get the respective price, and return.
		
		// If not exist : handle error.
		
		/* FURTHER: real value, temporarily bkkId value as price. */
		// double tmp = (kbbId < 0) ? 9.99 : kbbId;
		return BigDecimal.valueOf(((kbbId < 0) ? 9.99 : kbbId));
		
	}
	
}
