package praktikum4.soal1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String judul = "", penulis = "";
        int tahun = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Judul: ");
        judul = input.nextLine();
        
        System.out.print("Penulis: ");
        penulis = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        tahun = input.nextInt();
        
        buku buku = new buku(judul, penulis, tahun);
        
        buku.display();
        
    }
}
