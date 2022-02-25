package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});	
	}
	
	@Test
	public void SetTotalAmountShouldUpdateWhenValidData() {
		
		//arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//actions
		f.setTotalAmount(90000.0);
		
		//assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}
	
	@Test
	public void SetTotalAmountShouldIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(101000.0, 2000.0, 80);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateWhenValidData() {
		
		//arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//actions
		f.setIncome(2100.0);
		
		//assert
		Assertions.assertEquals(2100.0, f.getIncome());
			
	}
	
	@Test
	public void setIncomeShouldUpdateIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 1800.0, 80);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateWhenValidData() {
		
		//arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//actions
		f.setMonths(85);
		
		//assert
		Assertions.assertEquals(85, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldUpdateIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f =  new Financing(100000.0, 1800.0, 75);
		} );
	}
	
	@Test
	public void entryShouldCalculateOpenValue() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, f.entry());
			
	}
	
	@Test
	public void quotaShouldCalculadeInstallmentCorrectly() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000, f.quota());
	}
	
}
