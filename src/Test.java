import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int k,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak n sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Üs olacak olan k sayısını giriniz: ");
        k = input.nextInt();
        // 3^4 = 3*3*3*3
        int toplam=1;
        for(int i=1; i<=k;i++){
            toplam*=n;
        }
        System.out.println("Cevap: "+toplam);
    }
}
