package aplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("=== Teste N°1: vandedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);
		
		System.out.println("\n=== Teste N°2: vandedor findByIDepartment ===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> lista = vendedorDao.findByDepartament(departamento);
		for (Vendedor obj : lista) {
			System.out.println(obj);	
		}
		
		System.out.println("\n=== Teste N°3: vandedor findAll ===");		
		lista = vendedorDao.findAll();
		for (Vendedor obj : lista) {
			System.out.println(obj);	
		}	
		
		System.out.println("\n=== Teste N°4: vandedor insert ===");
		Vendedor newVendedor = new Vendedor(null, "Sandro", "sandro@hotmail.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(newVendedor);
		System.out.println("Inserido! Novo id = " + newVendedor.getId() );
		
		
		System.out.println("\n=== Teste N°5: vandedor update ===");
		vendedor = vendedorDao.findById(8);
		vendedor.setNome("Maria Silva");
		vendedorDao.update(vendedor);
		System.out.println("Atualização Completa");
		
		System.out.println("\n=== Teste N°6: vandedor delete ===");
		System.out.print("Informe o ID para ser deletado: ");
		int id = tec.nextInt();
		vendedorDao.deleteById(id);
		System.out.println("O ID foi deletado ");
		
		tec.close();
		
	}

}
