package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: Seller findAll ===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Chris & Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		
		System.out.println("\n=== TEST 5: Seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		seller.setEmail("martha@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		
		System.out.println("\n=== TEST 6: Seller delete ===");
		System.out.print("Enter id for delete test: ");
		Scanner sc = new Scanner(System.in);
		sellerDao.deleteById(sc.nextInt());
		System.out.println("Delete completed!");
		sc.close();
		
	}

}
