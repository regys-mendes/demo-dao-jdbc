package application;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("TEST 1: Department [findById] ");
        Department department = departmentDao.findById(2);
        System.out.println(department);
        System.out.println();


        System.out.println("TEST 2: Department [findAll] ");
        List<Department> list;
        list = departmentDao.findAll();

        for(Department obj : list){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("TEST 3: Department [Insert] ");
        Department obj = new Department(null, "Places");
        departmentDao.insert(obj);
        System.out.println("Inserted! New Id = " + obj.getId());
        System.out.println();

        System.out.println("TEST 4: Department [Update]");
        department = departmentDao.findById(2);
        department.setName("Food");
        departmentDao.update(department);
        System.out.println("Update Successfully! ");
        System.out.println();


        System.out.println("TEST 5: Department [DeleteById]");
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Successfully! ");


        sc.close();
    }
}
