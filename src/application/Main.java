package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==Find by iD: ");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("\n==Find Department by iD: ");
        Department dep = new Department(4, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n==Find All: ");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}
