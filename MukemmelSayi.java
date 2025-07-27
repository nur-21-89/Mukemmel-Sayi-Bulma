package BirinciHafta;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam =0;

        System.out.print("Sayınızı Giriniz:");
        sayi = input.nextInt();

        for(int i=1; i<sayi; i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam == sayi){
            System.out.print("Sayınız Mükemmel Sayı.");
        }else {
            System.out.print("Sayınız Mükemmel Sayı Değil.");
        }
    }
}
