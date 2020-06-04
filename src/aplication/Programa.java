package aplication;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Vendedor;

public class Programa {
	
	public static void main(String[] args) {
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		Vendedor seller = vendedorDao.findById(3);
		
		System.out.println(seller);
	}

}
