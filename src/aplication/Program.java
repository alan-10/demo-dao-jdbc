package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department deparmtent = new Department(1, "alan");

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller seller = sellerDao.findById(2);

		System.out.println(seller);

	}

}
