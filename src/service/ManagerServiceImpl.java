package service;

import emtities.Manager;
import emtities.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerServiceImpl implements IManaging<Manager> {

    @Override
    public void insert(Scanner scanner, ArrayList<Manager> list) {
        System.out.println("Mời nhập tên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập lương");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập lương trách nhiệm");
        double salaryResponsibility = Double.parseDouble(scanner.nextLine());
        Manager manager = new Manager(name,salary,salaryResponsibility);
        list.add(manager);
    }

}
