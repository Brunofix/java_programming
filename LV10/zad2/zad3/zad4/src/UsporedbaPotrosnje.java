/*Napisati klasu TestAutomobila koja ima privatne članove naziv , postrosioGoriva i
        prijedjenPut . Napisati klasu UsporedbaPotrosnje koja u sebi sadrži static metodu usporedi
        koja prima dva objekta klase TestAutomobila, računa i ispisuje prosječnu potrošnju svakog te
        koji je automobil štedljiviji.*/
public class UsporedbaPotrosnje {
    public static void usporedi(TestAutomobila automobil1, TestAutomobila automobil2) {
        double prosjecnaPotrosnja1 = automobil1.getProsjecnaPotrosnja();
        double prosjecnaPotrosnja2 = automobil2.getProsjecnaPotrosnja();

        System.out.println("Prosječna potrošnja automobila " + automobil1.naziv + " je " + prosjecnaPotrosnja1 + " litara/km.");
        System.out.println("Prosječna potrošnja automobila " + automobil2.naziv + " je " + prosjecnaPotrosnja2 + " litara/km.");

        if (prosjecnaPotrosnja1 < prosjecnaPotrosnja2) {
            System.out.println("Automobil " + automobil1.naziv + " je štedljiviji od automobila " + automobil2.naziv + ".");
        } else if (prosjecnaPotrosnja1 > prosjecnaPotrosnja2) {
            System.out.println("Automobil " + automobil2.naziv + " je štedljiviji od automobila " + automobil1.naziv + ".");
        } else {
            System.out.println("Automobili " + automobil1.naziv + " i " + automobil2.naziv + " imaju istu prosječnu potrošnju.");
        }
    }
}




