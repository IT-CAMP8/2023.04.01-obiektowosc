public class App {
    public static void main(String[] args) {
        int x;
        Client c1 = new Client();
        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 20;
        c1.pesel = 1234234;

        c1.address = new Address();
        c1.address.city = "Krakow";
        c1.address.street = "Ogrodowa";
        c1.address.code = "13-123";

        System.out.println(c1.name);
        System.out.println(c1.surname);
        System.out.println(c1.age);
        System.out.println(c1.pesel);


        Client c2 = new Client();
        c2.name = "Zyszek";
        c2.surname = "Malinowski";
        c2.age = 30;
        c2.pesel = 2435245;

        System.out.println(c2.name);
        System.out.println(c2.surname);
        System.out.println(c2.age);
        System.out.println(c2.pesel);

        int[] tab = new int[10];

        //tab.length = 10;

        Client[] tab2 = new Client[100];

        tab2[0] = new Client();

        System.out.println(tab2[5]);

        //tab2[5].name = "Karol";

        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Client client1 = new Client();
        client1.name = "Zyszek";
        client1.surname = "Malinowski";
        client1.age = 30;
        client1.pesel = 2435245;

        /*Client client2 = new Client();
        client2.name = "Zyszek";
        client2.surname = "Malinowski";
        client2.age = 30;
        client2.pesel = 2435245;*/
        Client client2 = client1;

        System.out.println(client1 == client2);

        System.out.println(client1.name);
        System.out.println(client2.name);

        client2.name = "Wiesiek";

        System.out.println(client1.name);
        System.out.println(client2.name);

        int g = 5;
        int z = 7;
        int y = client1.dodaj(g*z, 8);
        System.out.println(y);
        //System.out.println(client1.dodaj(15));
        int liczba;
        //pytamy usera o liczbe
        liczba = 99;
        client1.dodaj(liczba, 15);

        //bez sensu
        /*int o = client1.powiedzSwojeImie();
        System.out.println(client1.powiedzSwojeImie());*/

        client1.dodaj(3, 5);
        client1.dodaj(3.3, 5.5);
        client1.dodaj(4, 3.3);

        System.out.println();
    }
}
