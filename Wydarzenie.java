package zad5;

public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostepneMiejsca;
    private double cena;


    public Wydarzenie(String nazwa, double cena) {
        this(nazwa, cena, "Dzisiaj", "Warszawa");
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
        this.maxLiczbaMiejsc = 100;
        this.dostepneMiejsca = 100;
    }


    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getMiejsce() { return miejsce; }
    public void setMiejsce(String miejsce) { this.miejsce = miejsce; }

    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) { this.maxLiczbaMiejsc = maxLiczbaMiejsc; }

    public int getDostepneMiejsca() { return dostepneMiejsca; }
    public void setDostepneMiejsca(int dostepneMiejsca) { this.dostepneMiejsca = dostepneMiejsca; }

    public double getCena() { return cena; }
    public void setCena(double cena) { this.cena = cena; }

    public boolean zarezerwujMiejsce() {
        if (dostepneMiejsca > 0) {
            dostepneMiejsca--;
            return true;
        }
        return false;
    }

    public void anulujMiejsce() {
        if (dostepneMiejsca < maxLiczbaMiejsc) {
            dostepneMiejsca++;
        }
    }


    @Override
    public String toString() {
        return nazwa + " | " + data + " | " + miejsce + " | Cena: " + cena + "zł";
    }
}
