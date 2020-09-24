package com.hsbc.tr.app.service;

import com.hsbc.tr.app.dao.CusDao;
import com.hsbc.tr.app.dao.CusNotFoundException;
import com.hsbc.tr.app.entity.Customer;

public class CusService {

	private CusDao dao;
	
	public CusService(CusDao dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
	}
	
	public String registerCustomer(int id,String name,String city) {
		return dao.save(new Customer(id,name,city));
	}
	
	public String getEmpDetails(int id) throws CusNotFoundException{
		Customer c=dao.findById(id);
		return c.getId()+" "+c.getName()+" "+c.getCity();
	}
	
	public void printCusList() {
		for(Customer c1 : dao.listAll()){
			System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getCity());
		}
	}
	
	public String deleteCus(int id) {
		return dao.remove(id);
	}
}
