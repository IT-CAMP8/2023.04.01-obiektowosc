public class Cos {
    int a;
    int b;
    String c;
    Cos(int a, int b, String c) {
        this(a, b);
        this.c = c;
        System.out.println("Tworzy sie nowy obiekt cos !!");
    }


    Cos(int a, int b) {
        this(a);
        this.b = b;
    }

    Cos(int a) {
        this.a = a;
    }

    Cos() {}

    void metoda() {
        System.out.println(this.a);
    }
}
