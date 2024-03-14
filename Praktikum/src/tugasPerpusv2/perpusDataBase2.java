package tugasPerpusv2;

public class perpusDataBase2 {
    public String kategoriBuku;

    public String [][] daftarBukuTeknologi;
    public String [][] daftarBukuFilsafat;
    public String [][] daftarBukuSejarah;
    public String [][] daftarBukuAgama;
    public String [][] daftarBukuPsikologi;
    public String [][] daftarBukuPolitik;
    public String [][] daftarBukuFiksi;

    public perpusDataBase2(){
        kategoriBuku= "";
            daftarBukuTeknologi = new String[][] {
                {"Internet of Things: Konsep dan Aplikasi", "Arif Kurniawan", "Informatika", "2019", "978-602-52592-3-2", "240 halaman", "Rp85.000", "Buku ini menjelaskan konsep dasar Internet of Things dan bagaimana teknologi ini memengaruhi kehidupan sehari-hari."},
                {"Belajar Pemrograman Android untuk Pemula", "Aditya Y. Bhargava", "Elex Media Komputindo", "2018", "978-602-04-1553-6", "368 halaman", "Rp90.000", "Panduan praktis untuk belajar membuat program Android yang dapat dipahami oleh semua kalangan."},
                {"Big Data: Konsep dan Implementasi dengan Apache Hadoop", "Dedy Prasetya", "Dedy Prasetya", "2020", "978-623-01-1494-5", "312 halaman", "Rp100.000", "Buku ini membahas konsep Big Data dan implementasinya menggunakan Apache Hadoop."},
                {"Membangun Aplikasi Web dengan Laravel", "Abdul Kadir", "Penerbit Buku Kompas", "2021", "978-623-03-3485-6", "400 halaman", "Rp120.000", "Lorem ipsum dolor sit sit amet, consectetur adipiscing elit, sed."},
                {"Cyber Security: Teori dan Praktek", "Agus Kurniawan", "PT. Andi Offset", "2017", "978-602-401-047-6", "276 halaman", "Rp95.000", "Buku ini membahas konsep keamanan siber dan pentingnya menjaga keamanan di dunia maya."}
            };
            daftarBukuFilsafat = new String[][] {
                {"Pengantar Filsafat: Sebuah Tinjauan Konseptual", "Jujun S. Suriasumantri", "Pustaka Sinar Harapan", "2008", "978-979-039-490-4", "280 halaman", "Rp75.000", "Ipsum lorem sit dolor sit anit amet, consectetur adipiscing elit sed adil"},
                {"Filsafat Ilmu: Sebuah Pengantar Populer: Konsep dan Aplikasi", "Hasri Ainun Habibie", "Gramedia Pustaka Utama", "2016", "978-602-03-2311-4", "304 halaman", "Rp85.000", "The fox jumped over the lazy dog and lorem ipsum dolor sit amet"},
                {"Filsafat Seni", "John Hospers", "Kanisius", "2010", "978-979-211-295-9", "400 halaman", "Rp95.000", "Buku ini merupakan studi tentang seni, termasuk konsep seperti interpretasi dan bentuk"},
                {"Filsafat Ilmu: Pengetahuan, Metode, dan Etika", "Zainal Abidin Bagir", "PT. Gramedia Pustaka Utama", "2017", "978-602-03-3298-6", "352 halaman", "Rp90.000", "The fox jumped over the lazy dog and beautifel cat lorem ipsum dolor sit amet"},
                {"Filsafat Barat: Dari Prasejarah Hingga Kontemporer", "William L. Reese", "Penerbit Erlangga", "2013", "978-602-771-084-1", "336 halaman", "Rp88.000", "The fox jumped over the lazy dog and bird and chamel lorem ipsum dolor sit amet"}
            };
            daftarBukuSejarah = new String[][] {
                {"Indonesia: Sejarah Perjuangan Bangsa", "M. J. Ricklefs", "Serambi Ilmu Semesta", "2015", "978-979-366-948-0", "672 halaman", "Rp120.000", "Buku ini menjelaskan perjalanan panjang sejarah Indonesia, termasuk perjuangan untuk memerdekakan bangsa dari penjajahan"},
                {"Sejarah Dunia dalam 1000 Kata", "Rupert Matthews", "Penerbit BIP", "2018", "978-602-424-264-8", "160 halaman", "Rp55.000", "Buku ini menjelaskan sejarah panjang dunia yang dikemas dalam seribu kata"},
                {"Sejarah Peradaban Manusia", "Fadlan Mukhtar", "Rajawali Press", "2019", "978-623-7204-51-3", "420 halaman", "Rp105.000", "Buku ini membahas perjalanan panjang peradaban manusia, termasuk perkembangan dan tantangan yang dihadapi"},
                {"Sejarah Kebudayaan Islam", "Husin Umar", "Gema Insani Press", "2016", "978-979-2713-07-5", "358 halaman", "Rp98.000", "Buku ini membahas sejarah kebudayaan Islam, termasuk perkembangan dan kontribusi Islam terhadap peradaban"},
                {"Sejarah Revolusi Indonesia", "Soekarno", "Penerbit Djambatan", "2009", "978-979-428-496-5", "528 halaman", "Rp115.000", "Buku ini menceritakan perjuangan Soekarno, proklamator dan presiden pertama Republik Indonesia, dalam memerdekakan bangsa Indonesia"}
            };
            daftarBukuAgama = new String[][] {
                {"Al-Qur'an dan Terjemahnya", "Tim Penerjemah Departemen Agama RI", "Kementerian Agama RI", "Berbagai edisi", "-", "-", "Rp50.000", "Ini adalah Al-Qur'an beserta terjemahan bahasa indonesia yang diterbitkan oleh Departemen Agama Republik Indonesia."},
                {"Bhagavadgita: Kitab Pesan Ilahi", "Anonim", "Penerbit Kompas", "2013", "978-979-709-887-3", "352 halaman", "Rp75.000", "Sebuah epos Sanskerta penting dalam tradisi Hindu yang menceritakan perjuangan panjang dan perang singkat antara dua sisi keluarga Bharata - Pandava dan Kaurava."},
                {"Tao Te Ching: Kitab Suci Kebijaksanaan", "Laozi", "Gramedia Pustaka Utama", "2018", "978-602-03-6243-8", "192 halaman", "Rp60.000", "Karya filsuf mistik kuno China yang terkenal. Dia dianggap sebagai penulis Tao Te Ching dan secara tradisional dianggap sebagai pendiri Taoisme."},
                {"Menemukan Makna Hidup: Sebuah Pencarian Spiritual", "Maria Ananda", "Gema Pustaka", "2018", "978-9876543210", "250 halaman", "Rp120.000", "Cara menemukan makna hidup melalui pencarian spiritual demi mencapai ketenangan diri"},
                {"Membangun Kehidupan Spiritual yang Kokoh", "John Doe", "Pustaka Hikmah", "2020", "978-1234567890", "200 halaman", "Rp100.000", "Membangun spiritual yang kokoh demi kedamaian hidup dan menjalani kehidupan dengan lebih baik"}
            };
            daftarBukuPsikologi = new String[][] {
                {"Psikologi Abnormal: Konsep dan Aplikasi Modern","David H. Barlow","Erlangga","2019","978-602-471-225-4","400 halaman","Rp150.000", "Membahas konsep psikologi modern dan bagaimana penerapannya dalam kehidupan modern manusia."},
                {"Psikologi Kepribadian: Pendekatan Teori dan Praktik","Brent W. Roberts & Robert C. Lea","Kencana","2020","978-602-421-633-3","350 halaman","Rp135.000", "Psikoogi dalam pendekatan teori dan praktek demi menemukan kepribadian menarik dari masing-masing individu."},
                {"Psikologi Sosial: Teori dan Terapan","Elliot Aronson, Timothy D. Wilson & Robin M. Akert","Salemba Humanika","2018","978-979-065-344-3","380 halaman","Rp145.000", "Menjelaskan kondisi sosial melalui psikologi dengan melihat teori serta penerapannya."},
                {"Psikologi Industri dan Organisasi: Teori dan Praktik","Paul E. Spector","PT RajaGrafindo Persada","2017","978-602-423-350-7","320 halaman","Rp130.000", "Buku ini membahas teori dan praktik psikologi dan organisasi dalam dunia bisnis."},
                {"Psikologi Kognitif: Teori, Penelitian, dan Aplikasi","John R. Anderson","Erlangga","2021","978-602-523-678-1","420 halaman","Rp155.000", "Buku ini membahas teori, penelitian, dan aplikasi psikologi kognitif manusia"}
            };
            daftarBukuPolitik = new String[][] {
                {"Politik Identitas: Konflik dan Dinamika dalam Masyarakat Multikultural","Arief Budiman","Kompas Media Nusantara","2020","978-979-709-510-5","320 halaman","Rp125.000", "Buku ini membahas tentang konflik dan dinamika identitas dalam masyarakat multikultural."},
                {"Politik Global: Dinamika Persaingan Antar Kekuatan Dunia","Joseph S. Nye Jr.","Yayasan Pustaka Obor Indonesia","2019","978-979-461-959-9","280 halaman","Rp135.000", "Politik global dan bagaimana persaingan antar negara dengan kekuatan adidaya berebut kuasa."},
                {"Politik dan Ekonomi: Perspektif Kritis","Noam Chomsky","Mizan Pustaka","2018","978-602-317-506-4","380 halaman","Rp145.000", "Buku ini memberikan perspektif kritis tentang politik dan ekonomi dunia"},
                {"Teori Politik: Konsep Dasar dan Pengembangan Terkini","Andrew Heywood","PT Penerbit Buku Kompas","2021","978-602-322-927-9","420 halaman","Rp150.000", "Buku ini memberikan pengantar tentang studi teori politik kontemporer dunia terkini."},
                {"Politik Hukum: Teori dan Praktik dalam Sistem Peradilan","Keith E. Whittington","Yayasan Pustaka Obor Indonesia","2017","978-979-461-506-5","350 halaman","Rp140.000", "Membedah sisi hukum dalam perpolitikan dan bagaimana teori dan praktiknya dalam sistem peradilan."}
            };
            daftarBukuFiksi = new String[][] {
                {"Pulang","Tere Liye","Gramedia Pustaka Utama","2016","978-602-03-2239-3","400 halaman","Rp85.000", "Kisah Bujang dalam menemukan arti kehidupan dan memaknai kehilangan dalam kehidupannya."},
                {"Laskar Pelangi","Andrea Hirata","Bentang Pustaka","2005","978-979-1227-08-7","368 halaman","Rp95.000", "Kisah 10 anak yang berjuang untuk melanjutkan kehidupan sekolah mereka yang berlokas di Belitong."},
                {"Perahu Kertas","Dee Lestari","Bentang Pustaka","2009","978-979-1227-09-4","400 halaman","Rp90.000", "Kisah Kugy, seorang gadis yang gemar berkhayal dan menulis dongen dalam kesehariannya."},
                {"Sang Pemimpi","Andrea Hirata","Bentang Pustaka","2006","978-979-1227-04-9","360 halaman","Rp100.000", "Kisah petualangan masa remaja tiga orang pemuda, yaitu Arai, Ikal, dan Jimbron."},
                {"5 cm","Donny Dhirgantoro","Grasindo","2011","978-979-22-7192-3","326 halaman","Rp88.000", "Kisah persahabatan lima anak muda dan perjuangan mereka meraih impian dan mendaki gunung bersama."}
            };       
    } 
    String inventaris (){
        String dataInventaris = "";
        System.out.println();
        System.out.println(
            "     Data Inventaris     "
            + "\n~~~~Perpustakaan Amba~~~~"
            + "\n\nJumlah kategori Buku: 7 kategori {Teknologi, Filsafat, Sejarah, Agama, Psikologi, Politik, Fiksi}"
            + "\nJumlah buku per-kategori: 5 buku"
            + "\nJumlah keseluruhan buku di perpustakaan: 35 Buku "
        );
        return dataInventaris;
    }
    String selamatDatang (){
        String welcome = "";
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
        System.out.print("Masukkan nomor menu yang Anda inginkan: "
        );
        return welcome;
    }

    public String interfaceKategori (String[][] buku) {
        String result = "";
        for (int i = 1; i <= 5; i++) {
            result += "\nBuku ke-" + i;
            result +=
             "\n\nJudul Buku: " + buku[i - 1][0] 
                    + "\nPenulis: " + buku[i - 1][1]
                    + "\nPenerbit: " + buku[i - 1][2]
                    + "\nTahun Terbit: " + buku[i - 1][3]
                    + "\nISBN: " + buku[i - 1][4]
                    + "\nJumlah Halaman: " + buku[i-1][5]
                    + "\nHarga: " + buku[i-1][6]
                    + "\nSinopsis: " + buku[i-1][7]
                    + "\nJumlah kata dalam sinopsis: " + hitungSinopsis(buku[i-1][7]) + " kata" + "\n";
        }
        return result;
    }
    public int hitungSinopsis(String sinopsis){
        String[] kataSinopsis = sinopsis.split(" ");
        return kataSinopsis.length;
    }
}

