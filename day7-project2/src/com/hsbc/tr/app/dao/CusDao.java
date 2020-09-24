package com.hsbc.tr.app.dao;

import java.util.List;

import com.hsbc.tr.app.entity.Customer;

/**
 * 
 * @author Kush Kharb
 *
 */

public interface CusDao {
	
	/**
	 * this method finds the Customer based on its id
	 * @param id - id of an Customer
	 * @return it returns Customer object
	 * @throws CusNotFoundException
	 */

	public Customer findById(int id) throws CusNotFoundException;
	
	/**
	 * List of all customers from the data store
	 * @return list of Customer
	 */
	public List<Customer> listAll();
	
	/**
	 * 
	 * @param c - is the customer object to insert in data
	 * @return message
	 */
	public String save(Customer c);
	/**
	 * 
	 * @param id -id of a Customer
	 * @return message
	 */
	public String remove(int id);
}
