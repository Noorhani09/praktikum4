package praktikum4.soal1;

public class buku {
    private String judul;
    private String penulis;
    private Integer tahun;
    
    public buku(String j, String p, int t){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }
    
    void display(){
        System.out.println("Detail buku:");
        System.out.println("Judul adalah " + this.judul);
        System.out.println("Penulis adalah " + this.penulis);
        System.out.println("Tahun Terbit adalah " + this.tahun);
    }
    
}
