package ec.edu.ups.clases.practica02.villadavid.diazedisson;

import ec.edu.ups.clases.practica02.villadavid.diazedisson.Clases.Cantante;
import ec.edu.ups.clases.practica02.villadavid.diazedisson.Clases.Compositor;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        Cantante cantante = new Cantante();
        Compositor compositor = new Compositor();

        while (!salir) {
            System.out.println("Menú Principal");
            System.out.println("1. Ingreso de Cantante");
            System.out.println("2. Ingreso de Compositor");
            System.out.println("3. Agregar Clientes");
            System.out.println("4. Imprimir persona");
            System.out.println("5. Búsqueda de cantante por nombre de disco");
            System.out.println("6. Búsqueda de compositor por nombre de canción");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción que quiera: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cantante: ");
                    String nombreCantante = scanner.nextLine();

                    System.out.println("Cantante ingresado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del compositor: ");
                    String nombreCompositor = scanner.nextLine();

                    System.out.println("Compositor ingresado correctamente.");
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();

                    System.out.println("Cliente agregado correctamente.");
                    break;
                case 4:
                    System.out.println("Datos de la persona:");
                    if (cantante != null) {
                        System.out.println("Cantante: " + cantante.getNombre());
                    }
                    if (compositor != null) {
                        System.out.println("Compositor: " + compositor.getNombre());
                    }

                    break;
                case 5:
                    System.out.print("Ingrese el nombre del disco a buscar: ");
                    String nombreDisco = scanner.nextLine();

                    break;
                case 6:
                    System.out.print("Ingrese el nombre de la canción a buscar: ");
                    String nombreCancion = scanner.nextLine();

                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println(); // Línea en blanco para separar las opciones
        }

        System.out.println("¡Adios vuelva pronto!");
    }
}
