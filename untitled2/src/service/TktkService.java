package service;

import model.Tktk;
import repository.TktkRepository;

import java.util.List;
import java.util.Scanner;
public class TktkService implements IServiceTktk {
    private TktkRepository tktkRepository = new TktkRepository();
    private Scanner scanner = new Scanner(System.in);

    public Tktk nhap() {
        Tktk tktk = new Tktk();
        System.out.println("Nhap id: ");
        tktk.setId(scanner.nextLine());
        System.out.println("Nhap ma: ");
        tktk.setMa(scanner.nextLine());
        System.out.println("Nhap ten: ");
        tktk.setTen(scanner.nextLine());
        System.out.println("Nhap Ngay tao tk: ");
        tktk.setNgaytaotk(scanner.nextLine());
        System.out.println("Nhap So tien gui: ");
        tktk.setSotiengui(scanner.nextLine());
        System.out.println("Nhap so ngay gui: ");
        tktk.setNgaygui(scanner.nextLine());
        System.out.println("Nhap so lai: ");
        tktk.setLai(scanner.nextLine());
        System.out.println("Nhap ki han: ");
        tktk.setKihan(scanner.nextLine());
        return tktk;
    }

    public void add() {
        Tktk tktk = nhap();
        tktkRepository.add(tktk);
        System.out.println("Them thanh cong ");
        System.out.println("-------------------------------------------");
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma can xoa: ");
        String id = scanner.nextLine();
        tktkRepository.delete(id);
    }

    public void search() {
        System.out.println("Nhap ten can tim : ");
        String name = scanner.nextLine();
        tktkRepository.search(name);
    }
    public void display() {
        List<Tktk> tktkList = tktkRepository.getAll();
        for (Tktk tktk : tktkList) {
            System.out.println(tktk);
        }
    }
    public static void main(String[] args) {
        TktkService tktkService=new TktkService();
        tktkService.nhap();
    }
}
