public class MageHero extends Hero {

    public MageHero(String nama, int harga) {
        super(nama, "Mage", harga);
    }

    // Menambahkan skill unik hero mage
    public void skillUnik() {
        System.out.println("Skill Unik: Memberikan damage sihir yang besar");
    }
}
