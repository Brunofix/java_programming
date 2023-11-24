public class Test {
    public static void main(String[] args) {
        Ptica ptica = new Ptica();
        ptica.setIme("Slavuj");
        System.out.println("Ime ptice: " + ptica.getIme());
        ptica.glasajSe();

        Lastavica lastavica = new Lastavica();
        lastavica.setIme("Lastavica1");
        System.out.println("Ime lastavice: " + lastavica.getIme());
        lastavica.glasajSe();
    }

}
