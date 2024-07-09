public class Main {
    public static void main(String[] args) {

        Pengguna pengguna = new Pengguna();
        pengguna.login();
        pengguna.lupaPassword();
        pengguna.daftar();

        Buku buku = new Buku();
        buku.setid(1);
        buku.setjudul("Bumi");
        buku.setpenulis("Tere Liye");
        buku.setjumlah_halaman(440);
        buku.setharga(150000);
        buku.printDetails();
        buku.gantiJudul();
        buku.deleteBuku();
        buku.naikkanHarga();
        buku.naikkanHarga(15000);

        Komik komik = new Komik();
        komik.naikkanHarga();
        System.out.println("Volume Komik: " + komik.getvolume());
        
        Anime anime = new Anime();
        anime.setid(1);
        anime.setjudul("Jujutsu Kaisen");
        anime.setstudio("Mappa");
        anime.setepisode(24);
        anime.printDetails();

    }
}
