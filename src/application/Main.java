package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    static void main() {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==Test 1 Find by iD: ");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("\n== Test 2 Find Department by iD: ");
        Department dep = new Department(4, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n== Test 3 Find All: ");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n== Test 4 seller insert: ");
        Seller newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 1000.0, dep);
        sellerDao.insert(newseller);
        System.out.println("inserted! new id = " + newseller.getId());
    }
}
