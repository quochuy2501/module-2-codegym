package model;

public class Tktt extends TaiKhoanNganHang {
    private String Sothe;
    private String sotien;

    @Override
    public String toString() {
        return super.toString()+"tktt{" +
                "Sothe='" + Sothe + '\'' +
                ", sotien='" + sotien + '\'' +
                '}';
    }

    public Tktt() {
    }

    public Tktt(String id, String ma, String ten, String ngaytaotk, String sothe, String sotien) {
        super(id, ma, ten, ngaytaotk);
        this.Sothe = sothe;
        this.sotien = sotien;
    }

    public String getSothe() {
        return Sothe;
    }

    public void setSothe(String sothe) {
        Sothe = sothe;
    }

    public String getSotien() {
        return sotien;
    }

    public void setSotien(String sotien) {
        this.sotien = sotien;
    }
}
