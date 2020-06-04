package model.dao;

import db.DB;
import model.dao.impl.VandedorDaoJdbc;

public class DaoFactory {

	public static VendedorDao createVendedorDao() {
		return new VandedorDaoJdbc(DB.getConnection());
	}
}
