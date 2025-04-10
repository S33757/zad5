package zad5;

import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();


    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }



    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.zarezerwujMiejsce()) {
            klient.dodajRezerwacje(wydarzenie);
        } else {
            System.out.println("Brak dostępnych miejsc na wydarzenie: " + wydarzenie.getNazwa());
        }
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                return w;
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : klienci) {
            if (k.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return k;
            }
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
        }
    }

    public void wyswietlDostepnoscMiejsc() {
        System.out.println("Dostępność miejsc na wydarzeniach:");
        for (Wydarzenie w : wydarzenia) {
            System.out.println("- " + w.getNazwa() + ": " + w.getDostepneMiejsca() + " z " + w.getMaxLiczbaMiejsc());
        }
    }
}
