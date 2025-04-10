package zad5;

public class Main {
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();

//dodaj wydarzenie
        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
        Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);
//dodaj klient
        Klient klient1 = new Klient("Hubert", "Bogucki", "s33757@pjwstk.edu.pl");
        Klient klient2 = new Klient("Jan", "Kowalski", "jan.kowalski@gmail.com");
        Klient klient3 = new Klient("Anna", "Nowak", "anna.kowalski@gmail.com");
        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);
        system.dodajKlienta(klient3);

        //System.out.println("----------------test-----przed-------------");
        System.out.println("Dostępne miejsca przed rezerwacjami:");
        system.wyswietlDostepnoscMiejsc();
//rezerwacje
        system.dokonajRezerwacji(klient1, koncert); //koncert -1
        system.dokonajRezerwacji(klient1, teatr); //teatr -1
        system.dokonajRezerwacji(klient2, koncert); //koncert -1
        system.dokonajRezerwacji(klient2, teatr); //teatr -1
        system.dokonajRezerwacji(klient3, koncert); //koncert -1
        //System.out.println("----------------test-----po rezerwacji------------");
        System.out.println("\nDostępne miejsca po rezerwacjach:");
        system.wyswietlDostepnoscMiejsc();
// koncert -3, teatr -2
        System.out.println();
//pokaz rezerwacje
        System.out.println("Rezerwacje klienta " + klient1.getImie() + " " + klient1.getNazwisko() + " " + klient1.getEmail() + ":");
        klient1.wyswietlRezerwacje();

        System.out.println();

        System.out.println("Rezerwacje klienta " + klient2.getImie() + " " + klient2.getNazwisko() + ":");
        klient2.wyswietlRezerwacje();

        System.out.println();

        System.out.println("Rezerwacje klienta " + klient3.getImie() + " " + klient3.getNazwisko() + ":");
        klient3.wyswietlRezerwacje();

//znajdz wydarzenie
        Wydarzenie koncertRef = system.znajdzWydarzenie("Koncert Symphony");

//zmiana ceny
        System.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");
        koncertRef.setCena(150.0);
//znowu pokaz rezerwacje
        System.out.println("\nRezerwacje klienta " + klient1.getImie() + " po zmianie ceny:");
        klient1.wyswietlRezerwacje();

        System.out.println("\nRezerwacje klienta " + klient2.getImie() + " po zmianie ceny:");
        klient2.wyswietlRezerwacje();

        System.out.println("\nRezerwacje klienta " + klient3.getImie() + " po zmianie ceny:");
        klient3.wyswietlRezerwacje();
// klient2 anuluje na TEATR (+1), pokaz rezerwacje  --- powinno byc: koncert 97 teatr 99
        System.out.println("\nKlient " + klient2.getImie() + " anuluje rezerwację na teatr:");
        klient2.anulujRezerwacje(teatr); // nie dziala?
        teatr.anulujMiejsce();
        klient2.wyswietlRezerwacje();
        //System.out.println("----------------test--------ANULUJE----------");
        system.wyswietlDostepnoscMiejsc();
//dostepne miejsca
    }
}
