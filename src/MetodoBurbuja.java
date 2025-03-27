public class MetodoBurbuja {

    

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println(" ");
    }

    public int[] ordenar(int[] arreglo, boolean isDes, boolean pasos) {
        int contComparaciones=1;
        int contCambios=1;
        if(pasos){
            if (isDes) {
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("---- Pasada "+(i+1)+"----");
                    for (int j = i + 1; j < arreglo.length; j++) {
                        contComparaciones++;
                        System.out.println("Compara arreglo["+j+"] = "+arreglo[j]+"con arreglo["+(j+1)+"] = "+arreglo[j+1]);
                        if (arreglo[i] > arreglo[j]) {
                            System.out.println("Intercambia " + arreglo[j] + " y " + arreglo[j + 1]);
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i] = aux;
                            contCambios++;
                        }
    
                    }
    
                }

            } else {
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("---- Pasada "+(i+1)+"----");
                    for (int j = i + 1; j < arreglo.length; j++) {
                        contComparaciones++;
                        System.out.println("Compara arreglo["+j+"] = "+arreglo[j]+"con arreglo["+(j+1)+"] = "+arreglo[j+1]);
                        if (arreglo[i] < arreglo[j]) {
                            System.out.println("Intercambia " + arreglo[j] + " y " + arreglo[j + 1]);
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i] = aux;
                            contCambios++;
                        }
    
                    }
    
                }

            }
        }else{
            if (isDes) {
                for (int i = 0; i < arreglo.length; i++) {
                    for (int j = i + 1; j < arreglo.length; j++) {
                        contComparaciones++;
                        if (arreglo[i] > arreglo[j]) {
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i] = aux;
                            contCambios++;
                        }
    
                    }
                    
    
                }
               
            } else {
                for (int i = 0; i < arreglo.length; i++) {
                    for (int j = i + 1; j < arreglo.length; j++) {
                        contComparaciones++;
                        if (arreglo[i] < arreglo[j]) {
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i] = aux;
                            contCambios++;
                        }

                    }
    
                }
               
            }
        }
        

        int[] respuestas={contComparaciones,contCambios};
        return respuestas;
    }

}
