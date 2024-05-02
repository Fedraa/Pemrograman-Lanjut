package tugasPolimorfisme;

import java.text.DecimalFormat;

public class KueMain{
    public static void main(String[] args) {
        Kue[] jenisKue = new Kue[20];

        double totalHargaSemuaKue = 0;
        double totalHargaKueJadi = 0;
        double totalHargaKuePesanan = 0;
        double totalJumlahKueJadi = 0;
        double totalBeratKuePesanan = 0; 

        jenisKue[0] = new KueJadi("Bolu Pelangi", 3000, 2);
        jenisKue[1] = new KueJadi("Pisang Goreng", 5000, 3);
        jenisKue[2] = new KueJadi("Mantang Goreng", 3000, 2);
        jenisKue[3] = new KueJadi("Singkong Goreng", 4000, 3);
        jenisKue[4] = new KueJadi("Pancong", 4000, 3);
        jenisKue[5] = new KueJadi("Risoles", 5000, 3);
        jenisKue[6] = new KueJadi("Kroket", 6000,2);
        jenisKue[7] = new KueJadi("Bakwan", 5000, 2);
        jenisKue[8] = new KueJadi("Tahu Goreng", 4000, 2);
        jenisKue[9] = new KueJadi("Tempe Goreng", 5000, 2);
        jenisKue[10] = new KuePesanan("Cookies",10000, 10);
        jenisKue[11] = new KuePesanan("Soes Coklat", 15000, 25);
        jenisKue[12] = new KuePesanan("Putri Salju", 20000, 10);
        jenisKue[13] = new KuePesanan("Nastar", 3500, 10);
        jenisKue[14] = new KuePesanan("Kue Puppies", 20000, 20);
        jenisKue[15] = new KuePesanan("Kue Kacang", 25000, 10);
        jenisKue[16] = new KuePesanan("Kue Keju", 10000, 20);
        jenisKue[17] = new KuePesanan("Brownies", 25000, 15);
        jenisKue[18] = new KuePesanan("Engkak", 20000, 10);
        jenisKue[19] = new KuePesanan("Lapis Legit", 30000, 20);

        for (int i = 0; i < jenisKue.length; i++) {
            System.out.println(jenisKue[i].toString());
        }

        for (int i = 0; i < jenisKue.length; i++) {
            if (jenisKue[i] != null) {
                totalHargaSemuaKue += jenisKue[i].hitungHarga();
            }    
        } 
        
        DecimalFormat formatRupiah1 = new DecimalFormat("Rp#,###.00");
        String formatTotalHargaSemuaKue = formatRupiah1.format(totalHargaSemuaKue);

        System.out.println("Total harga semua kue\t: " + formatTotalHargaSemuaKue);

        for (int i = 0; i < jenisKue.length; i++) {
            if (jenisKue[i] instanceof KueJadi) {
                totalHargaKueJadi += jenisKue[i].hitungHarga();
                totalJumlahKueJadi += ((KueJadi)jenisKue[i]).getJumlah();
            } else if (jenisKue[i] instanceof KuePesanan) {
                totalHargaKuePesanan += jenisKue[i].hitungHarga();
                totalBeratKuePesanan += ((KuePesanan)jenisKue[i]).getBerat();
            }
        }

        DecimalFormat formatRupiah2 = new DecimalFormat("Rp#,###.00");
        String formatTotalHargaKueJadi = formatRupiah2.format(totalHargaKueJadi);
        String formatTotalHargaKuePesanan = formatRupiah2.format(totalHargaKuePesanan);

        System.out.println(
            "\nTotal harga kue jadi\t: " + formatTotalHargaKueJadi
            + "\nTotal jumlah kue jadi\t: " + totalJumlahKueJadi + " pcs"
            + "\n\nTotal harga kue pesanan\t: " + formatTotalHargaKuePesanan 
            +  "\nTotal berat kue pesanan\t: " + totalBeratKuePesanan + " gram");

        Kue kueHargaTerbesar = jenisKue[0];
        for (int i = 1; i < jenisKue.length; i++) {
            if (jenisKue[i] != null && jenisKue[i].hitungHarga() > kueHargaTerbesar.hitungHarga()) {
                kueHargaTerbesar = jenisKue[i];
            }
        }

        System.out.println("\nKue dengan harga terbesar\n" + kueHargaTerbesar.toString());
    }
}
