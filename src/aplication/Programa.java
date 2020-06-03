package aplication;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {
	
	public static void main(String[] args) {
		
		Departamento obj = new Departamento(1, "Books");
		Vendedor vendedor = new Vendedor(21, "Regina", "regina@gmail.com", new Date(), 3000.0, obj);
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println(vendedor);
		System.out.println(obj);
	}

}
