


    public abstract class Zaposlenik {


        private String id;

        private String ime;

        private String prezime;

        public Zaposlenik(String id, String ime, String prezime) {
            this.id = id;
            this.ime = ime;
            this.prezime = prezime;

        }
        public abstract void radi();

        public void predstaviSe(Zaposlenik zaposlenik) {
            System.out.println("ID: " + id);
            System.out.println("Ime: " + ime);
            System.out.println("Prezime: " + prezime);
            System.out.println(zaposlenik.getClass().getSimpleName());
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }
    }



