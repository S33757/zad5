package zad5;

public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 0;
    private double cena;

public Wydarzenie(String nazwa, String data, String miejsce, int maxLiczbaMiejsc, int dostepneMiejsca,double cena) {
    this.nazwa = nazwa;
    this.data = data;
    this.miejsce = miejsce;
    this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    this.dostepneMiejsca = dostepneMiejsca;
    this.cena = cena;
}

    public String getNazwa() {return nazwa;}
    public String getData() {return data;}
    public String getMiejsce() {return miejsce;}
    public int maxLiczbaMiejsc() { return maxLiczbaMiejsc;}
    public int getDostepneMiejsca() { return dostepneMiejsca;}
    public double getCena() {return cena;}

    public void setNazwa(String nazwa) {this.nazwa = nazwa;}
    public void setData(String data) {this.data = data;}
    public void setMiejsce(String miejsce) {this.miejsce = miejsce;}
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {this.maxLiczbaMiejsc = maxLiczbaMiejsc;}
    public void setDostepneMiejsca(int dostepneMiejsca) {this.dostepneMiejsca = dostepneMiejsca;}
    public void setCena(double cena) {this.cena = cena;}
}
