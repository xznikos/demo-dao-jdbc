package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTwo {
    static void main() {
        try(Scanner sc = new Scanner(System.in)){

            DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

            System.out.println(" 1 ------ Find by ID");
            Department dep = departmentDao.findById(3);
            System.out.println(dep);

            System.out.println("\n2 ----- Find all ");
            List<Department> list = departmentDao.findAll();
            for (Department obj : list) {
                System.out.println(obj);
            }

//            System.out.println("\n ------ Insert department ");
//            Department newdep = new Department(5, "Rooms");
//            departmentDao.insert(newdep);
//            System.out.println("Insert completed " + newdep.getId());

            System.out.println("\n2 ----- Update ");
            dep = departmentDao.findById(5);
            dep.setName("Cars");
            departmentDao.update(dep);
            System.out.println("Update completed " + dep.getId());

            System.out.println("\n2 ----- Delete ");
            System.out.println("Enter id for delete: ");
            int id = sc.nextInt();
            departmentDao.deleteById(id);
            System.out.println("Deleted completed");

        }
    }
}
