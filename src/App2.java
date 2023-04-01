public class App2 {
    public static void main(String[] args) {
        Cos obiekt = new Cos(6, 10, "XYZ");
        /*obiekt.a = 6;
        obiekt.b = 10;
        obiekt.c = "XYZ";*/
        //Cos x2 = new Cos();

        System.out.println(obiekt.a);
        System.out.println(obiekt.b);
        System.out.println(obiekt.c);

        Cos obiekt2 = new Cos(10, 15, "ABC");
        System.out.println(obiekt2.a);
        System.out.println(obiekt2.b);
        System.out.println(obiekt2.c);
        obiekt2.metoda();

        Cos obiekt3 = new Cos();
        obiekt3.metoda();
        Cos obiekt4 = new Cos(4);
    }
}
