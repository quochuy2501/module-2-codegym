package repository;

import model.Tktk;
import util.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TktkRepository implements IRepoTktk{
    private static final String SRC_Tktk="D:\\CODEGYM\\C0823L1-JV105_PhamQuocHuy\\module 2\\module-2-codegym\\untitled2\\src\\data\\data.csv";
    private Scanner scanner= new Scanner(System.in);
    private ReadWriteFile readWriteFile=new ReadWriteFile();
    @Override
    public void add(Tktk tktk) {
        readWriteFile.writeFileObject(SRC_Tktk,tktk,true);
    }

    @Override
    public void delete(String e) {
        List<Tktk> tktkList = getAll();
        for (Tktk tktk : tktkList) {
            if (tktk.getMa().equals(e)) {
                System.out.println("\tBan co chac muon xoa: \n" +
                        "\t1.Xoa\n" +
                        "\t2.Huy bo\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        tktkList.remove(tktk);
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
        readWriteFile.writeFileTktk(SRC_Tktk,tktkList,false);
    }

    @Override
    public void search(String e) {
        List<Tktk> tktkList = getAll();
        Tktk temp = new Tktk();
        boolean flag = false;
        for (Tktk tktk : tktkList) {
            if (tktk.getTen().equals(e)) {
                temp = tktk;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Thong tin cua "+ e+"la: ");
            System.out.println(temp.toString());
        } else {
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public List<Tktk> getAll() {
        List<Tktk> lists = new ArrayList<>();
        List<String> strings = readWriteFile.readFile(SRC_Tktk);
        for (String str : strings) {
            String[] temp = str.split(",");
            if(temp.length==8) {
                lists.add(new Tktk(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]));
            }
        }
        return lists;
    }
}
