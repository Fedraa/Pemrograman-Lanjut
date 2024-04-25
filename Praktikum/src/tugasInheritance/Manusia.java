package tugasInheritance;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

        public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
            this.nama = nama;
            this.nik = nik;
            this.jenisKelamin = jenisKelamin;
            this.menikah = menikah;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNama() {
            return nama;
        }

        public void setJenisKelamin(boolean jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
        }

        public String getJenisKelamin() {
            return jenisKelamin ? "laki-laki" : "perempuan";
        }

        public void setNik(String nik) {
            this.nik = nik;
        }

        public String getNik() {
            return nik;
        }

        public void setMenikah(boolean menikah) {
            this.menikah = menikah;
        }

        public boolean getMenikah() {
            return menikah;
        }

        public double getTunjangan() {
            if (getMenikah()) {
                return this.jenisKelamin ? 25 : 20;
            } else return 15;
        }

        public double getPendapatan() {
            return getTunjangan();
        }

        @Override
        public String toString() {
            return "Nama\t\t\t: " + getNama() + "\n" +
                    "Jenis Kelamin\t\t: "+ getJenisKelamin() + "\n" +
                    "NIK\t\t\t: " + getNik() + "\n" +
                    "Jumlah Pendapatan\t: $" + getPendapatan() + "\n";
        }
}
