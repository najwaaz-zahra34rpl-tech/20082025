import java.util.Scanner;

public class PerhitunganDiskon {
    public static void main(String[] args) {
        double totalbeli,diskon,hargaAkhir,bayar,kembalian;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Total Pembelian: ");
        totalbeli = input.nextDouble();

        if(totalbeli > 500000){
            System.out.println("Mendapatkan diskon 20%");
            diskon = (0.2)*totalbeli;
        }else if(totalbeli > 300000){
            System.out.println("Mendapatkan diskon 15%");
            diskon = (0.15)*totalbeli;
        }else if(totalbeli > 100000){
            System.out.println("Mendapatkan diskon 10%");
            diskon = (0.1)*totalbeli;
        }else{
            System.out.println("Tidak ada diskon");
            diskon = 0;
        }
        hargaAkhir = totalbeli -  diskon;
        System.out.println("Harga Akhir: " + hargaAkhir);
        System.out.println("Masukkan pembayaran: ");
        bayar = input.nextDouble();
        kembalian = bayar - hargaAkhir;
        System.out.println("Kembalian anda: "+kembalian);
    }
        
}
