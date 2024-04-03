package com.example.tugasday06;

public class KosmetikModel {
    private String namaKosmetik;
    private String jenisKosmetik;
    private String hargaKosmetik;
    private String deskripsiKosmetik;
    private int fotoKosmetik;

    public KosmetikModel(String namaKosmetik, String jenisKosmetik, String hargaKosmetik, String deskripsiKosmetik, int fotoKosmetik) {
        this.namaKosmetik = namaKosmetik;
        this.jenisKosmetik = jenisKosmetik;
        this.hargaKosmetik = hargaKosmetik;
        this.deskripsiKosmetik = deskripsiKosmetik;
        this.fotoKosmetik = fotoKosmetik;
    }

    public String getNamaKosmetik() {

        return namaKosmetik;
    }

    public void setNamaKosmetik(String namaKosmetik) {

        this.namaKosmetik = namaKosmetik;
    }

    public String getJenisKosmetik() {

        return jenisKosmetik;
    }

    public void setJenisKosmetik(String jenisKosmetik) {

        this.jenisKosmetik = jenisKosmetik;
    }

    public String getHargaKosmetik() {

        return hargaKosmetik;
    }

    public void setHargaKosmetik(String hargaKosmetik) {

        this.hargaKosmetik = hargaKosmetik;
    }

    public String getDeskripsiKosmetik() {

        return deskripsiKosmetik;
    }

    public void setDeskripsiKosmetik(String deskripsiKosmetik) {

        this.deskripsiKosmetik = deskripsiKosmetik;
    }

    public int getFotoKosmetik() {

        return fotoKosmetik;
    }

    public void setFotoKosmetik(int fotoKosmetik) {

        this.fotoKosmetik = fotoKosmetik;
    }
}
