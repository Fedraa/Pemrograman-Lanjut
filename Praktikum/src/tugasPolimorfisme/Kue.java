package tugasPolimorfisme;

import java.text.DecimalFormat;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        DecimalFormat formatRupiah = new DecimalFormat("Rp#,###.00");
        String formatHarga = formatRupiah.format(hitungHarga());
        return "Nama\t\t: " + nama + "\nHarga\t\t: " + formatHarga;
    }
}
