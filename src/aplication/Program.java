package aplication;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department deparmtent = new Department(1, "alan");
		
		Seller seller = new Seller(1, "alan", "alanzinid@gmail.com", new Date(), deparmtent);
		
		System.out.println(seller);
	}

}
