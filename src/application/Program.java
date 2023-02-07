package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Carlos", "carlos@gmail.com", new Date(), 14000.81, obj);
		
		System.out.println(obj);
		System.out.println(seller);
	}

}
