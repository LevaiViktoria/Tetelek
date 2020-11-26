package kivalogatas2;

import java.util.Scanner;

public class Kivalogatas2 {

    public static void main(String[] args) {
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        
        System.out.println("\t KIVÁLOGATÁS TÉTELE\n");
        int szam;
        
        System.out.print("Hány jegyet írjon ki? ");
            szam = bemenet.nextInt();
            
        int erdemjegyek[]= new int [szam];       
        int masolat [] = new int [szam];
        
        for (int i = 0; i < szam; i++) {
            erdemjegyek[i]= (int)(Math.random()*5)+1;
        }
        System.out.print("A jegyek: ");
        for (int i = 0; i < szam; i++) {
            System.out.print(erdemjegyek[i]+" ");
        }
        
        System.out.println("");
        
        int kettesekDb=0;
        for (int i = 0; i <szam; i++) {
            if (erdemjegyek[i]==2) {
                masolat[kettesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Másolat tömb elemei: ");
        
            if (kettesekDb > 0){
                for (int i = 0; i < kettesekDb; i++) {
                    System.out.print(masolat[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 2-es");
            }
        
        System.out.println("\nKettesek száma: "+kettesekDb);
        
        
        
        bemenet.close();
    }
    
}
