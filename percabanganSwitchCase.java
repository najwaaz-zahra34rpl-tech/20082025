import java.util.Scanner;

public class percabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Warna Lampu ");
        String lampu = input.next();
         
        switch (lampu) {
            case "merah":
                System.out.println("Anda harus berhenti ");
                break;
            case "kuning":
                System.out.println("Anda harus berhati-hati");
                break;
            case "hijau":
                System.out.println("Anda jalan terus");
                break;
            default:
                break;
        }
        }

        
    }
    

