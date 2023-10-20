import java.net.Socket;
import java.util.Scanner;

public class latihan220 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

/*       double diskon1, diskon2, diskon3, diskon4, diskon5 = 0;


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
            System.out.println("Anda mendapatkan diskon : " + diskon3);
            }
            else{
            System.out.println("Anda mendapatkan diskon : " + diskon1);
            }
        
        } else if (jenis_buku == 2) {
            diskon1 = 0.07;
            diskon2 = 0.02;
            diskon3 = 0.01;
            diskon4 = diskon1 + diskon2;
            diskon5 = diskon1 + diskon3;

            if (jml_buku > 3){
                System.out.println("Anda mendapatkan diskon : " + diskon4);
            } else {
                System.out.println("Anda mendapatkan diskon : " + diskon5);
            }

        } else if (jenis_buku == 3) {
            diskon1 = 0.05;
            if (jml_buku > 3){
                System.out.println("Anda mendapatkan diskon : " + diskon1);
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
            }
        } else {
            System.out.println("Input yang anda masukkan salah");
        } */


        // 
        System.out.println("Masukkan jenis buku :\n1.Kamus \n2.Novel \n3.Selain Kamus & Novel ");
        System.out.println("Masukkan pilihan : ");
        int jenis_buku = input.nextInt();

        System.out.println("Masukkan Jumlah Buku yang dibeli : ");
        int jml_buku = input.nextInt();

        // 
        double diskon = 0;
        switch (jenis_buku) {
            case 1:
                diskon = 0.1;
                System.out.println("Anda mendapatkan diskon :" + diskon);
                if (jml_buku > 2) {
                    diskon += 0.02;
                    System.out.println("Anda mendapatkan diskon : " +diskon);
                }
                break;
            case 2:
                diskon = 0.07;
                if (jml_buku > 3) {
                    diskon += 0.02;
                    System.out.println("Anda mendapatkan diskon :" + diskon);
                } else {
                    diskon += 0.01;
                    System.out.println("Anda mendapatkan diskon :" + diskon);
                }
                break;
            case 3:
                diskon = 0;
                if (jml_buku > 3) {
                    diskon += 0.05;
                } else {
                    System.out.println("Anda tidak mendapatkan diskon");
                }
                break;
            default:
                System.out.println("Input yang anda masukkan salah");
                return;
        }

    }
}
