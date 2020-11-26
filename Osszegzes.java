package osszegzes;
import java.util.Scanner;
import java.math.*;
public class Osszegzes {

    public static void main(String[] args) {
        //összegzés tétele
        
        int tomb1[]={6, 54, 73, 22, 17};
        int tomb2[]=new int[5];
        
        int osszeg1=0;
        for (int i = 0; i < 5; i++) {
            tomb2[i]=(int) (Math.random()*99)+1;
            System.out.print(String.format("%,2d",tomb1[i])+" ");
             osszeg1=osszeg1+tomb1[i];
        }
        System.out.println("\b");
      
        int osszeg2=0;
        for (int j = 0; j < 5; j++) {
            System.out.print(String.format("%,2d",tomb2[j])+" "); //formázott adatkiíratás>>> sout(String.format("%,2d",tomb1[i])+" ")
            osszeg2=osszeg2+tomb2[j];
        }
        System.out.println("\b");
            
        
        for (int i = 0; i < 5; i++) {
            if (tomb1[i]<tomb2[i]){
            System.out.println(tomb1[i]+ " kisebb, mint "+ tomb2[i]+" a tömb2 eleme nagyobb ennyivel: "+(tomb2[i]-tomb1[i]));
            }
            
            else if (tomb1[i] > tomb2[i])  {
            System.out.println(tomb1[i]+" nagyobb, mint "+tomb2[i]+" a tömb1 eleme nagyobb ennyivel: "+(tomb1[i]-tomb2[i]));
            }
            else {
                System.out.println("A kettő egyenlő");}
        }
        System.out.println("\nA tömb1 elmei: "+osszeg1);
        System.out.println("A tömb2 elemei: "+osszeg2);
        System.out.println("\n\nA tömb1 elemeinek átlaga: "+osszeg1/tomb1.length);
        System.out.println("A tömb2 elemeinek átlaga: "+osszeg2/tomb2.length);
        
    }
    
}
