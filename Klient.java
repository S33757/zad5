package zad5;

import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;


    public Klient(String imie, String nazwisko) {
        this(imie, nazwisko, "brak@email.com");
    }

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = new ArrayList<>();
    }


    public String getImie() { return imie; }
    public void setImie(String imie) { this.imie = imie; }

    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
    }

    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }
// nie dziala?
    public void anulujRezerwację(Wydarzenie wydarzenie) {
        if (listaRezerwacji.remove(wydarzenie)) {
            wydarzenie.anulujMiejsce();
        }
    }

    public void wyswietlRezerwacje() {
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak rezerwacji.");
        } else {
            for (Wydarzenie w : listaRezerwacji) {
                System.out.println(w);
            }
        }
    }


}
