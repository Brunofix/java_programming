import java.io.Serializable;

class Student implements Serializable
{
    private String maticniBroj;
    private String ime;
    private String prezime;
    private String fakultet;
    private String smjer;
    private int godina;
    private double prosjecnaOcjena;

    public Student()
    {
        this("0","Ivan", "Horvat", "Fakultet", "Smjer", 1, 3.0);
    }

    public Student(String maticniBroj, String ime, String prezime, String fakultet, String smjer, int godina, double prosjecnaOcjena)
    {
        this.fakultet = fakultet;
        this.ime = ime;
        this.godina = godina;
        this.prezime = prezime;
        this.smjer = smjer;
        this.maticniBroj = getMaticniBroj();
        this.prosjecnaOcjena = prosjecnaOcjena;
        this.maticniBroj = maticniBroj;
    }

    public String getMaticniBroj()
    {
        return maticniBroj;
    }

    public String getIme()
    {
        return ime;
    }

    public String getPrezime()
    {
        return prezime;
    }

    public String getFakultet()
    {
        return fakultet;
    }

    public String getSmjer()
    {
        return smjer;
    }

    public int getGodina()
    {
        return godina;
    }

    public double getProsjecnaOcjena()
    {
        return prosjecnaOcjena;
    }
}