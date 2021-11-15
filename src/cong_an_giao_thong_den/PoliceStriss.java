package cong_an_giao_thong_den;

public abstract  class PoliceStriss implements Interface {
    private String bKS;
    private String tenHang;
    private int namSX;
    private String chuSoHuu;

    public PoliceStriss() {
    }

    public PoliceStriss(String bKS, String tenHang, int namSX, String chuSoHuu) {
        this.bKS = bKS;
        this.tenHang = tenHang;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public String getbKS() {
        return bKS;
    }

    public void setbKS(String bKS) {
        this.bKS = bKS;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }
}
