public class TankHero extends Hero {

    public TankHero(String nama, int harga) {
        super(nama, "Tank", harga);
    }

    // Menambahkan skill unik hero tank
    public void skillUnik() {
        System.out.println("Skill Unik: Menahan damage besar");
    }
}
