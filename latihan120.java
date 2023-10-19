import java.util.Scanner;

public class latihan120 {
    public static void main(String[] args) {

            /*     int bil1 = 28;
                int bil2 = 54;
                int bil3 = 15;
                
                int max = (bil1 > bil2) ? ((bil1 > bil3) ? bil1 : bil3) : ((bil2 > bil3) ? bil2 : bil3);
        
                System.out.println("Bilangan terbesar: " + max); */


        Scanner input = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input.nextInt();

        // Mencari bilangan terbesar
        int bilanganTerbesar = bil1;
        if (bil2 > bilanganTerbesar) {
            bilanganTerbesar = bil2;
        }
        if (bil3 > bilanganTerbesar) {
            bilanganTerbesar = bil3;
        }

        // Menampilkan output
        System.out.println("Bilangan terbesar: " + bilanganTerbesar);
    }
}

            
        
        
    
    

