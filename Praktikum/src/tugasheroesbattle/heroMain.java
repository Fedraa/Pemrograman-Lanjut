package tugasheroesbattle;
import java.util.*;

public class heroMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hp1, attack1, defense1;
        double hp2, attack2, defense2;
        String name2;

        Hero welcome = new Hero();
        welcome.display();

        Hero hero1 = new Hero();
        System.out.print(
            "\nSilakkan masukkan atribut hero 1"
        + "\nNama\t\t: ");
        hero1.setName(input.next());

        do {
            System.out.print("HP\t\t: ");
            hp1 = input.nextDouble();
            if (hp1 < 10 || hp1 > 1000) {
                System.out.println("Inputan tidak valid. Silakan coba lagi.");
            }
        } while (hp1 < 10 || hp1 > 1000);

        hero1.setHp(hp1);

        do {
            System.out.print("Attack\t\t: ");
            attack1 = input.nextDouble();
            if (attack1 < 10 || attack1 > 1000) {
                System.out.println("Inputan tidak valid. Silakan coba lagi.");
            }
        } while (attack1 < 10 || attack1 > 1000);

        hero1.setAttack(attack1);

        do {
            System.out.print("Defense\t\t: ");
            defense1 = input.nextDouble();
            if (defense1 < 10 || defense1 > 1000) {
                System.out.println("Inputan tidak valid. Silakan coba lagi.");
            }
        } while (defense1 < 10 || defense1 > 1000);

        hero1.setDefense(defense1);


        System.out.print(
            "\nSilakkan masukkan atribut hero 2"
        + "\nNama\t\t: ");
        name2 = input.next();

        do{
            System.out.print("HP\t\t: ");
            hp2 = input.nextDouble();
            if (hp2 < 10 || hp2 > 1000) {
                System.out.println("Inputan tidak valid. Silakan coba lagi.");
            }
        } while (hp2 < 10 || hp2 > 1000);
        
        do {
            System.out.print("Attack\t\t: ");
            attack2 = input.nextDouble();
            if (attack2 < 10 || attack2 > 1000) {
                System.out.println("Inputan tidak valid. Silakan coba lagi.");
            }
        } while (attack2 < 10 || attack2 > 1000);

        do {
            System.out.print("Defense\t\t: ");
            defense2 = input.nextDouble();
            if (defense2 < 10 || defense2 > 1000) {
                System.out.println("Inputan tidak valid. Silakan coba lagi.");
            }
        } while (defense2 < 10 || defense2 > 1000);

        Hero hero2 = new Hero(name2, hp2, attack2, defense2);

        int ronde = 1;
        double damage1 = 0;
        double damage2 = 0;

        System.out.println("\n====================================" 
        + "\n\nPertarungan dimulai!\n");

        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("===================================="
                + "\n\nRonde ke-" + ronde
                + "\n---------------");
            
            System.out.print("\n" + hero1.getName() + " menyerang " + hero2.getName()
            + "\n\n" + hero1.getName() + " menyerang sebesar " + hero1.getAttack()
            + "\n" + hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
            
            damage1 = hero1.getAttack() - hero2.getDefense();
            if (damage1 < 0) {
                damage1 = 0;
            }
            hero2.setHp(Math.max(hero2.getHp() - damage1,0));
            System.out.println("\nHP " +  hero2.getName() + " saat ini " + hero2.getHp());
            
            if (hero2.getHp() == 0) {
                break;
            }
            
            System.out.print("\n\n" + hero2.getName() + " menyerang " + hero1.getName()
            + "\n\n" + hero2.getName() + " menyerang sebesar " + hero2.getAttack()
            + "\n" + hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
            
            damage2 = hero2.getAttack() - hero1.getDefense();
            if (damage2 < 0) {
                damage2 = 0;
            }
            hero1.setHp(Math.max(hero1.getHp() - damage2,0));
            System.out.println("\nHP " +  hero1.getName() + " saat ini " + hero1.getHp() + "\n");

            
            ronde++;

            hero1.setDefense(Math.max(hero1.getDefense() - 20 , 0));
            hero2.setDefense(Math.max(hero2.getDefense() - 20 , 0));
        }

        
        if (hero1.getHp() <= 0) {
            System.out.println("\n====================================" 
            + "\n" + hero2.getName() + " memenangkan pertarungan!"
            + "\n====================================");
        } else {
            System.out.println("\n\n====================================" 
            + "\n\n" + hero1.getName() + " memenangkan pertarungan!"
            + "\n\n====================================");
        }
        input.close();
    }
    

}
