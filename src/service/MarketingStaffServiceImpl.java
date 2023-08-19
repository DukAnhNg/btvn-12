package service;

import emtities.Manager;
import emtities.MarketingStaff;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketingStaffServiceImpl implements IManaging<MarketingStaff>{
    @Override
    public void insert(Scanner scanner, ArrayList<MarketingStaff> list) {
        System.out.println("Mời nhập tên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập lương");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhậ doanh số");
        double kpi = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập tỉ lệ hoa hồng");
        double bonusPercent = Double.parseDouble(scanner.nextLine());
        MarketingStaff marketingStaff = new MarketingStaff(name,salary,bonusPercent,kpi);
        list.add(marketingStaff);
    }

}
