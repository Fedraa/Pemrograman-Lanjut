package tugasPerpus;
import java.util.*;
public class perpusUI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        perpusDataBase buku = new perpusDataBase();
        int pilihan;
        String jawaban;
do {
    System.out.println("\n========[Perpustakaan]========");
    System.out.println("1. teknologi" + "\n2. daftarBukuFilsafat" + "\n3. Sejarah" + "\n4. Agama" 
    + "\n5. Psikologi" + "\n6. Politik" + "\n7. Fiksi" + "\n8. Tampilkan total buku yang tersedia"
    + "\n9. Keluar dari program");
    System.out.print("Pilihan Anda: ");
    pilihan = scn.nextInt();
    switch (pilihan) {
        case 1:
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nBuku ke-" + i);
                System.out.println(
                "\nJudul Buku: " + buku.daftarBukuTeknologi[i - 1][0] 
                + "\nPenulis: " + buku.daftarBukuTeknologi[i - 1][1]
                + "\nPenerbit: " + buku.daftarBukuTeknologi[i - 1][2]
                + "\nTahun Terbit: " + buku.daftarBukuTeknologi[i - 1][3]
                + "\nISBN: " + buku.daftarBukuTeknologi[i - 1][4]
                + "\nJumlah Halaman: " +buku.daftarBukuTeknologi[i-1][5]
                + "\nHarga: " +buku.daftarBukuTeknologi[i-1][6]);
            }
            break;
        case 2:
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nBuku ke-" + i);
                System.out.println("1. Nama Buku: " + buku.daftarBukuFilsafat[i - 1][0] 
                + "\n2. Penulis: " + buku.daftarBukuFilsafat[i - 1][1]
                + "\n3. Jumlah Halaman: " + buku.daftarBukuFilsafat[i - 1][2]
                + "\n4. Tahun Terbit: " + buku.daftarBukuFilsafat[i - 1][3]
                + "\n5. Penerbit: " + buku.daftarBukuFilsafat[i - 1][4]);
            }
            break;
        case 3:
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nBuku ke-" + i);
                System.out.println("1. Nama Buku: " + buku.daftarBukuSejarah[i - 1][0] 
                + "\n2. Penulis: " + buku.daftarBukuSejarah[i - 1][1]
                + "\n3. Jumlah Halaman: " + buku.daftarBukuSejarah[i - 1][2]
                + "\n4. Tahun Terbit: " + buku.daftarBukuSejarah[i - 1][3]
                + "\n5. Penerbit: " + buku.daftarBukuSejarah[i - 1][4]);
            }
            break;
        case 4:
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nBuku ke-" + i);
                System.out.println("1. Nama Buku: " + buku.agama[i - 1][0] 
                + "\n2. Penulis: " + buku.agama[i - 1][1]
                + "\n3. Jumlah Halaman: " + buku.agama[i - 1][2]
                + "\n4. Tahun Terbit: " + buku.agama[i - 1][3]
                + "\n5. Penerbit: " + buku.agama[i - 1][4]);
            }
            break;
        case 5:
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nBuku ke-" + i);
                System.out.println("1. Nama Buku: " + buku.psikologi[i - 1][0] 
                + "\n2. Penulis: " + buku.psikologi[i - 1][1]
                + "\n3. Jumlah Halaman: " + buku.psikologi[i - 1][2]
                + "\n4. Tahun Terbit: " + buku.psikologi[i - 1][3]
                + "\n5. Penerbit: " + buku.psikologi[i - 1][4]);
            }
            break;
        case 6:
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nBuku ke-" + i);
                System.out.println("1. Nama Buku: " + buku.politik[i - 1][0] 
                + "\n2. Penulis: " + buku.politik[i - 1][1]
                + "\n3. Jumlah Halaman: " + buku.politik[i - 1][2]
                + "\n4. Tahun Terbit: " + buku.politik[i - 1][3]
                + "\n5. Penerbit: " + buku.politik[i - 1][4]);
            }
            break;
        case 7:
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nBuku ke-" + i);
                System.out.println("1. Nama Buku: " + buku.fiksi[i - 1][0] 
                + "\n2. Penulis: " + buku.fiksi[i - 1][1]
                + "\n3. Jumlah Halaman: " + buku.fiksi[i - 1][2]
                + "\n4. Tahun Terbit: " + buku.fiksi[i - 1][3]
                + "\n5. Penerbit: " + buku.fiksi[i - 1][4]);
            }
            break;
        default:
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            break;
    }
            System.out.print("Apakah Anda ingin meminjam buku lain? (y/n): ");
            jawaban = scn.next();
        } while (jawaban.equals("y")); // perbaikan di sini
    }
}


