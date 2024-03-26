package com.example.viewlist;

public class Item {
    String name, nim, kelas, jeniskelamin;
    int image;

    public Item(String name, String nim,String kelas, String jeniskelamin, int image) {
        this.name = name;
        this.nim = nim;
        this.image = image;
        this.kelas = kelas;
        this.jeniskelamin = jeniskelamin;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }


    public void setKelas (String tanggalLahir) {
        this.kelas= tanggalLahir;
    }


    public String getJeniskelamin() {
        return jeniskelamin;
    }


    public void setJeniskelamin (String jeniskelamin) {
        this.jeniskelamin= jeniskelamin;
    }


}


