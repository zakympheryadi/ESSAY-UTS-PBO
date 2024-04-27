public class AssassinHero extends Hero {

    public AssassinHero(String nama, int harga) {
        super(nama, "Assassin", harga);
    }

    // Menambahkan skill unik hero assassin
    public void skillUnik() {
        System.out.println("Skill Unik: Menghilang dan menyerang dengan cepat");
    }
}