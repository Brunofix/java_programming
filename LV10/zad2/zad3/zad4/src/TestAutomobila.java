/*Napisati klasu TestAutomobila koja ima privatne članove naziv , postrosioGoriva i
        prijedjenPut . Napisati klasu UsporedbaPotrosnje koja u sebi sadrži static metodu usporedi
        koja prima dva objekta klase TestAutomobila, računa i ispisuje prosječnu potrošnju svakog te
        koji je automobil štedljiviji.*/
class TestAutomobila {
    String naziv;
    private double potrosioGoriva;
    private double prijedjenPut;
    public TestAutomobila(String naziv, double potrosioGoriva, double prijedjenPut) {
        this.naziv = naziv;
        this.potrosioGoriva = potrosioGoriva;
        this.prijedjenPut = prijedjenPut;
    }

    public double getProsjecnaPotrosnja() {
        return potrosioGoriva / prijedjenPut;
    }


}