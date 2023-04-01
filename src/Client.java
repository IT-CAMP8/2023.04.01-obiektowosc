public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    int dodaj(int a, int b) {
        return a+b;
    }

    double dodaj(double a, double b) {
        return a+b;
    }

    int podajDomyslneB() {
        return 7;
    }

    void powiedzSwojeImie() {
        System.out.println(name);
    }
}
