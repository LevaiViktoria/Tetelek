package osszetettfeladat;

import java.util.Scanner;

public class OsszetettFeladat {

    public static void main(String[] args) {
        System.out.println("\n\tÖSSZETETT FELADATSOR\nKészítette: Lévai Viktória 113C\n");
        Scanner bemenet = new Scanner(System.in);

        char valasz;
        do {

//2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
            int elemszam = (int) (Math.random() * 20) + 10;

//1. Hozz létre két tömböt: szamok1, szamok2 néven!
            int szamok1[] = new int[elemszam];
            int szamok2[] = new int[elemszam];

//3. Az elemek a -50 és +50 értéktartományba essenek.
//4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek. 
            System.out.print("A szamok1 elemei:");
            for (int i = 0; i < elemszam; i++) {
                szamok1[i] = (int) (Math.random() * 100) - 50;
                System.out.print(String.format("%,4d", szamok1[i]) + " "); //<<formázott adatkiíratás
            }
            System.out.print("\nA szamok2 elemei:");
            for (int i = 0; i < elemszam; i++) {
                szamok2[i] = (int) (Math.random() * 100) - 50;
                System.out.print(String.format("%,4d", szamok2[i]) + " "); //<<formázott adatkiíratás
            }

//5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe, majd írasd ki sorbarendezve.
            int ujTomb[] = new int[elemszam];
            int ujTombdb = 0;
            for (int i = 0; i < elemszam; i++) {
                if ((szamok1[i] % 5 == 0) && (szamok1[i] % 2 == 0)) {
                    ujTomb[ujTombdb++] = szamok1[i];                      //Kiválogatás tétele
                }
                if ((szamok2[i] % 5 == 0) && (szamok2[i] % 2 == 0)) {
                    ujTomb[ujTombdb++] = szamok2[i];
                }

            }
            for (int i = 0; i < ujTombdb - 1; i++) {            //Sorbarendezés tétele(Buborék módszer)
                for (int j = 0; j < ujTombdb - i - 1; j++) {
                    if (ujTomb[j] > ujTomb[j + 1]) {
                        int temp = ujTomb[j];
                        ujTomb[j] = ujTomb[+1];
                        ujTomb[j + 1] = temp;
                    }
                }
            }

            System.out.print("\n\nAz ujTomb elemei: ");
            for (int i = 0; i < ujTombdb; i++) {
                System.out.print(String.format("%,4d", ujTomb[i]) + " ");  //Az új tömb elemeinek kiíratása formázottan
            }

//8. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
            for (int i = 0; i < ujTombdb; i++) {
                if (ujTomb[i] == 0) {
                    System.out.print("\nAz ujTomb tartalmaz 0-át.");
                }
                break;
            }

//6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.  //Min. Max. kiválasztás tétel
            int legnagyobb = ujTomb[0];
            for (int i = 1; i < elemszam; i++) {          //Legnagyobb szám meghatározása az új tömbből
                if (ujTomb[i] > legnagyobb) {
                    legnagyobb = ujTomb[i];
                }
            }

            int legkisebb = ujTomb[0];
            for (int j = 1; j < elemszam; j++) {         //Legkisebb szám meghatározása az új tömbből
                if (ujTomb[j] < legkisebb) {
                    legkisebb = ujTomb[j];
                }
            }

            System.out.println("\nAz ujTomb legnagyobb eleme: " + legnagyobb);
            System.out.println("Az ujTomb legkisebb eleme: " + legkisebb);

//7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
            if (ujTomb[ujTombdb - 1] % ujTomb[0] == 0 || ujTomb[0] % ujTomb[ujTombdb - 1] == 0) {  //<<feltétel
                for (int i = 2; i < ujTombdb; i++) {
                    if (ujTomb[ujTombdb - 1] * i == ujTomb[0]) {
                        System.out.println("A " + ujTomb[0] + " a(z) " + ujTomb[ujTombdb - 1] + " " + i + "-szorosa.");
                    }
                    if (ujTomb[0] * i == ujTomb[ujTombdb - 1]) {
                        System.out.println("A " + ujTomb[ujTombdb - 1] + " a(z) " + ujTomb[0] + " " + i + "-szorosa.");
                    }
                }
            }

//9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...    
            System.out.println("\nSzeretné újra futtatni a programot? (i / n):");
            bemenet = new Scanner(System.in);
            valasz = bemenet.nextLine().toLowerCase().charAt(0);
            System.out.println(valasz);
        } while (valasz == 'i');
    }

}
