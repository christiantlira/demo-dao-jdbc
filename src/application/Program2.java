package application;

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
		
		System.out.println("=== TEST 2: Department update ===");
		newDep.setName("Jogos");
		depDao.update(newDep);
		System.out.println("Update completed!");
		
		
	}

}
