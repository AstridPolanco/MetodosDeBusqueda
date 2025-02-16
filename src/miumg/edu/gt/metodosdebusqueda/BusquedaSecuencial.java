package miumg.edu.gt.metodosdebusqueda;

public class BusquedaSecuencial {

    public static int buscar(int[] B, int dato){
        //inicio busqueda secuencial
        for (int i = 0; i < B.length; i++) {
            if(dato == B[i]) {
                return i;
            }
        }
        return -1;
        }
    }
