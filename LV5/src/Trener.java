public class Trener extends Osoba {
    private String klub;

    private float placa;

    public Trener(String ime, String prezime, long oib,String Klub,float placa) {
        super(ime, prezime, oib);
        this.klub=Klub;
        this.placa=placa;

    }

    @Override
    public void ispis() {
        super.ispis();
        System.out.println("Klub" + klub);
        System.out.println("placa" + placa);

    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }
}
