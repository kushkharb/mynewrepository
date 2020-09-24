package com.hsbc.tr.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.tr.app.dao.CusDao;
import com.hsbc.tr.app.dao.CusNotFoundException;
import com.hsbc.tr.app.entity.Customer;

public class CusDaoMapImpl implements CusDao{
	
static Map<Integer,Customer> cusDB=new HashMap<>();
	
	public CusDaoMapImpl() {
		// TODO Auto-generated constructor stub
		cusDB.put(100,new Customer(100,"kush","safidon"));
		cusDB.put(101,new Customer(101,"loki","kotakpura"));
		cusDB.put(102,new Customer(102,"poki","kota"));
		cusDB.put(103,new Customer(103,"kirti","cheeka"));
		cusDB.put(104,new Customer(104,"singla","sangroor"));
	
	}

	@Override
	public Customer findById(int id) throws CusNotFoundException {
		// TODO Auto-generated method stub
		try {
	  if(cusDB.containsKey(id)) {
		  return cusDB.get(id);
	  }else {
		  throw new CusNotFoundException();
	  }
	  }catch(CusNotFoundException e) {
		  throw e;
	  }
	}

	@Override
	public List<Customer> listAll() {
		// TODO Auto-generated method stub
		ArrayList<Customer> cusList=new ArrayList(cusDB.values());
		return cusList;
	}

	@Override
	public String save(Customer c) {
		// TODO Auto-generated method stub
		
		if(cusDB.containsKey(c.getId())) {
			return "EMp already exist";
		}else {
			cusDB.put(c.getId(),c);
			return "emp registed succ";
		}
	}

	@Override
	public String remove(int id) {
		// TODO Auto-generated method stub
		cusDB.remove(id);
		return "removed";
	}

	
	
}
