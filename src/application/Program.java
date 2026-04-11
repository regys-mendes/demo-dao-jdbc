package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(2, "Pop", "pop123@gmail.com", new Date(), 5000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
