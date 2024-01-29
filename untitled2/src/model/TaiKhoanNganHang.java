package model;

public abstract class TaiKhoanNganHang {
    private String id;
    private String ma;
    private String ten;
    private String ngaytaotk;

    public TaiKhoanNganHang() {
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "id='" + id + '\'' +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaytaotk='" + ngaytaotk + '\'' +
                '}';
    }

    public TaiKhoanNganHang(String id, String ma, String ten, String ngaytaotk) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngaytaotk = ngaytaotk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaytaotk() {
        return ngaytaotk;
    }

    public void setNgaytaotk(String ngaytaotk) {
        this.ngaytaotk = ngaytaotk;
    }

}
