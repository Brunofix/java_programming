public class Main {
    public static void main(String[] args) {
        TestAutomobila automobil1 =new TestAutomobila("x6",25,100);
        TestAutomobila automobil2 =new TestAutomobila("volvo v60",15,100);

        UsporedbaPotrosnje.usporedi(automobil1, automobil2);
    }
}
