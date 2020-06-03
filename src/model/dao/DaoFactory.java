package model.dao;

import model.dao.impl.VandedorDaoJdbc;

public class DaoFactory {

	public static VendedorDao createVendedorDao() {
		return new VandedorDaoJdbc();
	}
}
