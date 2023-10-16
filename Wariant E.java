import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int wiek = input.nextInt();
        int dzien_wiek = wiek * 365;
        System.out.println("Żyjesz już ponad " + dzien_wiek + " dni");


    }


}

