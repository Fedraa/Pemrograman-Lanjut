package tugasInheritance;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n==========" + " KELAS MANUSIA " + "==========" + "\n");

        Manusia manusia1 = new Manusia("Adam", "7294185306149281", true, true);
        System.out.println(manusia1); //Laki-laki telah menikah
        
        Manusia manusia2 = new Manusia("Hawa", "7294185706149282", false, true);
        System.out.println(manusia2); 
        
        Manusia manusia3 = new Manusia("Habel", "7294185706149283", false, false); 
        System.out.println(manusia3); 
        

        System.out.println("==========" + " KELAS MAHASISWA " + "==========" + "\n");
    
        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("233726490512341", 2.3, "Bran", "6294185306149281", true, false);
        System.out.println(mahasiswaFILKOM1);
        
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("233726490512342", 3.2, "Prab", "6294185306149282", true, false);
        System.out.println(mahasiswaFILKOM2); 
        
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("233726490512343", 3.8, "Nisa", "6294185706149283", false, false);
        System.out.println(mahasiswaFILKOM3); 
        

        System.out.println("==========" + " KELAS PEKERJA " + "==========" + "\n");

        Pekerja pekerja1 = new Pekerja(1150, 2022, 3, 19, 2, "Nima", "5294185306149281", false, true); 
        System.out.println(pekerja1);
        
        Pekerja pekerja2 = new Pekerja(800, 2015, 1, 7, 0, "Mina", "5294185306149282", false, true);
        System.out.println(pekerja2); 
        
        Pekerja pekerja3 = new Pekerja(3500, 2004, 2, 4, 10, "Nami", "5294185306149283", false, false);
        System.out.println(pekerja3);
        

        System.out.println("==========" + " KELAS MANAGER " + "==========" + "\n");

        Manager manager = new Manager("Marketing", 7500, 2009, 1, 10, 0, "Anjar", "3523161703980001", true, false);
        System.out.println(manager);

    }
}
