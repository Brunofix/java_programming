public class Direktor extends Zaposlenik {
    public Direktor(String id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public void predstaviSe(Zaposlenik zaposlenik) {
        super.predstaviSe(zaposlenik);
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void radi() {
        System.out.println("Odlucujem");



    }
}
