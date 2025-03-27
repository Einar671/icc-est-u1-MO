public class MetodoSelection {
    public int[] ordenarSeleccion(int[] arreglo, boolean isDes, boolean pasos) {
        int contCambios=1;
        int contComparaciones=1;

        if (pasos) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                System.out.println("--- Pasada " + (i + 1) + " ---");
                for (int j = 0; j < arreglo.length - 1 - i; j++) {
                    contComparaciones++;
                    System.out.println("Compara arreglo[" + j + "] = " + arreglo[j] + 
                                     " con arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);
                    
                    if (isDes) { // Orden descendente
                        if (arreglo[j] < arreglo[j + 1]) {
                            System.out.println("Intercambia " + arreglo[j] + " y " + arreglo[j + 1]);
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[j + 1];
                            arreglo[j + 1] = aux;
                            contCambios++;
                        }
                    } else { // Orden ascendente (por defecto)
                        if (arreglo[j] > arreglo[j + 1]) {
                            System.out.println("Intercambia " + arreglo[j] + " y " + arreglo[j + 1]);
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[j + 1];
                            arreglo[j + 1] = aux;
                            contCambios++;
                        }
                    }
                    
                    System.out.print("Estado actual: ");
                }
            }
        
        } else {
            if (isDes) {
                for (int i = 0; i < arreglo.length - 1; i++) {
                    int maxIdx = i;
                    for (int j = i + 1; j < arreglo.length; j++) {
                        contComparaciones++;
                        if (arreglo[maxIdx] > arreglo[j]) {
                            maxIdx = j;
                        }

                    }
                    if (maxIdx != i) {
                        int aux = arreglo[maxIdx];
                        arreglo[maxIdx] = arreglo[i];
                        arreglo[i] = aux;
                        contCambios++;
                    }
                }

            } else {
                for (int i = 0; i < arreglo.length - 1; i++) {
                    int maxIdx = i;
                    for (int j = i + 1; j < arreglo.length; j++){ 
                        contComparaciones++;
                        if (arreglo[maxIdx] < arreglo[j]) {
                            maxIdx = j;
                        }

                    }
                    if (maxIdx != i) {
                        int aux = arreglo[maxIdx];
                        arreglo[maxIdx] = arreglo[i];
                        arreglo[i] = aux;
                        contCambios++;
                    }
                }
            }
        }
        int[] respuestas={contComparaciones, contCambios};
        return respuestas;

    }

}
