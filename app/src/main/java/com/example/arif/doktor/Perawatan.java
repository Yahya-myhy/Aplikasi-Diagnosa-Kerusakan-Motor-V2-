package com.example.arif.doktor;

public class Perawatan {

    private String id;
    private String platNomor;
    private String merkMotor;
    private String namapemilikMotor;
    private String jenisperawatan;

    public Perawatan(String id, String platNomor, String merkMotor, String namapemilikMotor, String jenisperawatan) {
        this.id = id;
        this.platNomor = platNomor;
        this.merkMotor = merkMotor;
        this.namapemilikMotor = namapemilikMotor;
        this.jenisperawatan = jenisperawatan;
    }

    public Perawatan(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }

    public String getNamapemilikMotor() {
        return namapemilikMotor;
    }

    public void setNamapemilikMotor(String namapemilikMotor) {
        this.namapemilikMotor = namapemilikMotor;
    }

    public String getJenisperawatan() {
        return jenisperawatan;
    }

    public void setJenisperawatan(String jenisperawatan) {
        this.jenisperawatan = jenisperawatan;
    }
}
