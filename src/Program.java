import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        String nazwa;
        int ilosc;


        Klasa[] klasa = new Klasa[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < klasa.length; i++) {
            System.out.println("Podaj nazwę klasy: ");
            nazwa = scan.nextLine();
            System.out.println("Podaj ilość uczniów: ");
            ilosc = scan.nextInt();
            scan.nextLine();

            if (!klasa[i].zawiera(nazwa, ilosc, klasa)) {
                klasa[i].setNazwa(nazwa);
                klasa[i].setIloscUczniow(ilosc);
            } else {
                System.out.println("Podaj nazwę klasy: ");
                nazwa = scan.nextLine();
                System.out.println("Podaj ilość uczniów: ");
                ilosc = scan.nextInt();

            }


        }

        for ( Klasa elem: klasa )
        {
           System.out.print ("Klasa: "+elem.getNazwa()+" Ilość uczniów: "+elem.getIloscUczniow());
        }   
        
    }
}