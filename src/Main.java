import miumg.edu.gt.metodosdebusqueda.BusquedaBinaria;
import miumg.edu.gt.metodosdebusqueda.BusquedaSecuencial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Arreglos
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] B = {4,7,2,8,3,0,5,8};

        //Datos a Buscar
        int datoBinario = 5;
        int datoSecuencial = 8;

        //Busqueda Binaria
        int posicionBinario = BusquedaBinaria.busquedaBinaria(A, datoBinario);
        if (posicionBinario != -1) {
            System.out.println("Busqueda Binaria");
            System.out.println("Elemento encontrado en la posicion: " + posicionBinario);
        }else {
            System.out.println("Busqueda Binaria");
            System.out.println("Elemento no encontrado");
        }
        //Busqueda secuencial
        int posicionSecuencial = BusquedaSecuencial.buscar(B, datoSecuencial);
        if (posicionSecuencial != -1) {
            System.out.println("Busqueda Secuencial");
            System.out.println("Elemento encontrado en la posicion: " + posicionSecuencial);
        }else {
            System.out.println("Busqueda Secuencial");
            System.out.println("Elemento no encontrado");
        }
        }
}