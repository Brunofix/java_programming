public class Raketa implements Runnable
{
    String ime;
    LansirnaRampa rampa;

    public Raketa(String ime, LansirnaRampa rampa)
    {
        this.ime = ime;
        this.rampa = rampa;
    }

    public void run()
    {
        System.out.println("Raketa po imenu: " + ime + " spremna je za lansiranje!");
        try
        {
            rampa.Lansiraj();
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Raketa po imenu: " + ime + " je lansirana!");
    }
}