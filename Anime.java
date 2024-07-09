public class Anime {
    private int id;
    private String judul;
    private String studio;
    private int episode;

    public Anime() {
        System.out.println("Object Anime telah diciptakan, constructor berjalan");
    }
    
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Studio: " + studio);
        System.out.println("Episode: " + episode);
    }

    public void gantiJudul() {
        System.out.println("Ini method untuk mengganti judul Anime");
    }

    public void deleteAnime() {
        System.out.println("Ini method untuk menghapus Anime");
    }

    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getjudul() {
        return this.judul;
    }

    public void setjudul(String judul) {
        this.judul = judul;
    }

    public String getstudio() {
        return this.studio;
    }

    public void setstudio(String studio) {
        this.studio = studio;
    }

    public int getepisode() {
        return this.episode;
    }

    public void setepisode(int episode) {
        this.episode = episode;
    }
}
