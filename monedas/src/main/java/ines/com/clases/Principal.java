package ines.com.clases;

/**
 * Realizar un prpograma en java que determine el numero de pasos para encontrar una moneda defectuosa
 *son 200 monedas con las mismas dimensiones (diametro, diseño)
 * dentro de estas existen 20 (probabilidad de 0.10)monedas que son defectuosas.
 * ¿en algun momento de este programa habria iteraciones infinitas?
 */
public class Principal 
{
    public static void main( String[] args )
    {
        Coin bolsa[] = new Coin[200];
    
        int falsa = 0;
        for(int i = 0 ; i<200; i++){
            System.out.println("Indice: "+ (i+1));
            if(falsa == 9){
                // metera una moneda fayuca
                System.out.println("Se ingreso una moneda fayuca");
                bolsa[i] = new Coin((float)0.9875, 2.415);
                falsa = 0;
            } else {
                bolsa[i] = new Coin((float)0.9875, 1.5456);
                falsa++;
            }
            System.out.println("El diametro de bolsa[" +i + "] es: "+ bolsa[i].getDiametro()
                            + " y el peso es: "+ bolsa[i].getPeso());
        }

        // Funcion que verifica si hay moneda fayuca
        int cuantas_falsas = 0;
        for(int i = 0; i<200; i++){
            if(bolsa[i].getPeso() != 1.5456){
                cuantas_falsas = cuantas_falsas + 1;
                System.out.println("Se encontro una moneda falsa en: "+(i+1));
            }
        }
        System.out.println("Se encontraron: "+cuantas_falsas+" Monedas falsas");
        /*Coin diez_pesos = new Coin((float)0.9875, 1.5456);
        System.out.println("El diametro es: "+ diez_pesos.getDiametro()
                            + " y el peso es: "+ diez_pesos.getPeso()); */
    }
}
