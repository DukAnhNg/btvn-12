package service;

import emtities.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffServiceImpl implements IManaging<Staff>{


    @Override
    public void insert(Scanner scanner,ArrayList<Staff> list) {
        System.out.println("Mời nhập tên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập lương");
        double salary = Double.parseDouble(scanner.nextLine());
        Staff staff = new Staff(name,salary) {
            @Override
            public double caculateSalary() {
                return salary;
            }

            @Override
            public double caculateTax() {
                if (caculateSalary()<11000) return 0;
                return (caculateSalary()-11000) * 0.1;
            }
        };
        list.add(staff);
    }
}
