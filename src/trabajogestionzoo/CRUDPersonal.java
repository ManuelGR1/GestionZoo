package trabajogestionzoo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ManuelRamon
 */
public class CRUDPersonal {
    
     /*Una Tabla Hash es una estructura de datos que pretende la insercion,busqueda y borrado de elementos en tiempo constante*/
    private static final Hashtable<String, Administrativo> AdministrativoTable = new Hashtable<String, Administrativo>();
    private static final Hashtable<String, Cuidador> CuidadorTable = new Hashtable<String, Cuidador>();
    private static final Hashtable<String, Mantenimiento> MantenimientoTable = new Hashtable<String, Mantenimiento>();
    
    public static void CRUDdePersonas() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false; //Para capturar excepciones
        int opcion;
        while (!salir) {
            System.out.println("   ---Menu Gestion Personal---");
            System.out.println("1.-Alta empleado");
            System.out.println("2.-Editar empleado");
            System.out.println("3.-Mostrar empleado");
            System.out.println("4.-Baja empleado");
            System.out.println("0.-Salir de Gestión del personal");
            System.out.println("--------------------------------");
            System.out.println("Introduce una opción");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("--------------------------------------");
                        System.out.println("---Ha seleccionado alta de empleado---");
                        System.out.println("      ---Seleccione el empleado---");
                        System.out.println("1. Administrativo");
                        System.out.println("2. Cuidador");
                        System.out.println("3. Mantenimiento");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                CrearAdministrativo();
                                break;
                            case 2:
                                CrearCuidador();
                                break;
                            case 3:
                                CrearMantenimiento();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("-------------------------------------");
                        System.out.println("---Ha seleccionado editar empleado---");
                        System.out.println("     ---Seleccione el empleado---");
                        System.out.println("1. Administrativo");
                        System.out.println("2. Cuidador");
                        System.out.println("3. Mantenimiento");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                EditarAdministrativo();
                                break;
                            case 2:
                                EditarCuidador();
                                break;
                            case 3:
                                EditarMantenimiento();
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("---------------------------------------");
                        System.out.println("---Ha seleccionado mostrar empleado---");
                        System.out.println("     ---Seleccione el empleado---");
                        System.out.println("1. Administrativo");
                        System.out.println("2. Cuidador");
                        System.out.println("3. Mantenimiento");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                MostrarAdministrativo();
                                break;
                            case 2:
                                MostrarCuidador();
                                break;
                            case 3:
                                MostrarMantenimiento();
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("------------------------------------");
                        System.out.println("---Ha seleccionado baja empleado---");
                        System.out.println("    ---Seleccione el empleado---");
                        System.out.println("1. Administrativo");
                        System.out.println("2. Cuidador");
                        System.out.println("3. Mantenimiento");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                BajaAdministrativo();
                                break;
                            case 2:
                                BajaCuidador();
                                break;
                            case 3:
                                BajaMantenimiento();
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("-------------------------------");
                        System.out.println("Salimos de gestión del personal");
                        System.out.println("-------------------------------");
                        salir = true;
                        break;
                    default:
                        System.out.println("------------------------");
                        System.out.println("Solo números entre 1 y 4");
                        System.out.println("------------------------");
                }
            } catch (InputMismatchException e) {//esta excepción salta cuando no lo introducido no se puede convertir a numero.
                sc.next(); //Ponemos sc.next() para evitar que entre en un bucle infinito, solo si se usa Scanner.
                System.out.println("------------------------------");
                System.out.println("Debe introducir valor numerico");
                System.out.println("------------------------------");
            }
        }
    }//fin de CRUDdePersonas

    public static void CrearAdministrativo()  {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos;
        int SalarioMensual;
        System.out.println("--------------------------");
        System.out.println("Introduce el nombre");
        nombre = sc.next();
        System.out.println("Introduce el apellido");
        apellidos = sc.next();
        System.out.println("Introduce salario mensual");
        SalarioMensual = sc.nextInt();
        
        Administrativo A1 = new Administrativo(nombre, apellidos, SalarioMensual);
        AdministrativoTable.put(nombre, A1);
    }//fin de método para crear administrativo

    public static void CrearCuidador() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos;
        int SalarioMensual;
        System.out.println("--------------------------");
        System.out.println("Introduce el nombre");
        nombre = sc.next();
        System.out.println("Introduce el apellido");
        apellidos = sc.next();
        System.out.println("Introduce salario mensual");
        SalarioMensual = sc.nextInt();
        
        Cuidador C1 = new Cuidador(nombre, apellidos, SalarioMensual);
        CuidadorTable.put(nombre, C1);
    }//fin de método para crear cuidador

    public static void CrearMantenimiento() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos;
        int SalarioMensual;
        System.out.println("--------------------------");
        System.out.println("Introduce el nombre");
        nombre = sc.next();
        System.out.println("Introduce el apellido");
        apellidos = sc.next();
        System.out.println("Introduce salario mensual");
        SalarioMensual = sc.nextInt();

        Mantenimiento C1 = new Mantenimiento(nombre, apellidos, SalarioMensual);
        MantenimientoTable.put(nombre, C1);
    }//fin de método para crear Mantenimiento

    public static void EditarAdministrativo() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false; //Para capturar excepciones
        String nombre, apellidos, clave;
        int SalarioMensual;
        int opcion;
        while (!salir) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Introduce nombre del empleado administrativo que desea modificar");
            clave = sc.nextLine();
            System.out.println("------------------------------------------------");
            System.out.println("¿Qué desea modificar de la persona seleccionada?");
            System.out.println("1.- Modicar nombre");
            System.out.println("2.- Modicar apellido");
            System.out.println("3.- Modicar SalarioMensual");
            System.out.println("4.- Salir");
            System.out.println("Seleccione una opción:");
            opcion = sc.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Inserte el nombre de la persona");
                        sc.nextLine();
                        nombre = sc.next();
                        AdministrativoTable.get(clave).setNombre(nombre);
                        System.out.println("El nuevo nombre es: " + nombre);
                        break;
                    case 2:
                        System.out.println("Inserte el nuevo apellido de la persona");
                        sc.nextLine();
                        apellidos = sc.nextLine();
                        AdministrativoTable.get(clave).setapellidos();
                        System.out.println("El nuevo apellido es: " + apellidos);
                        break;
                    case 3:
                        System.out.println("Inserte el nuevo salario mensual");
                        sc.nextLine();
                        SalarioMensual = sc.nextInt();
                        AdministrativoTable.get(clave).setSalarioMensual();
                        System.out.println("El nuevo salario mensual es:  " + SalarioMensual);
                        break;
                    case 4:
                        System.out.println(" ");
                        System.out.println("salimos del programa");
                        salir = true;
                        break;
                    default:
                        System.out.println("------------------------");
                        System.out.println("Solo numeros entre 1 y 3");
                        System.out.println("------------------------");
                }
            } catch (InputMismatchException e) {//esta excepcion salta cuando no lo introducido no se puede convertir a numero.
                sc.next(); //Ponemos sc.next() para evitar que entre en un bucle infinito, solo si se usa Scanner.
                System.out.println("---------------------------------------------------------");
                System.out.println("Debe elegir una de las opciones mostradas(valor numerico)");
                System.out.println("---Le muestro nuevamente el menu---");
                System.out.println(" ");
            }
        }
    }//fin de método EditarEmpleado

    public static void EditarCuidador() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false; //Para capturar excepciones
        String nombre, apellidos, clave;
        int SalarioMensual;
        int opcion;
        while (!salir) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Introduce nombre del empleado cuidador que desea modificar");
            clave = sc.nextLine();
            System.out.println("------------------------------------------------");
            System.out.println("¿Qué desea modificar de la persona seleccionada?");
            System.out.println("1.- Modicar nombre");
            System.out.println("2.- Modicar apellido");
            System.out.println("3.- Modicar salario mensual");
            System.out.println("4.- Salir");
            System.out.println("Seleccione una opción:");
            opcion = sc.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Inserte el nombre de la persona");
                        sc.nextLine();
                        nombre = sc.next();
                        CuidadorTable.get(clave).setNombre(nombre);
                        System.out.println("El nuevo nombre es: " + nombre);
                        break;
                    case 2:
                        System.out.println("Inserte el nuevo apellido de la persona");
                        sc.nextLine();
                        apellidos = sc.nextLine();
                        CuidadorTable.get(clave).setapellidos();
                        System.out.println("El nuevo apellido es: " + apellidos);
                        break;
                    case 3:
                        System.out.println("Inserte el nuevo salario mensual");
                        sc.nextLine();
                        SalarioMensual = sc.nextInt();
                        CuidadorTable.get(clave).setSalarioMensual();
                        System.out.println("El nuevo salario mensual es:  " + SalarioMensual);
                        break;
                    case 4:
                        System.out.println(" ");
                        System.out.println("salimos del programa");
                        salir = true;
                        break;
                    default:
                        System.out.println("------------------------");
                        System.out.println("Solo numeros entre 1 y 3");
                        System.out.println("------------------------");
                }
            } catch (InputMismatchException e) {//esta excepcion salta cuando no lo introducido no se puede convertir a numero.
                sc.next(); //Ponemos sc.next() para evitar que entre en un bucle infinito, solo si se usa Scanner.
                System.out.println("---------------------------------------------------------");
                System.out.println("Debe elegir una de las opciones mostradas(valor numerico)");
                System.out.println("---Le muestro nuevamente el menu---");
                System.out.println(" ");
            }
        }
    }//fin de método EditarCuidador

    public static void EditarMantenimiento() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false; //Para capturar excepciones
        String nombre, apellidos, clave;
        int SalarioMensual;
        int opcion;
        while (!salir) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Introduce nombre del empleado de mantenimiento que desea modificar");
            clave = sc.nextLine();
            System.out.println("------------------------------------------------");
            System.out.println("¿Qué desea modificar de la persona seleccionada?");
            System.out.println("1.- Modicar nombre");
            System.out.println("2.- Modicar apellido");
            System.out.println("3.- Modicar salario mensual");
            System.out.println("4.- Salir");
            System.out.println("Seleccione una opción:");
            opcion = sc.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Inserte el nombre de la persona");
                        sc.nextLine();
                        nombre = sc.next();
                        MantenimientoTable.get(clave).setNombre(nombre);
                        System.out.println("El nuevo nombre es: " + nombre);
                        break;
                    case 2:
                        System.out.println("Inserte el nuevo apellido de la persona");
                        sc.nextLine();
                        apellidos = sc.nextLine();
                        MantenimientoTable.get(clave).setapellidos();
                        System.out.println("El nuevo apellido es: " + apellidos);
                        break;
                    case 3:
                        System.out.println("Inserte el nuevo empleo");
                        sc.nextLine();
                        SalarioMensual = sc.nextInt();
                        MantenimientoTable.get(clave).SalarioMensual(SalarioMensual);
                        System.out.println("El nuevo empleo es:  " + SalarioMensual);
                        break;
                    case 4:
                        System.out.println(" ");
                        System.out.println("salimos del programa");
                        salir = true;
                        break;
                    default:
                        System.out.println("------------------------");
                        System.out.println("Solo numeros entre 1 y 3");
                        System.out.println("------------------------");
                }
            } catch (InputMismatchException e) {//esta excepcion salta cuando no lo introducido no se puede convertir a numero.
                sc.next(); //Ponemos sc.next() para evitar que entre en un bucle infinito, solo si se usa Scanner.
                System.out.println("---------------------------------------------------------");
                System.out.println("Debe elegir una de las opciones mostradas(valor numerico)");
                System.out.println("---Le muestro nuevamente el menu---");
                System.out.println(" ");
            }
        }
    }//fin de método EditarMantenimiento

    public static void MostrarAdministrativo() {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Introduce el nombre del administrativo que quieres consultar");
        nombre = sc.next();

        Enumeration indice = AdministrativoTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (nombre.equalsIgnoreCase((String) clave)) {
                System.out.println("---------------------");
                System.out.println(AdministrativoTable.get(clave));
            } else {
                System.out.println("-----------------------------");
                System.out.println("La persona no está registrada");
                System.out.println(" ");
            }
        }
    }//Fin de metodo MostrarAdministrativo

    public static void MostrarCuidador() {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("Introduce el nombre del cuidador que quieres consultar");
        nombre = sc.next();

        Enumeration indice = CuidadorTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (nombre.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------------");
                System.out.println(CuidadorTable.get(clave));
            } else {
                System.out.println("-----------------------------");
                System.out.println("La persona no está registrada");
                System.out.println(" ");
            }
        }
    }//Fin de metodo MostrarCuidador

    public static void MostrarMantenimiento() {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Introduce el nombre de la persona de mantenimiento que quieres consultar");
        nombre = sc.next();

        Enumeration indice = MantenimientoTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (nombre.equalsIgnoreCase((String) clave)) {
                System.out.println("---------------------------");
                System.out.println(MantenimientoTable.get(clave));
            } else {
                System.out.println("-----------------------------");
                System.out.println("La persona no está registrada");
                System.out.println(" ");
            }
        }
    }//Fin de metodo MostrarMantenimiento

    public static void BajaAdministrativo() {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Introduce el nombre del administrativo que quieres dar de baja");
        System.out.println(" ");
        nombre = sc.next();

        Enumeration indice = AdministrativoTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (nombre.equalsIgnoreCase((String) clave)) {
                System.out.println("------------------------------------------------------");
                System.out.println("La persona " + clave + " ha sido eliminado del sistema");
                System.out.println("------------------------------------------------------");
                AdministrativoTable.remove(clave);
            } else {
                System.out.println("-----------------------------");
                System.out.println("La persona no está registrada");
                System.out.println(" ");
            }
        }
    }//Fin metodo BajaAdministrativo

    public static void BajaCuidador() {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Introduce el nombre del administrativo que quieres dar de baja");
        System.out.println(" ");
        nombre = sc.next();

        Enumeration indice = CuidadorTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (nombre.equalsIgnoreCase((String) clave)) {
                System.out.println("------------------------------------------------------");
                System.out.println("La persona " + clave + " ha sido eliminado del sistema");
                System.out.println("------------------------------------------------------");
                CuidadorTable.remove(clave);
            } else {
                System.out.println("-----------------------------");
                System.out.println("La persona no está registrada");
                System.out.println(" ");
            }
        }
    }//Fin metodo BajaAdministrativo

    public static void BajaMantenimiento() {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Introduce el nombre de la persona de mantenimiento que quieres dar de baja");
        System.out.println(" ");
        nombre = sc.next();

        Enumeration indice = MantenimientoTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (nombre.equalsIgnoreCase((String) clave)) {
                System.out.println("------------------------------------------------------");
                System.out.println("La persona " + clave + " ha sido eliminado del sistema");
                System.out.println("------------------------------------------------------");
                MantenimientoTable.remove(clave);
            } else {
                System.out.println("-----------------------------");
                System.out.println("La persona no está registrada");
                System.out.println(" ");
            }
        }
    }//Fin metodo BajaMantenimiento

}//fin de clase CRUDPersonal

