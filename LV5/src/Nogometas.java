public class Nogometas extends Osoba {
    private String klub;
    private String bojaKopacki;

    public Nogometas(String ime, String prezime, long oib,String Klub,String bojaKopacki) {
        super(ime, prezime, oib);
        this.klub=Klub;
        this.bojaKopacki=bojaKopacki;
    }

    @Override
    public void ispis() {
        super.ispis();

        System.out.println("Klub " + klub);
        System.out.println("boja kopacki " + bojaKopacki);
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getBojaKopacki() {
        return bojaKopacki;
    }

    public void setBojaKopacki(int bojaKopacki) {
        this.bojaKopacki = bojaKopacki;
    }
}


