package repository;

import model.Tktt;
import util.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TkttRepository implements IRepoTktt {
    private static final String SRC_Tktt="D:\\CODEGYM\\C0823L1-JV105_PhamQuocHuy\\module 2\\module-2-codegym\\untitled2\\src\\data\\data.csv";
    private Scanner scanner = new Scanner(System.in);
    private ReadWriteFile readWriteFile=new ReadWriteFile();
    @Override
    public void add(Tktt tktt) {
        readWriteFile.writeFileObject(SRC_Tktt,tktt,true);
    }

    @Override
    public void delete(String e) {
        List<Tktt> tkttList = getAll();
        for (Tktt tktt : tkttList) {
            if (tktt.getMa().equals(e)) {
                System.out.println("\tBan co chac muon xoa: \n" +
                        "\t1.Xoa\n" +
                        "\t2.Huy bo\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        tkttList.remove(tktt);
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
        readWriteFile.writeFileTktt(SRC_Tktt, tkttList, false);
    }

    @Override
    public void search(String name) {
        List<Tktt> tkttList = getAll();
        Tktt temp = new Tktt();
        boolean flag = false;
        for (Tktt tktt : tkttList) {
            if (tktt.getTen().equals(name)) {
                temp = tktt;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Thong tin cua "+ name +"la: ");
            System.out.println(temp.toString());
        } else  {
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public List<Tktt> getAll() {
        List<Tktt> lists = new ArrayList<>();
        List<String> strings = readWriteFile.readFile(SRC_Tktt);
        for (String str : strings) {
            String[] temp = str.split(",");
            if(temp.length==6){
                lists.add(new Tktt(temp[0], temp[1], temp[2], temp[3],temp[4],temp[5]));
            }

        }
        return lists;
    }
}
