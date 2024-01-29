package service;

import model.Tktk;
import model.Tktt;
import repository.TkttRepository;

import java.util.List;
import java.util.Scanner;
public class TkttService implements IServiceTktt {
    private TkttRepository tkttRepository = new TkttRepository();
    private Scanner scanner = new Scanner(System.in);

    public Tktt nhap() {
        Tktt tktt = new Tktt();
        System.out.println("Nhap id: ");
        tktt.setId(scanner.nextLine());
        System.out.println("Nhap ma: ");
        tktt.setMa(scanner.nextLine());
        System.out.println("Nhap ten: ");
        tktt.setTen(scanner.nextLine());
        System.out.println("Nhap Ngay tao tk: ");
        tktt.setNgaytaotk(scanner.nextLine());
        System.out.println("Nhap So the: ");
        tktt.setSothe(scanner.nextLine());
        System.out.println("Nhap so tien: ");
        tktt.setSotien(scanner.nextLine());
        return tktt;
    }

    public void add() {
        Tktt tktt = nhap();
        tkttRepository.add(tktt);
        System.out.println("Them thanh cong ");
        System.out.println("-------------------------------------------");
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma can xoa: ");
        String id = scanner.nextLine();
        tkttRepository.delete(id);
    }

    public void search() {
        System.out.println("Nhap ten can tim : ");
        String name = scanner.nextLine();
        tkttRepository.search(name);
    }
    public void display() {
        List<Tktt> tkttList = tkttRepository.getAll();
        for (Tktt tktt : tkttList) {
            System.out.println(tktt);
        }
    }
    public static void main(String[] args) {
        TkttService tkttService=new TkttService();
        tkttService.nhap();
    }
}
