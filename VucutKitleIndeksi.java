package CaglaSonmez;

import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Lütfen Kilonuzu (kg) Giriniz: ");
        double kilo = input.nextDouble();

        System.out.println("Lütfen Boyunuzu (m) Giriniz: ");
        double boy = input.nextDouble();

        double VKI = kilo / (boy * boy);
        System.out.println("Vücut Kitle Indeksiniz : " + VKI);

    }
}
