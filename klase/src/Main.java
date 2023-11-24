public class Main {
    public static void main(String[] args) {
        Zarulja osram = new Zarulja();
        osram.pritisniPrekidac();
        osram.provjeri();

        osram.pritisniPrekidac();
        osram.provjeri();

        osram.pritisniPrekidac();
        osram.provjeri();

        osram.pritisniPrekidac();
        osram.provjeri();

        osram.pritisniPrekidac();
        osram.provjeri();
    }

    private static class Zarulja {

        private boolean stanje = false;

        private Zarulja() {
        }
            private void provjeri (){
            if (stanje == true) {
                System.out.println("svijetli");
            }

            else if (stanje == false)
                    System.out.println("Mrak je");


            }
            private void pritisniPrekidac () {
                if (stanje == true) {
                    stanje=false;
                }

                else
                    stanje=true;


            }
            }
        }



