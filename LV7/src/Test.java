public class Test
{
    public static void Start() throws InterruptedException
    {
        Raketa[] rakete = {new Raketa("Mjesec", new LansirnaRampa()),
                new Raketa("Grmi", new LansirnaRampa()),
                new Raketa("Jurilica", new LansirnaRampa()),
                new Raketa("Sunce", new LansirnaRampa()),
                new Raketa("Mars ", new LansirnaRampa())};

        for(Raketa i: rakete)
        {
            (new Thread(i)).start();
        }
    }
}