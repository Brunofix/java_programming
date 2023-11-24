import java.io.File;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        try
        {
            File dat = new File("students.ser");
            dat.createNewFile();
        }
        catch (Exception e)
        {
            e.toString();
        }

        System.out.println("Koliko studenata zelis?");
        int brojStudenata = scan.nextInt();

        Student studenti[] = new Student[brojStudenata];

        for(int i = 0;i<studenti.length;i++)
        {
            scan.nextLine();
            System.out.println("Student broj " + i+1 + ".");
            System.out.println("JMBAG studenta: ");
            String JMBAG = (String)scan.nextLine();
            System.out.println("Ime studenta: ");
            String ime = scan.nextLine();
            System.out.println("Prezime studenta: ");
            String prezime = scan.nextLine();
            System.out.println("Fakultet koji pohadja student: ");
            String fakultet = scan.nextLine();
            System.out.println("Smjer koji podadja student: ");
            String smjer = scan.nextLine();
            System.out.println("Godina studija: ");
            int godina = scan.nextInt();
            System.out.println("Prosjek ocjena: ");
            double prosjek = scan.nextDouble();

            studenti[i] = new Student(JMBAG,ime,prezime,fakultet,smjer,godina,prosjek);
        }
        CreateStudentFile studFile = new CreateStudentFile();
        ReadStudentFile readStud = new ReadStudentFile();

        try
        {
            studFile.openFile();
            for (int i = 0; i < studenti.length; i++)
            {
                studFile.addStudent(studenti[i]);
            }
            studFile.closeFile();

            readStud.openFile();
            for (int i = 0; i < studenti.length; i++)
            {
                studenti[i] = readStud.readStudent();
                System.out.println("Student broj " + i+1 + ".");
                System.out.println(studenti[i].getMaticniBroj());
                System.out.println(studenti[i].getIme());
                System.out.println(studenti[i].getPrezime());
                System.out.println(studenti[i].getFakultet());
                System.out.println(studenti[i].getSmjer());
                System.out.println(studenti[i].getGodina());
                System.out.println(studenti[i].getProsjecnaOcjena());
            }
            readStud.closeFile();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }

        double prosjek = 0;

        for(int i=0;i< studenti.length;i++)
        {
            prosjek += studenti[i].getProsjecnaOcjena();
        }
        prosjek = prosjek/studenti.length;

        System.out.println("Ukupan prosjek svih studenata: " + prosjek);
    }
}