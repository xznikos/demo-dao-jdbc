package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Main {
    static void main() {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==Find by iD: ");
        Seller seller = sellerDao.findById(2);

        System.out.println(seller);
    }
}
