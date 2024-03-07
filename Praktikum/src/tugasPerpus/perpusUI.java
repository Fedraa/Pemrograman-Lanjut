package tugasPerpus;
import java.util.*;

public class perpusUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        perpusDataBase buku = new perpusDataBase();
        int kategori;
        String menuLain;

        do {
            System.out.println();
            System.out.println(
                "     Selamat datang di     "
                + "\n~~~~~Perpustakaan Amba~~~~~"
                + "\n\nBerikut daftar kategori buku yang terdapat di Perpustakaan Amba"
                + "\n\n1. Teknologi"
                + "\n2. Filsafat"
                + "\n3. Sejarah" 
                + "\n4. Agama" 
                + "\n5. Psikologi" 
                + "\n6. Politik"
                + "\n7. Fiksi"
                + "\n\nAnda dapat memasukkan kategori buku yang anda inginkan sesuai dengan angka yang tertera"
                + "\natau Anda dapat melihat data inventaris Perpustakaan Amba dengan memasukkan angka:"
                + "\n8. Tampilkan inventaris perpustakaan\n");
            System.out.print("Masukkan nomor menu yang Anda inginkan: ");
            kategori = input.nextInt();
            switch (kategori) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("\nBuku ke-" + i);
                        System.out.println(
                        "\nJudul Buku: " + buku.daftarBukuTeknologi[i - 1][0] 
                        + "\nPenulis: " + buku.daftarBukuTeknologi[i - 1][1]
                        + "\nPenerbit: " + buku.daftarBukuTeknologi[i - 1][2]
                        + "\nTahun Terbit: " + buku.daftarBukuTeknologi[i - 1][3]
                        + "\nISBN: " + buku.daftarBukuTeknologi[i - 1][4]
                        + "\nJumlah Halaman: " + buku.daftarBukuTeknologi[i-1][5]
                        + "\nHarga: " + buku.daftarBukuTeknologi[i-1][6]);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("\nBuku ke-" + i);
                        System.out.println(
                        "\nJudul Buku: " + buku.daftarBukuFilsafat[i - 1][0] 
                        + "\nPenulis: " + buku.daftarBukuFilsafat[i - 1][1]
                        + "\nPenerbit: " + buku.daftarBukuFilsafat[i - 1][2]
                        + "\nTahun Terbit: " + buku.daftarBukuFilsafat[i - 1][3]
                        + "\nISBN: " + buku.daftarBukuFilsafat[i - 1][4]
                        + "\nJumlah Halaman: " + buku.daftarBukuFilsafat[i-1][5]
                        + "\nHarga: " + buku.daftarBukuFilsafat[i-1][6]);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("\nBuku ke-" + i);
                        System.out.println(
                            "\nJudul Buku: " + buku.daftarBukuSejarah[i - 1][0] 
                            + "\nPenulis: " + buku.daftarBukuSejarah[i - 1][1]
                            + "\nPenerbit: " + buku.daftarBukuSejarah[i - 1][2]
                            + "\nTahun Terbit: " + buku.daftarBukuSejarah[i - 1][3]
                            + "\nISBN: " + buku.daftarBukuSejarah[i - 1][4]
                            + "\nJumlah Halaman: " + buku.daftarBukuSejarah[i-1][5]
                            + "\nHarga: " + buku.daftarBukuSejarah[i-1][6]);
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("\nBuku ke-" + i);
                        System.out.println(
                            "\nJudul Buku: " + buku.daftarBukuAgama[i - 1][0] 
                            + "\nPenulis: " + buku.daftarBukuAgama[i - 1][1]
                            + "\nPenerbit: " + buku.daftarBukuAgama[i - 1][2]
                            + "\nTahun Terbit: " + buku.daftarBukuAgama[i - 1][3]
                            + "\nISBN: " + buku.daftarBukuAgama[i - 1][4]
                            + "\nJumlah Halaman: " + buku.daftarBukuAgama[i-1][5]
                            + "\nHarga: " + buku.daftarBukuAgama[i-1][6]);
                    }
                    break;
                case 5:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("\nBuku ke-" + i);
                        System.out.println(
                            "\nJudul Buku: " + buku.daftarBukuPsikologi[i - 1][0] 
                            + "\nPenulis: " + buku.daftarBukuPsikologi[i - 1][1]
                            + "\nPenerbit: " + buku.daftarBukuPsikologi[i - 1][2]
                            + "\nTahun Terbit: " + buku.daftarBukuPsikologi[i - 1][3]
                            + "\nISBN: " + buku.daftarBukuPsikologi[i - 1][4]
                            + "\nJumlah Halaman: " + buku.daftarBukuPsikologi[i-1][5]
                            + "\nHarga: " + buku.daftarBukuPsikologi[i-1][6]);
                    }
                    break;
                case 6:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("\nBuku ke-" + i);
                        System.out.println(
                            "\nJudul Buku: " + buku.daftarBukuPolitik[i - 1][0] 
                            + "\nPenulis: " + buku.daftarBukuPolitik[i - 1][1]
                            + "\nPenerbit: " + buku.daftarBukuPolitik[i - 1][2]
                            + "\nTahun Terbit: " + buku.daftarBukuPolitik[i - 1][3]
                            + "\nISBN: " + buku.daftarBukuPolitik[i - 1][4]
                            + "\nJumlah Halaman: " + buku.daftarBukuPolitik[i-1][5]
                            + "\nHarga: " + buku.daftarBukuPolitik[i-1][6]);
                    }
                    break;
                case 7:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("\nBuku ke-" + i);
                        System.out.println(
                            "\nJudul Buku: " + buku.daftarBukuFiksi[i - 1][0] 
                            + "\nPenulis: " + buku.daftarBukuFiksi[i - 1][1]
                            + "\nPenerbit: " + buku.daftarBukuFiksi[i - 1][2]
                            + "\nTahun Terbit: " + buku.daftarBukuFiksi[i - 1][3]
                            + "\nISBN: " + buku.daftarBukuFiksi[i - 1][4]
                            + "\nJumlah Halaman: " + buku.daftarBukuFiksi[i-1][5]
                            + "\nHarga: " + buku.daftarBukuFiksi[i-1][6]);
                    }
                    break;
                case 8:
                    System.out.println(
                        "     Data Inventaris     "
                        + "\n~~~~Perpustakaan Amba~~~~"
                        + "\n\nJumlah kategori Buku: 7 kategori {Teknologi, Filsafat, Sejarah, Agama, Psikologi, Politik, Fiksi}"
                        + "\nJumlah buku per-kategori: 5 buku"
                        + "\nJumlah keseluruhan buku di perpustakaan: 35 Buku "
                    );
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


