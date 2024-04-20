import Electronico.*;
import Articulo.Articulo;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Electronico> listaDeElectronicos = new ArrayList<Electronico>();

    public static void main(String[] args) {
        menuSeleccion();
    }

    static void menuSeleccion(){

        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            menu();
            try{
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 0) {
                    System.out.println("Saliendo del programa");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarElectronico();
                        break;
                    case 2:
                        modificarElectronico();
                        break;
                    case 3:
                        mostrarTodosElectronico();
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opcion valida.");
                        break;
                }
            }catch (InputMismatchException e){
                sn.nextLine();
                System.out.println("Por favor, ingrese una opcion valida.");
            }
        }

    }

    private static void mostrarTodosElectronico() {
        System.out.println("#, Nombre, Modelo, Costo");

        for (int i = 0; i < listaDeElectronicos.size(); i++) {
            Electronico elec = listaDeElectronicos.get(i);
            System.out.println((i+1)+"| "+elec.getNombre()+"| "+elec.getModelo()+"| $"+elec.precio());
        }
        System.out.println("\n");
    }



    private static void modificarElectronico() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el ID del Electronico a modificar:");
        String ID = sn.nextLine();

        for (int i = 0; i < listaDeElectronicos.size(); i++) {
            if (listaDeElectronicos.get(i).getID().equals(ID)){
                System.out.print("Precio de "+listaDeElectronicos.get(i).getNombre()+" : $");
                float nuevoCosto = sn.nextFloat();

                listaDeElectronicos.get(i).setCostoBase(nuevoCosto);

                System.out.println("Precio "+listaDeElectronicos.get(i).getNombre()+" actualizado");

                return;
            }
        }
    }

    private static void agregarElectronico(){
        int tipoElectronico = obtenerTipoElectronico();
        Electronico Electronico = null;
        Scanner sn = new Scanner(System.in);


        System.out.println("Ingrese el Modelo del Electronico :");
        String Modelo = sn.nextLine();
        System.out.println("Ingrese el nombre del Electronico:");
        String nombre = sn.nextLine();

        Articulo Articulo = new Articulo(Modelo, nombre);

        System.out.println("Ingrese el ID del Electronico:");
        String ID = sn.nextLine();
        System.out.print("Ingrese el precio del Electronico $");
        float Costo = sn.nextFloat();
        sn.nextLine();

        switch (tipoElectronico){
            case 1:
                Electronico = new Telefono(Articulo, ID, Costo);
                break;
            case 2:
                System.out.println("Ingrese el impuesto del  Electronico:");
                int impuesto = sn.nextInt();

                Electronico = new Laptop(Articulo, ID, Costo, impuesto);
                break;
        }

        listaDeElectronicos.add(Electronico);
    }

    private static int obtenerTipoElectronico() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true) {
            try {
                System.out.println("Seleccione el tipo de Electronico:\n"
                        + "1. telefono\n"
                        + "2. laptop\n"
                );
                System.out.print("Opciones:  ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 2) return opcion;
                System.out.println("Ingrese una opcion");
            } catch (Exception e) {
                System.out.println("Opcion invalida, intente otra vez ");
            }
            sn.nextLine();
        }

    }
    static void menu(){
        System.out.println("Seleccione una opcion:\n"
                + "\t1. Agregar Electronico\n"
                + "\t2. Modificar Electronico\n"
                + "\t3. Mostrar todos los Electronico\n"
                + "\t0. Salir del programa\n"
        );
        System.out.print("Opciones : ");
    }
}