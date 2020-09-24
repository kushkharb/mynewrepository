package com.hsbc.tr.app;

import com.hsbc.tr.app.dao.CusDao;
import com.hsbc.tr.app.impl.CusDaoMapImpl;
import com.hsbc.tr.app.service.CusService;

public class MainApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		CusDao dao=new CusDaoMapImpl();
		CusService service=new CusService(dao);
		
		service.printCusList();
		
		System.out.println("------------------");

		try {
		System.out.println(service.getEmpDetails(109));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("------------------");

		System.out.println(service.deleteCus(104));
		
		System.out.println("------------------");

		System.out.println(service.registerCustomer(999,"jatram", "panipat"));
		
		System.out.println("------------------");
		service.printCusList();

	}

}
