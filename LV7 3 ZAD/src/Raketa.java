public class Raketa extends Thread
    {
        String ime;
        LansirnaRampa rampa;

        public Raketa(String ime, LansirnaRampa rampa)
        {
            this.ime = ime;
            this.rampa = rampa;
        }

        public void run(){
            synchronized ()
        }

            System.out.println("Raketa po imenu: " + ime + " spremna je za lansiranje!");
}
