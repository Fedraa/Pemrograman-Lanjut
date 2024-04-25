package tugasInheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

        public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
            super(nama, nik, jenisKelamin, menikah);
            this.gaji = gaji;
            this.jumlahAnak = jumlahAnak;
            this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        }

        public void setGaji(double gaji) {
            this.gaji = gaji;
        }

        public double getGaji() {
            return gaji;
        }

        public void setTahunMasuk(LocalDate tahunMasuk) {
            this.tahunMasuk = tahunMasuk;
        }
        
        public LocalDate getTahunMasuk() {
            return tahunMasuk;
        }

        public void setJumlahAnak(int jumlahAnak) {
            this.jumlahAnak = jumlahAnak;
        }
        
        public int getJumlahAnak() {
            return jumlahAnak;
        }

        public double getBonus() {
            double bonus = 0.0;
            int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
            if (lamaBekerja >= 0 && lamaBekerja <= 5) {
                return 0.05 * gaji;
            } else if (lamaBekerja >= 5 && lamaBekerja <= 10) {
                return 0.1 * gaji;
            } else if (lamaBekerja > 10) {
                return 0.15 * gaji;
            }
            return bonus  + (jumlahAnak * 20); 
        }

        public double getPendapatan() {
            return super.getPendapatan() + getGaji() + getBonus() + (getJumlahAnak() * 20);
        }

        public String toString() { 
            String masukBekerja = tahunMasuk.format(DateTimeFormatter.ofPattern("d M yyyy"));
            return super.toString() + String.format("Tahun Masuk\t\t: %s\nJumlah Anak\t\t: %d\nGaji\t\t\t: $%.1f", masukBekerja, jumlahAnak, gaji) + "\n";
        }
}
