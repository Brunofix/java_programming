public class LansirnaRampa
{
    public void Lansiraj() throws InterruptedException
    {
        String brojevi[] = {"Deset", "Devet", "Osam", "Sedam", "Sest", "Pet", "Cetiri", "Tri", "Dva", "Jedan"};

        for (String i : brojevi)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}