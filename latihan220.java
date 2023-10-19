import java.net.Socket;
import java.util.Scanner;

public class latihan220 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double diskon1, diskon2, diskon3, diskon4, diskon5 = 0;


        System.out.println("Masukkan jenis buku :\n1.Kamus \n2.Novel \n3.Selain Kamus & Novel ");
        System.out.println("Masukkan pilihan : ");
        int jenis_buku = input.nextInt();

        System.out.println("Masukkan Jumlah Buku yang dibeli : ");
        int jml_buku = input.nextInt();

        if (jenis_buku == 1){
            diskon1 = 0.1;
            diskon2 = 0.02;
            diskon3 = diskon1 + diskon2;
            if (jml_buku > 2){
            System.out.println("selamat anda mendapatkan diskon sebesar : " + diskon3);
            }
            else{
            System.out.println("anda hanya mendapatkan diskon : " + diskon1);
            }
        
        } else if (jenis_buku == 2) {
            diskon1 = 0.07;
            diskon2 = 0.02;
            diskon3 = 0.01;
            diskon4 = diskon1 + diskon2;
            diskon5 = diskon1 + diskon3;

            if (jml_buku > 3){
                System.out.println("Selamat anda mendapatkan diskon" + diskon4);
            } else {
                System.out.println("selamat anda mendapatkan diskon " + diskon5);
            }

        } else if (jenis_buku == 3) {
            diskon1 = 0.05;
            if (jml_buku > 3){
                System.out.println("selamat anda mendapatkan diskon : " + diskon1);
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
            }
        } else {
            System.out.println("Input yang anda masukkan salah");
        }


    }
}
