package com.minishop.entity;

/**
 * @author ToiTd
 */
public class GiamDoc extends NhanVien {
    private String chucVu;

    public  GiamDoc(){

    }
    public GiamDoc(String chucVu) {
        this.chucVu = chucVu;
    }

    public GiamDoc(String tenNhanVien, String diaChi, int tuoi, String chucVu) {
        super(tenNhanVien, diaChi, tuoi);
        this.chucVu = chucVu;
    }

    public GiamDoc(String tenNhanVien, String diaChi, String chucVu) {
        super(tenNhanVien, diaChi);
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
