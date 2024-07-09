public class Komik extends Buku {
    private int volume;

    public void naikkanHarga() {
        double hargaSekarang = getharga();
        double kenaikan = hargaSekarang * 0.10;
        setharga(hargaSekarang + kenaikan);
        System.out.println("Harga komik telah dinaikkan sebesar 10%. Harga baru: " + getharga());
    }

    public int getvolume(){
        return this.volume;
    }

    public void setvolume(int volume){
        this.volume = volume;
    }

}
