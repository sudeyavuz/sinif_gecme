package JAVA101;
import java.util.Scanner;
public class onuncu_ornek {
    public static void main(String[] args) {
        int mat , tur , fiz , kim ,muz ;
        Scanner input = new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz");
        mat = input.nextInt();
        if(mat<0 || mat>100) {
            System.out.println("geçerli bir sayı giriniz");
            System.out.println("matematik notunuzu giriniz");
            mat = input.nextInt();
        }
        System.out.println("türkçe notunuzu giriniz");
        tur = input.nextInt();
        if (tur>100 || tur<0){
            System.out.println("geçerli bir sayı giriniz");
            System.out.println("türkçe notunuzu giriniz");
            tur = input.nextInt();
        }
        System.out.println("fizik notunuzu giriniz");
        fiz = input.nextInt();
        if (fiz>100 || fiz<0){
            System.out.println("geçerli bir sayı giriniz");
            System.out.println("fizik notunuzu giriniz");
            fiz = input.nextInt();
        }
        System.out.println("kimya notunuzu giriniz");
        kim = input.nextInt();
        if (kim<0 || kim>100){
            System.out.println("geçerli sayı giriniz");
            System.out.println("kimya notunuzu giriniz" );
            kim = input.nextInt();
        }
        System.out.println("müzik notunuzu giriniz");
        muz = input.nextInt();
        if (muz>100 || muz<0){
            System.out.println("geçerli bir not giriniz");
            System.out.println("müzik notunuzu giriniz");
            muz = input.nextInt();
        }
        double sonuc = (mat+tur+fiz+kim+muz)/5;
        if (sonuc>=55){
            System.out.println("geçtiniz ortalamanız: "+sonuc);
        }else{
            System.out.println("kaldınız ortalamanız: "+sonuc);
        }
    }

}
