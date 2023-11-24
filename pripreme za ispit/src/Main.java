import java.util.Scanner;

//implementacija klase koja nedostaje
class Nit extends Thread{

    int[][] matrica;
    int n,red;

    public Nit(int[][] matrica, int n, int red){
        this.matrica=matrica;
        this.n=n;
        this.red=red;
    }

    @Override
    public void run(){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=matrica[red][i];
        }
        System.out.println(Thread.currentThread().getName()+“ suma=“+sum);
    }

    public class Test {
        public static void main(String[] args){
            Scanner sc;
            int n;
            int[][] matrica = new int[10][10];
            //unos podataka
            sc = new Scanner(System.in);
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrica[i][j]=sc.nextInt();
                }
            }
            //stvaranje niti
            for(int i=0;i<n;i++){
                Nit t = new Nit(matrica,n,i);
                t.setName(„Nit “+i);
                t.start();
                t.join(); //ovu liniju je potrebno staviti u try-catch blok
            }

        }
    }
