import java.util.Scanner;

/**
 * p61_SecuenciaNumeros1- Se desea imprimir la secuencia de números mostrados el número de renglones que el usuario desee:
 */
public class p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); // Borrar pantalla de la consola
        Scanner teclado = new Scanner(System.in);
        System.out.println("De cuantos renglones "); int r = teclado.nextInt();
        

        for(int i = 1 ; i<=r ; i++){
            for(int j = 1 ; j <= i ; j++)
                
                System.out.print(i+" ");
            
                
            System.out.println();

        }
        teclado.close();
        
    }

    
}