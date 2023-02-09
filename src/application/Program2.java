package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department insert ===");
		Department newDep = new Department(null, "Games");
		depDao.insert(newDep);
		System.out.println("Inserted! new Department id = " + newDep.getId());
		
		System.out.println("\n=== TEST 2: Department update ===");
		newDep.setName("Jogos");
		depDao.update(newDep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 3: Department delete ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id for delete test: ");
		depDao.deleteById(sc.nextInt());
		System.out.println("Delete completed!");

		
		System.out.println("\n=== TEST 4: Department findById ===");
		Department dep = depDao.findById(sc.nextInt());
		System.out.println(dep);
		sc.close();
		
		System.out.println("\n=== TEST 5: Department findAll ===");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		list.forEach(System.out::println);
	}

}
