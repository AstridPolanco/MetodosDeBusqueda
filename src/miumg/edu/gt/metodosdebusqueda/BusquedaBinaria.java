package miumg.edu.gt.metodosdebusqueda;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] A, int dato) {
        int inicio, fin, mitad;
        inicio = 0;
        fin = A.length - 1;

        while (inicio <= fin) {
            mitad = (inicio + fin) / 2;
            if (A[mitad] == dato) {
                return mitad;
            }else if (A[mitad] < dato) {
                inicio = mitad + 1;
            }else{
                fin = mitad - 1;
            }
        }
        return -1;
    }
}
