package tests.entities;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		assertNotNull(new Financing(100000.0, 2000.0, 80));

		/*
		 * Double totalAmount = 100000.0; Double income = 2000.0; Integer months = 80;
		 * Financing financing = new Financing(totalAmount, income, months);
		 * 
		 * assertEquals(totalAmount, financing.getTotalAmount()); assertEquals(income,
		 * financing.getIncome()); assertEquals(months, financing.getMonths());
		 */

		/*
		 * assertDoesNotThrow(() -> { new Financing(100000.0, 2000.0, 20); });
		 */
	}

	@Test
	public void constructorShouldThrowExceptionWhenInvalidData() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Financing(100000.0, 2000.0, 20);
		});

	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenValidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double totalAmount = 10000.0;
		
		financing.setTotalAmount(totalAmount);
		
		assertEquals(totalAmount, financing.getTotalAmount());
		
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		assertThrows(IllegalArgumentException.class, () -> {
			financing.setTotalAmount(100000000.0);			
		});
	}
	
	@Test
	public void setIncomeShouldUpdateValueWhenValidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double income = 3000.0;
		
		financing.setIncome(income);
		
		assertEquals(income, financing.getIncome());
		
	}
	
	@Test
	public void setIncomeShouldThrowExceptionWhenInvalidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);

		assertThrows(IllegalArgumentException.class, () -> {
			financing.setIncome(200.0);			
		});
	}
	
	@Test
	public void setMonthsShouldUpdateValueWhenValidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		int months = 90;
		
		financing.setMonths(months);
		
		assertEquals(months, financing.getMonths());
		
	}
	
	@Test
	public void setMonthsShouldThrowExceptionWhenInvalidData() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		assertThrows(IllegalArgumentException.class, () -> {
			financing.setMonths(20);			
		});
	}
	
	@Test
	public void entryShouldCalculateEntryValue() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		assertEquals(20000.0, financing.entry());

	}
	
	@Test
	public void quotaShouldCalculateQuotaValue() {
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		assertEquals(1000.0, financing.quota());

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
