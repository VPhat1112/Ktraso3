package com.example.ktso3;

public class NhaVan {
    private String NameNhaVan,Mota,DanhGia;
    private int Images;

    public NhaVan(String nameNhaVan, String mota, String danhGia, int images) {
        NameNhaVan = nameNhaVan;
        Mota = mota;
        DanhGia = danhGia;
        Images = images;
    }

    public String getNameNhaVan() {
        return NameNhaVan;
    }

    public void setNameNhaVan(String nameNhaVan) {
        NameNhaVan = nameNhaVan;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getDanhGia() {
        return DanhGia;
    }

    public void setDanhGia(String danhGia) {
        DanhGia = danhGia;
    }

    public int getImages() {
        return Images;
    }

    public void setImages(int images) {
        Images = images;
    }
}
