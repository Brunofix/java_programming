import java.io.File;

/*Napisati program koji će ispisivati hijerarhiju sistemskog diska (ispisati dodatne
informacije kao što su “direktorij”, “datoteka”). Nakon što se ispiše hijerarhija,
ponovno proći kroz sve ali prilikom ispisa provjeriti da li naziv direktorija ili datoteke
počinje slovom između a - n (ako je malo početno prepraviti u veliko), a ako počinje
slovom između o - z (ako je zadnje slovo malo prepraviti kompletan naziv u velika
slova).
 */
public class Main {

    public static void main(String[] args) {
        analyzePath("C:/");
    }

    public static void analyzePath(String path) {
        // stvori File objekt na temelju korisničkog unosa
        File name = new File(path);
        if (name.exists()) {
            // ispiši informacije o datoteci ili direktoriju
            System.out.printf(
                    "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    name.getName(), " exists",
                    (name.isFile() ? "is a file" : "is not a file"),
                    (name.isDirectory() ? "is a directory" :
                            "is not a directory"),
                    (name.isAbsolute() ? "is absolute path" :
                            "is not absolute path"), "Last modified: ",
                    name.lastModified(), "Length: ", name.length(),
                    "Path: ", name.getPath(), "Absolute path: ",
                    name.getAbsolutePath(), "Parent: ", name.getParent());
            if (name.isDirectory()) {
                String[] directory = name.list();
                System.out.println("\n\nDirectory contents:\n");
                for (String directoryName : directory)
                    System.out.println(directoryName);
            }
        } else {
            System.out.printf("%s %s", path, "does not exist.");
        }
    }
}