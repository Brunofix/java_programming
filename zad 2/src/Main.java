public class Main{

    private static class Zaposlenik {

        private static final int MONTHS_IN_YEAR = 12;

        // staz u godinama
        private int staz;

        private int starost;

        private float placa;

        public Zaposlenik(int staz, int starost, float placa){
            this.staz = staz;
            this.starost = starost;
            this.placa = placa;
        }

        public void setStaz(int staz){
            this.staz = staz;
        }

        public int getStaz(){
            return staz;
        }

        public void setStarost(int starost){
            this.starost = starost;
        }

        public int getStarost(){
            return starost;
        }

        public void setPlaca(float placa){
            this.placa = placa;
        }

        public float getPlaca(){
            return placa;
        }

        public float getTotalPayout(){
            return (staz * MONTHS_IN_YEAR) * placa;
        }

        public static float getTotalPayout(Zaposlenik zaposlenik){
            // return zaposlenik.getTotalPayout();
            return (zaposlenik.staz * MONTHS_IN_YEAR) * zaposlenik.placa;
        }

    }

}