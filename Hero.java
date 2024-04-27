public class Hero {

    private String nama;
    private String role;
    private int harga;

    public Hero(String nama, String role, int harga) {
        this.nama = nama;
        this.role = role;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void displayHeroInfo() {
        System.out.println("Nama Hero: " + getNama());
        System.out.println("Role: " + getRole());
        System.out.println("Harga: " + getHarga());
    }
}