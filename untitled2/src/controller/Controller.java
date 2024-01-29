package controller;

import service.TkttService;
import service.TktkService;

import java.util.Scanner;
public class Controller {
    private TktkService tktkService = new TktkService();
    private TkttService tkttService = new TkttService();
    private Scanner scanner = new Scanner(System.in);

    public void menuTktt() {
        while(true){
            System.out.println("\t1.Them moi tktt\n" +
                    "\t2.Xoa tktt\n" +
                    "\t3.Xem danh sach tktt\n" +
                    "\t4.Tim kiem tktt\n" +
                    "\t5.Thoat\n" +
                    "\tChon chuc nang");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    tkttService.add();
                    break;
                case 2:
                    tkttService.delete();
                    break;
                case 3:
                    tkttService.display();
                    break;
                case 4:
                    tkttService.search();
                    break;
                case 5:
                    mucLuc();
                    break;
            }
        }


    }
    public void mucLuc() {
        while(true){
            System.out.println("====================================================");
            System.out.println("=========CHUONG TRINH QUAN LY TAI KHOAN NGAN HANG=============");
            System.out.println("\t1.Them moi tktk\n" +
                    "\t2.Xoa tktk\n" +
                    "\t3.Xem danh sach tktk\n" +
                    "\t4.Tim kiem tktk\n" +
                    "\tChon chuc nang");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    tktkService.add();
                    break;
                case 2:
                    tktkService.delete();
                    break;
                case 3:
                    tktkService.display();
                    break;
                case 4:
                    tktkService.search();
                    break;
                case 5:
                    break;
            }
        }
    }
}
