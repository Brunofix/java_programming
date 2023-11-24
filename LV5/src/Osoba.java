
public class Osoba {

    private String ime;

    private String prezime;
    private long oib;

    public Osoba(String ime, String prezime, long oib) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
    }

    public void ispis() {
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("OIB: " + oib);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public long getOib() {
        return oib;
    }

    public void setOib(long oib) {
        this.oib = oib;
    }

}