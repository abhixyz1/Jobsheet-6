import java.util.Scanner;

class Pemilihan2Percobaan120{
    public static void main(String[] args) {
        
        Scanner input20 = new Scanner(System.in);

        System.out.println("Masukkan Tahun : ");
        int tahun = input20.nextInt();

        if ((tahun % 400 ) == 0) {
            System.out.println("Tahun Kabisat");
        } else if ((tahun % 100 ==0)){
            System.out.println("Bukan Tahun Kabisat");
        } else if ((tahun % 4) == 0) {
            System.out.println("Tahun kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}