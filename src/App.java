import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        MetodoBurbuja metodoBurbujaClase = new MetodoBurbuja();
        MetodoSelection mS = new MetodoSelection();
        MetodoInserción mI = new MetodoInserción();
        MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            //int[] arreglo = { 10, 9, 21, 5, 15, 2, -1, 0 };
            int[] arreglo = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
            // int[] arreglo= new int[1000];
            // for(int i=0; i<arreglo.length; i++){
            // arreglo[i]=(int) (Math.random()*1000)+1;
            // }

            System.out.println("Seleccione el metodo de ordenamiento: ");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");
            // int metodo = scanner.nextInt();
            int metodo = getPositive(scanner, "\t Ingrese la opcion:  ");

            if (metodo == 5) {
                System.out.println("Gracias por usar");
                continuar = false;
                break;
            } else if (metodo > 5) {
                System.out.println("Opción Invalida");
            } else {
                String orden = gerValidString(scanner, new String[] { "A", "D" },
                        "¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
                boolean ascendente = orden.equalsIgnoreCase("A");

                String conPasos = gerValidString(scanner, new String[] { "S", "N" }, "¿Desea ver los pasos? (S/N):");
                boolean Si = conPasos.equalsIgnoreCase("S");

                int contComparaciones;
                int[] resultados;

                switch (metodo) {
                    case 1:
                        System.out.println("Metodo Burbuja");
                        System.out.print("Arreglo Original: ");
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        resultados = metodoBurbujaClase.ordenar(arreglo, ascendente, Si);
                        System.out.print("Arreglo Ordenado: ");
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        System.out.println("Comparaciones --> " + resultados[0]);
                        System.out.println("Cambios --> " + resultados[1]);
                        break;
                    case 2:
                        System.out.println("Metodo Selección");
                        System.out.print("Arreglo Original: ");
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        resultados = mS.ordenarSeleccion(arreglo, ascendente, Si);
                        System.out.print("Arreglo Ordenado: ");
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        System.out.println("Comparaciones --> " + resultados[0]);
                        System.out.println("Cambios --> " + resultados[1]);
                        break;
                    case 3:
                        System.out.println("Metodo Insersión");
                        System.out.print("Arreglo Original -> ");
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        contComparaciones = mI.ordenarAscInserción(arreglo, ascendente, Si);
                        System.out.print("Arreglo Ordenado-> ");
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        System.out.println("Comparaciones -> " + contComparaciones);
                        break;
                    case 4:
                        System.out.println("Metodo Burbuja Mejorado");
                        System.out.print("Arreglo Original -> ");
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        resultados = mBM.burbujaMejorado(arreglo, ascendente, Si);
                        System.out.print("Arreglo Ordenado -> ");
                        metodoBurbujaClase.imprimirArreglo(arreglo);
                        System.out.println("Comparaciones --> " + resultados[0]);
                        System.out.println("Cambios --> " + resultados[1]);
                    default:
                        System.out.println("Opción fuera de rango");
                        break;
                }
            }

        }

    }

    // System.out.println("¿Desea ver los pasos? (true/false):");
    // boolean conPasos =scanner.nextBoolean();

    /*
     * System.out.
     * println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
     * String order=scanner.next();
     * boolean ascendente = order.equalsIgnoreCase("A");/*
     */

    public static int getPositive(Scanner scanner, String message) {
        int number;
        do {
            System.out.println(message + ": ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("El número no puede ser negativo");
            }
        } while (number <= 0);
        return number;
    }

    public static String gerValidString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido;

        do {
            System.out.println(message + ": ");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }

        } while (!valido);
        return input;
    }

}
