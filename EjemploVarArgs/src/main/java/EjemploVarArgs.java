/**
 *
 * @author rchv1
 */
public class EjemploVarArgs {
    public static void main(String[] args) {
        /**
         * Imprimimos cantidad x de numeros, sin especificar que es un arreglo
         */
        imprimirNumeros(50, 10, 3, 5, 8, 13, 11, 52, 41);
        System.out.println("");
        System.out.println("********************");
        variosParametros("El Salvador", true, 4, 5, 85, 35, 0, 1);
    }
    
    /**
     * Declaramos una variable de tipo entera que contendra muchos numeros para ello
     * digitamos 3 puntos despues de especificar el tipo, en este caso es int
     * @param numeros 
     */
    private static void imprimirNumeros(int... numeros) {

        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros[i];
            System.out.println("elemento = " + elemento);
        }
    }
    
    private static void variosParametros(String pais, boolean bandera, int... numeros){
        System.out.println("pais = " + pais);
        System.out.println("bandera = " + bandera);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento #: " + numeros[i]);
        }
    }
}
