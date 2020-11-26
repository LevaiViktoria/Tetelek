package megszamlalas;


public class Megszamlalas {

    public static void main(String[] args) {
    System.out.println("\n\tMEGSZÁMLÁLÁS TÉTELE");
        System.out.println("\n\tKészítette: Lévai Viktória\n");
        int[]tomb=new int[5];
        
        int szamlalo=0;
        for (int i = 0; i < 5; i++) {
            tomb[i]=(int) (Math.random()*99)+1;
            szamlalo++;
        }
        System.out.print("A tömb elemei:\n");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+". eleme: "+ " ");
            System.out.print(String.format("%,2d",tomb[i])+"\n");
            
        }
        System.out.println("");
        System.out.println(szamlalo+" elemű tömbunk\n");
        
    }
    
}
