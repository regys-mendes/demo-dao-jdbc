package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("TEST 1: Seller [findById] ");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();

        System.out.println("TEST 2: Seller [findByDepartment] ");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("TEST 3: Seller [findAll] ");
        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("TEST 4: Seller [Insert] ");
        Seller newSeller = new Seller(0, "Regys", "example@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());
        System.out.println();

        System.out.println("TEST 5: Seller [Update] ");
        seller = sellerDao.findById(1);
        seller.setName("Bob");
        sellerDao.update(seller);
        System.out.println("Update Completed!");
    }
}
