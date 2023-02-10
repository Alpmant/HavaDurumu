import java.io.Console;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Sıcaklık Değerini Giriniz:");
        int derece = input.nextInt();
        System.out.println(derece<5 ? "Kayak" :(5<=derece && derece<15 ? "Sinema":(15<=derece && derece<25 ?"Piknik":"Yüzme")));




    }


}
