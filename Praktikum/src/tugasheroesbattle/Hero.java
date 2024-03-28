package tugasheroesbattle;

public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense;

    public Hero(){}

    public Hero (String name, double hp, double attack, double defense){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }
    public String getName() {
        return name;
    }
    public double getHp() {
        return hp;
    }
    public double getAttack() {
        return attack;
    }
    public double getDefense() {
        return defense;
    }

    String display(){
        String display = "";
        System.out.println("\nSelamat datang di Arena pertarungan Amba!"
        + "\n==============================="
        + "\n\nTerdapat dua hero yang akan bertarung"
        + "\nAnda akan memasukkan atribut-atribut yang diperlukan seperti nama, hp, attack, dan defense"
        + "\nKemudian hero akan bertarung hingga salah satu hero mati"
        + "\n\nUntuk inputan hp, attack, dan defense, hanya bisa memasukkan diantara 10 hingga 1000"
        + "\nJika inputan tidak sesuai, maka Anda akan diminta untuk memasukkan ulang"
        + "\nDefense hero akan dikurang sebesar 20 setiap satu ronde selesai.");

        return display;
    }

}
