package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    static void main() {
        Department obj = new Department(1, "RH");
        Seller fun1 = new Seller(1, "Nikolas", "nikolas@gmail", new Date(), 1200.0, obj);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(fun1);
    }
}
