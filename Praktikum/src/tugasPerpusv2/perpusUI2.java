package tugasPerpusv2;
import java.util.*;

public class perpusUI2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        perpusDataBase2 buku = new perpusDataBase2();
        int kategori;
        String menuLain;
        
        do {
            System.out.print(buku.selamatDatang());
            kategori = input.nextInt();
            switch (kategori) {
                case 1:
                    System.out.println( buku.interfaceKategori(buku.daftarBukuTeknologi));
                    break;
                case 2:
                    System.out.println( buku.interfaceKategori(buku.daftarBukuFilsafat));
                    break;
                case 3:
                    System.out.println( buku.interfaceKategori(buku.daftarBukuSejarah));
                    break;
                case 4:
                    System.out.println( buku.interfaceKategori(buku.daftarBukuAgama));
                    break;
                case 5:
                    System.out.println( buku.interfaceKategori(buku.daftarBukuPsikologi));
                    break;
                case 6:
                    System.out.println( buku.interfaceKategori(buku.daftarBukuPolitik));
                    break;
                case 7:
                    System.out.println( buku.interfaceKategori(buku.daftarBukuPolitik));
                    break;
                case 8:
                    System.out.println(buku.inventaris());
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
                    System.out.print("\nApakah Anda ingin memlihat kategori buku atau menu yang lain? (ya/tidak): ");
                    menuLain = input.next();
        } while (menuLain.equalsIgnoreCase("ya"));
            if (menuLain.equalsIgnoreCase("tidak")){
                    System.out.println("\n~~~Terima kasih telah mengunjungi Perpustakaan Amba~~~");
            } 
        input.close();
    }
}
