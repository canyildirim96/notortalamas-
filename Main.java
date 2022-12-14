import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, tarih, turkce, muzik;

        System.out.print("Matematik Dersi Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Dersi Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Dersi Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Tarih Dersi Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Türkçe Dersi Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Müzik Dersi Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + muzik );
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız: " + sonuc );
        System.out.println((60 < sonuc) ? "TEBRİKLER BAŞARIYLA TAMAMLADINIZ" : "BAŞARISIZ");






    }
}