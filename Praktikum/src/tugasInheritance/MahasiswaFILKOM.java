package tugasInheritance;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

        public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
            super(nama, nik, jenisKelamin, menikah);
            this.nim = nim;
            this.ipk = ipk;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getNim() {
            return nim;
        }

        public void setIpk(double ipk) {
            this.ipk = ipk;
        }

        public double getIpk() {
            return ipk;
        }

        public String getStatus() {
            String programStudi = "";
            switch (nim.substring(6, 7)) {
                case "2":
                    programStudi = "Teknik Informatika";
                    break;

                case "3":
                    programStudi = "Teknik Komputer";
                    break;

                case "4":
                    programStudi = "Sistem Informasi";
                    break;

                case "6":
                    programStudi = "Pendidikan Teknologi Informasi";
                    break;

                case "7":
                    programStudi = "Teknologi Informasi";
                    break;

                default:
                    break;
            }
            
            return programStudi + ", 20" + nim.substring(0, 2);
        }

        public double getBeasiswa() {
            double beasiswa = 0;
            if (ipk >= 3.0 && ipk < 3.5) {
                beasiswa = 50;
            } else if (ipk >= 3.5 && ipk <= 4) {
                beasiswa = 75;
            }
            return beasiswa;
        }

        @Override
        public double getPendapatan() {
            return super.getPendapatan() + getBeasiswa();
        }

        @Override
        public String toString() {
            return super.toString() +
                "NIM\t\t\t: " + getNim() + "\n" 
                + "IPK\t\t\t: " + getIpk() + "\n" 
                + "Status\t\t\t: " + getStatus() + "\n";
        }
}
