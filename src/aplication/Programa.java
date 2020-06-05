package aplication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {
	
	public static void main(String[] args) {
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("=== Teste N°1: vandedor findById ===");
		Vendedor seller = vendedorDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Teste N°2: vandedor findByIDepartment===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> lista = vendedorDao.findByDepartament(departamento);
		for (Vendedor obj : lista) {
			System.out.println(obj);	
		}
		
	}

}
