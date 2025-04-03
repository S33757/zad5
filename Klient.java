package zad5;

public class Klient {
    private String nazwa;
    private String nazwisko;
    private String email;
    //private listaRezerwacji ArrayList<Wydarzenie>

public Klient(String nazwa, String nazwisko, String email) {
    this.nazwa = nazwa;
    this.nazwisko = nazwisko;
    this.email = email;
}
    public String getNazwa() { return this.nazwa; }
    public String getNazwisko() { return nazwisko; }
    public String getEmail() { return email; }

    public void setNazwa(String nazwa) { this.nazwa = nazwa; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }
    public void setEmail(String email) { this.email = email; }
}
