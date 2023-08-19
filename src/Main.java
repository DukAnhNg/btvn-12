import emtities.Manager;
import emtities.MarketingStaff;
import emtities.Staff;
import view.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Duy", 14000, 1000);
        Manager manager2 = new Manager("Tu", 11000, 1100);
        Manager manager3 = new Manager("Long", 13000, 1100);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Staff> staffs = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>(Arrays.asList(manager, manager2, manager3));
        ArrayList<MarketingStaff> marketingStaffs = new ArrayList<>();


        Menu menu = new Menu();
        menu.displayMenu(scanner,staffs,managers,marketingStaffs);
        // Cách 1
       /* managers.sort(new Comparator<Manager>() {
            @Override
            public int compare(Manager o1, Manager o2) {
                return (int) (o2.caculateSalary() - o1.caculateSalary());
            }
        });
        System.out.println(managers);*/
    }
}

