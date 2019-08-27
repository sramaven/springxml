package com.capg.SpringAssignment.SpringAssign;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capg.SpringAssignment.Address.Address;
import com.capg.SpringAssignment.Address.Customer;

public class CustomerTest {

	public Customer cust = new Customer(1, "raghu", 254, new Address());
	   @Test
	   public void testCustomerName()
	   {
		  // cust.setCustomerName("Raghu");
		   assertEquals("raghu", cust.getCustomerName());
	   }
	   
}
