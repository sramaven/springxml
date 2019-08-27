package com.capg.SpringAssignment.SpringAssign;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capg.SpringAssignment.Address.Customer;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
	public Customer cust;
   @Test
   public void testCustomerId()
   {
	   cust.setCustomerId(5);
	   assertEquals(5,cust.getCustomerId());
   }
   
}
