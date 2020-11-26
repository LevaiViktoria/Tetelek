package tetelgyakorlas;

import java.util.Scanner;
import java.math.*;
import java.util.Random;

public class TetelGyakorlas {

    public static void main(String[] args) {
       int elemszam = (int) (Math.random()*10)+10;
       int tomb1 [] = new int [elemszam];
       int tomb2 [] = new int [elemszam];
       int negativ [] = new int [elemszam*2];
       
       for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*200)-100;           
            tomb2[i] = (int) (Math.random()*200)-100;               
        }
       System.out.print("A tömb1 elemei:");
       for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d", tomb1[i])+" ");
        }
       //eldöntés: van-e 0 a tömbben
       boolean szerepelE=false;
        for (int i = 0; i < elemszam; i++) {
            if (tomb1[i]==0) {
                szerepelE=true;   
                break;
            }
            
        }
        System.out.println(szerepelE);
        
       System.out.print("A tömb2 elemei:");
       for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d", tomb2[i])+" ");
        }
       int negativDb=0;
       
       for (int i = 0; i < elemszam; i++) {
            if (tomb1[i]<0) {
                negativ[negativDb++]=tomb1[i];
                
            }
            if (tomb2[i]<0) {
                negativ[negativDb++]=tomb2[i];
            }
        }
       int negativOsszeg=0;
       System.out.print("\n\nNegatív tömb elemei: ");
        
            if (negativDb > 0){
                for (int i = 0; i < negativDb; i++) {
                    System.out.print(negativ[i]+" ");
                    negativOsszeg = negativOsszeg+negativ[i];
                }
            }
            else {
                System.out.print("nincs negativ");
            }
            
        boolean oszthatoE=false;
        for (int i = 0; i < elemszam; i++) {
            if (negativ[i]%5==0) {
                oszthatoE=true;   
            }
        }
        if (oszthatoE==true) {
            System.out.println("\nVan 5-el osztható szám a negatív számok között.");
        }
        else{
            System.out.println("\nNincs 5-el osztható szám a negatív számok között.");
        }
            
            System.out.println("\nA negatív tömb összege: "+negativOsszeg);
            System.out.println("A negatív tömb átlaga: "+(double) negativOsszeg/negativDb);
    }
    
}
