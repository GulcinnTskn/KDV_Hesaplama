import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran =0.18,kdvliTutar,kdvTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

         kdvTutar = tutar * kdvOran;
         kdvliTutar = tutar + kdvTutar;

        System.out.println(kdvliTutar);
        System.out.println("KDV'siz Tutar : " +tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " +kdvTutar);
        System.out.println("KDV'li Tutar : "+kdvliTutar);
    }
}