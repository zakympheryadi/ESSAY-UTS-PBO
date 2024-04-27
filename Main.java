public class Main {
    
    public static void main(String[] args) {
        Hero hero1 = new TankHero("Grock", 32000);
        Hero hero2 = new AssassinHero("Gusion", 44000);
        Hero hero3 = new MageHero("Yve", 38000);

        hero1.displayHeroInfo();
        hero1.skillUnik();

        System.out.println();

        hero2.displayHeroInfo();
        hero2.skillUnik();

        System.out.println();

        hero3.displayHeroInfo();
        hero3.skillUnik();
    }
}