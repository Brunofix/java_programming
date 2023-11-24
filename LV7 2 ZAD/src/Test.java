import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test
{
    public static void Start() throws InterruptedException
    {
        Raketa[] rakete = {new Raketa("Jurica", new LansirnaRampa()),
                new Raketa("Mjesec", new LansirnaRampa()),
                new Raketa("Slow", new LansirnaRampa()),
                new Raketa("Sat", new LansirnaRampa()),
                new Raketa("Mars", new LansirnaRampa())};

        ExecutorService threadExecutor = Executors.newCachedThreadPool();

        for(Raketa i: rakete)
        {
            threadExecutor.execute(i);
        }

        threadExecutor.shutdown();
    }
}