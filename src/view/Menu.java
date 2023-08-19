package view;

import emtities.Manager;
import emtities.MarketingStaff;
import emtities.Staff;
import service.ManagerServiceImpl;
import service.MarketingStaffServiceImpl;
import service.StaffServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public void mainMenu(){
        System.out.println("1.Thêm nhân sự");
        System.out.println("2.Xuất danh sách ");
        System.out.println("3.Tìm kiếm");
        System.out.println("4.Chỉnh sửa");
        System.out.println("5.Xuất 5 nhân viên có thu nhập cao nhất ");
        System.out.println("Mời bạn chọn");
    }
    public void menuAdd(){
        System.out.println("1.Thêm nhân viên hành chính");
        System.out.println("2.Thêm trưởng phòng");
        System.out.println("3.Thêm nhân viên tiếp thị");
        System.out.println("0.Quay trở lại");
    }
    public void displayMenu(Scanner scanner, ArrayList<Staff> staffs, ArrayList<Manager> managers,ArrayList<MarketingStaff>marketingStaffs ){
        mainMenu();
        do{
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    menuAdd();
                    int choose1= Integer.parseInt(scanner.nextLine());
                        if (choose1==1){
                            StaffServiceImpl staffService = new StaffServiceImpl();
                            staffService.insert(scanner, staffs);
                            mainMenu();
                            break;
                        }else if (choose1==2){
                            ManagerServiceImpl managerService = new ManagerServiceImpl();
                            managerService.insert(scanner, managers);
                            mainMenu();
                            break;
                        }else  if (choose1==3){
                            MarketingStaffServiceImpl marketingStaffService = new MarketingStaffServiceImpl();
                            marketingStaffService.insert(scanner, marketingStaffs);
                            mainMenu();
                        }else if (choose1==0) {
                            mainMenu();
                            break;
                        }
                    break;
                case 2:
                    System.out.println(staffs);
                    System.out.println(managers);
                    System.out.println(marketingStaffs);
                    mainMenu();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(true);


    }
}
