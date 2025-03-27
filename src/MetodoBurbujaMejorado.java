import java.util.Arrays;

public class MetodoBurbujaMejorado {
    public int[] burbujaMejorado(int[]arreglo, boolean isDes,boolean conPasos){

        int n = arreglo.length;
        int contComparaciones=1;
        int contCambios=1;
        if(conPasos){
                for (int i = 0; i < n - 1; i++) {
        System.out.println("\n--- Pasada " + contComparaciones++ + " ---");
        
        for (int j = 0; j < n - 1 - i; j++) {
            System.out.println("\nComparando: arreglo[" + j + "] = " + arreglo[j] + 
                           " vs arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);
            
            boolean debeIntercambiar;
            
            if (isDes) {
                debeIntercambiar = (arreglo[j] < arreglo[j + 1]); // Orden descendente
            } else {
                debeIntercambiar = (arreglo[j] > arreglo[j + 1]); // Orden ascendente
            }
            
            if (debeIntercambiar) {
                System.out.println("Intercambiando " + arreglo[j] + " y " + arreglo[j + 1]);
                
                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
                contCambios++;
                
                System.out.println("Nuevo estado del arreglo: " + Arrays.toString(arreglo));
            } else {
                System.out.println("No se intercambia (ya está en el orden correcto).");
            }
        }
    }
    
        }
        for (int i = 0; i < n-1; i++) {
            for (int j =0 ; j < n-1-i; j++) {
                contComparaciones++;
                if(isDes){
                    if (arreglo[j] > arreglo[j+1]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                        contCambios++;
                    }
                }else{
                    if (arreglo[j] < arreglo[j+1]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                        contCambios++;
                }


            }

            
        }
        

    }
    int[] respuestas={contComparaciones, contCambios};
    return respuestas;
}
}
