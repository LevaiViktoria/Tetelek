package kivalogatastetel;

import java.util.Scanner;

public class KivalogatasTetel {

    public static void main(String[] args) {
        
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        
        System.out.println("\n\tKIVÁLOGATÁS TÉTEL KIBŐVÍTVE\n");
       
        System.out.print("Hány jegyet generáljunk? ");
        int szam=bemenet.nextInt();
        
        int[] jegyek=new int[szam];
        int[] egyesek=new int[szam];
        int[] kettesek=new int[szam];
        int[] harmasok=new int[szam];
        int[] negyesek=new int[szam];
        int[] otosok=new int[szam];
        
        System.out.println("\nÉrdemjegyek: ");
        
        for (int i = 0; i < szam; i++) {
            jegyek[i]=(int)(Math.random()*5)+1;
            System.out.print(jegyek[i]+" ");
        }
        System.out.println("");
        
        int egyesekDb=0;
        int kettesekDb=0;
        int harmasokDb=0;
        int negyesekDb=0;
        int otosokDb=0;
        
         for (int i = 0; i < szam; i++){
            if (jegyek[i]==1){
                egyesek[egyesekDb++]=jegyek[i];
            }
            if (jegyek[i]==2) {
                kettesek[kettesekDb++]=jegyek[i];
            }
            if (jegyek[i]==3) {
                harmasok[harmasokDb++]=jegyek[i];  
            }
            if (jegyek[i]==4) {
                negyesek[negyesekDb++]=jegyek[i];
            }
            if (jegyek[i]==5) {
                otosok[otosokDb++]=jegyek[i];
            }
         }
         
        System.out.print("\nAZ egyesek tömb elemei: ");
         for (int i = 0; i < egyesekDb; i++) {
            System.out.print(egyesek[i]+" ");
        }
        System.out.print("\nA kettesek tömb elemei: ");
        for (int i = 0; i < kettesekDb; i++) {
            System.out.print(kettesek[i]+" ");
        }
        System.out.print("\nA hármasok tömb elemei: ");
        for (int i = 0; i < harmasokDb; i++) {
            System.out.print(harmasok[i]+" ");
        }
        System.out.print("\nA négyesek tömb elemei: ");
        for (int i = 0; i < negyesekDb; i++) {
            System.out.print(negyesek[i]+" ");
        }
        System.out.print("\nAz ötösök tömb elemei: ");
        for (int i = 0; i < otosokDb; i++) {
            System.out.print(otosok[i]+" ");
        }
        System.out.println("\n\nEgyesek száma: "+egyesekDb);
        System.out.println("Kettesek száma: "+kettesekDb);
        System.out.println("Hármasok száma: "+harmasokDb);
        System.out.println("Négyesek száma: "+negyesekDb);
        System.out.println("Ötösök száma: "+otosokDb);
    }
    
}
