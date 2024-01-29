package model;

public class Tktk extends TaiKhoanNganHang{
    private String sotiengui;
    private String ngaygui;
    private String lai;
    private String kihan;

    @Override
    public String toString() {
        return super.toString()+"Tktk{" +
                "sotiengui='" + sotiengui + '\'' +
                ", ngaygui='" + ngaygui + '\'' +
                ", lai='" + lai + '\'' +
                ", kihan='" + kihan + '\'' +
                '}';
    }

    public Tktk() {
    }

    public Tktk(String id, String ma, String ten, String ngaytaotk, String sotiengui, String ngaygui, String lai, String kihan) {
        super(id, ma, ten, ngaytaotk);
        this.sotiengui = sotiengui;
        this.ngaygui = ngaygui;
        this.lai = lai;
        this.kihan = kihan;
    }

    public String getSotiengui() {
        return sotiengui;
    }

    public void setSotiengui(String sotiengui) {
        this.sotiengui = sotiengui;
    }

    public String getNgaygui() {
        return ngaygui;
    }

    public void setNgaygui(String ngaygui) {
        this.ngaygui = ngaygui;
    }

    public String getLai() {
        return lai;
    }

    public void setLai(String lai) {
        this.lai = lai;
    }

    public String getKihan() {
        return kihan;
    }

    public void setKihan(String kihan) {
        this.kihan = kihan;
    }
}
