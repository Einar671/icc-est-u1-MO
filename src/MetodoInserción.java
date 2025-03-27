public class MetodoInserción {
    // ascentende y descendente
    public int ordenarAscInserción(int arreglo[], boolean isDes, boolean pasos) {
        int contComparaciones=1;
        
        if (pasos) {
            for (int i = 1; i < arreglo.length; i++) {
                int auxi = arreglo[i];
                int j = i - 1;
                System.out.println("i: " + i + " j: " + j + " aux: " + auxi);
                System.out.println("Compara aux: " + auxi + " con arreglo[" + j + "]");
                imprimirArreglo(arreglo);
                if (isDes) {
                    while (j >= 0 && auxi < arreglo[j]) {
                        contComparaciones++;
                        System.out.println("Mueve arreglo[" + j + "] a arreglo[" + i + "]");
                        arreglo[j + 1] = arreglo[j];
                        j = j - 1;
                    }
                    System.out.println("Inserta aux: " + 9 + " en la posición " + j);
                    arreglo[j + 1] = auxi;
                    System.out.print("Estado Actual: ");
                    imprimirArreglo(arreglo);
                } else {
                    while (j >= 0 && auxi > arreglo[j]) {
                        contComparaciones++;
                        arreglo[j + 1] = arreglo[j];
                        j = j - 1;
                    }
                    arreglo[j + 1] = auxi;
                }

            }
        } else {
            for (int i = 1; i < arreglo.length; i++) {
                int auxi = arreglo[i];
                int j = i - 1;
                contComparaciones++;
                if (isDes) {
                    while (j >= 0 && auxi < arreglo[j]) {
                        contComparaciones++;
                        arreglo[j + 1] = arreglo[j];
                        j = j - 1;
                    }
                    arreglo[j + 1] = auxi;
                } else {
                    while (j >= 0 && auxi > arreglo[j]) {
                        contComparaciones++;
                        arreglo[j + 1] = arreglo[j];
                        j = j - 1;
                    }
                    arreglo[j + 1] = auxi;
                }

            }

        }
        return contComparaciones;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println(" ");
    }
}
