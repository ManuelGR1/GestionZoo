package trabajogestionzoo;

/**
 *
 * @author ManuelRamon
 */

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CRUDMateriales {

    private static final Hashtable<String, Alimentacion> AlimentacionTable = new Hashtable<String, Alimentacion>();
    private static final Hashtable<String, Decoracion> DecoracionTable = new Hashtable<String, Decoracion>();
    private static final Hashtable<String, Utensilios> UtensiliosTable = new Hashtable<String, Utensilios>();

    public static void CRUDdeMateriales() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int option;
        int option2;
        int option3;
        int option4;

        while (!salir) {
            System.out.println("---Menu Gestion Materiales---");
            System.out.println("1.-Alta de material");
            System.out.println("2.-Editar material");
            System.out.println("3.-Mostrar material");
            System.out.println("4.-Baja de material");
            System.out.println("0.-Salir de gestion de materiales");
            System.out.println("---------------------------------");
            System.out.println("Introduce una opcion");
            try {
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("-------------");
                        System.out.println("Ha seleccionado alta de material");
                        System.out.println("Seleccione el Material que desea Crear:");
                        System.out.println("1. Alimentacion");
                        System.out.println("2. Decoracion");
                        System.out.println("3. Utensilios");
                        System.out.println("Introduce una opcion");
                        option2 = sc.nextInt();
                        switch (option2) {

                            case 1:
                                crearAlimentacion();
                                break;
                            case 2:
                                crearDecoracion();
                                break;
                            case 3:
                                crearUtensilios();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("-------------");
                        System.out.println("Ha seleccionado editar material");
                        System.out.println("Seleccione el Material que desea editar:");
                        System.out.println("1. Alimentacion");
                        System.out.println("2. Decoracion");
                        System.out.println("3. Utensilios");
                        System.out.println("Introduce una opcion");
                        option3 = sc.nextInt();
                        switch (option3) {
                            case 1:
                                editarAlimentacion();
                                break;
                            case 2:
                                editarDecoracion();
                                break;
                            case 3:
                                editarUtensilios();
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("-------------");
                        System.out.println("Ha seleccionado mostrar material");
                        System.out.println("Seleccione el Material que desea mostrar:");
                        System.out.println("1. Alimentacion");
                        System.out.println("2. Decoracion");
                        System.out.println("3. Utensilios");
                        System.out.println("Introduce una opcion");
                        option4 = sc.nextInt();
                        switch (option4) {
                            case 1:
                                mostrarAlimentacion();
                                break;
                            case 2:
                                mostrarDecoracion();
                                break;
                            case 3:
                                mostrarUtensilios();
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("-------------");
                        System.out.println("Ha seleccionado baja de un material");
                        System.out.println("Seleccione el Material que desea dar de baja:");
                        System.out.println("1. Alimentacion");
                        System.out.println("2. Decoracion");
                        System.out.println("3. Utensilios");
                        System.out.println("Introduce una opcion");
                        option4 = sc.nextInt();
                        switch (option4) {
                            case 1:
                                bajaAlimentacion();
                                break;
                            case 2:
                                bajaDecoracion();
                                break;
                            case 3:
                                bajaUtensilios();
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("---------------------------------");
                        System.out.println("Salir de gestion de materiales");
                        System.out.println("---------------------------------");
                        salir = true;
                        break;
                    default:
                        System.out.println("------------------------");
                        System.out.println("Solo numeros entre 1 y 3");
                        System.out.println("------------------------");
                }
            } catch (InputMismatchException e) {//esta excepciÃ³n salta cuando no lo introducido no se puede convertir a numero.
                sc.next(); //Ponemos sc.next() para evitar que entre en un bucle infinito, solo si se usa Scanner.
                System.out.println("---------------------------------------------------------");
                System.out.println("Debe elegir una de las opciones mostradas(valor numerico)");
                System.out.println("---Le muestro nuevamente el menu---");
                System.out.println(" ");
            }
        }
    }//Fin CRUDdeMateriales

    public static void crearAlimentacion() {
        boolean error = true;
        String refAlimentacion, tipoAlimentacion, animal;
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Introduce la referencia de la alimentacion");
        refAlimentacion = sc.next();
        System.out.println("Introduce tipo de alimentacion");
        tipoAlimentacion = sc.next();
        System.out.println("¿Para que animal es?");
        sc.nextLine();
        animal = sc.nextLine();

        Alimentacion a1 = new Alimentacion(refAlimentacion, tipoAlimentacion, animal);
        AlimentacionTable.put(refAlimentacion, a1);

    }//fin del metodo crearAlimentacion

    public static void crearDecoracion() {
        boolean error = true;
        String refMaterial, tipoMaterial, paisaje;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("Introduce la referencia de la decoracion");
        refMaterial = sc.next();
        System.out.println("Introduce tipo de decoracion");
        tipoMaterial = sc.next();
        System.out.println("¿Para que paisaje es?");
        sc.nextLine();
        paisaje = sc.nextLine();

        Decoracion d1 = new Decoracion(refMaterial, tipoMaterial, paisaje);
        DecoracionTable.put(refMaterial, d1);

    }//fin del metodo crearDecoracion

    public static void crearUtensilios() {
        boolean error = true;
        String refMaterial, tipoMaterial, nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Introduce la referencia del utensilio");
        refMaterial = sc.next();
        System.out.println("Introduce tipo de utensilio");
        tipoMaterial = sc.next();
        System.out.println("Introduce el nombre del utensilio");
        sc.nextLine();
        nombre = sc.nextLine();

        Utensilios u1 = new Utensilios(refMaterial, tipoMaterial, nombre);
        UtensiliosTable.put(refMaterial, u1);

    }//fin del metodo crearUtensilios

    public static void editarAlimentacion() {
        Scanner sc = new Scanner(System.in);
        String refMaterial, tipoMaterial, animal, claveaux;
        boolean salir = false; //Para capturar excepciones
        int opcion;
        while (!salir) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Introduce la referencia de la alimentacion que desea modificar");
            claveaux = sc.nextLine();
            System.out.println("-----------------------------------------------------");
            System.out.println("¿Que desea modificar de la alimentacion seleccionado?");
            System.out.println("1.- Modicar la referencia");
            System.out.println("2.- Modicar tipo de alimentacion");
            System.out.println("3.- Modicar tipo de animal");
            System.out.println("4.- Salir");
            System.out.println("Seleccione una opcion:");
            opcion = sc.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Inserte la nueva referencia");
                        sc.nextLine();
                        refMaterial = sc.next();
                        AlimentacionTable.get(claveaux).setRefMaterial(refMaterial);
                        System.out.println("La nueva referencia de la alimentacion es: " + refMaterial);
                        break;
                    case 2:
                        System.out.println("Inserte el nuevo tipo de alimentacion");
                        sc.nextLine();
                        tipoMaterial = sc.nextLine();
                        AlimentacionTable.get(claveaux).setTipoMaterial(tipoMaterial);
                        System.out.println("El nuevo tipo de alimentacion es " + tipoMaterial);
                        break;
                    case 3:
                        System.out.println("Inserte el nuevo tipo de animal");
                        sc.nextLine();
                        animal = sc.nextLine();
                        AlimentacionTable.get(claveaux).setAnimal(animal);
                        System.out.println("El nuevo tipo de animal es " + animal);
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
            } catch (InputMismatchException e) {//esta excepciÃ³n salta cuando no lo introducido no se puede convertir a numero.
                sc.next(); //Ponemos sc.next() para evitar que entre en un bucle infinito, solo si se usa Scanner.
                System.out.println("---------------------------------------------------------");
                System.out.println("Debe elegir una de las opciones mostradas(valor numerico)");
                System.out.println("---Le muestro nuevamente el menu---");
                System.out.println(" ");
            }
        }
    }

    private static void editarDecoracion() {
        String refMaterial, tipoMaterial, paisaje, claveaux;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Introduce la referencia del paisaje que desea modificar");
        claveaux = sc.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("�que desea modificar del paisaje seleccionado?");
        System.out.println("1.- Modicar la referencia");
        System.out.println("2.- Modicar tipo de paisaje");
        System.out.println("3.- Modicar el paisaje al que pertenece");
        System.out.println("4.- Salir");
        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Inserte la nueva referencia");
                sc.nextLine();
                refMaterial = sc.next();
                DecoracionTable.get(claveaux).setRefMaterial(refMaterial);
                System.out.println("La nueva referencia del material es: " + refMaterial);
                break;
            case 2:
                System.out.println("Inserte el nuevo tipo de paisaje");
                sc.nextLine();
                tipoMaterial = sc.nextLine();
                DecoracionTable.get(claveaux).setTipoMaterial(tipoMaterial);
                System.out.println("El nuevo tipo de paisaje es " + tipoMaterial);
                break;
            case 3:
                System.out.println("Inserte el nuevo paisaje al que pertenece");
                sc.nextLine();
                paisaje = sc.nextLine();
                DecoracionTable.get(claveaux).setPaisaje(paisaje);
                System.out.println("El nuevo paisaje al que pertenece es " + paisaje);
                break;
            case 4:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }//fin del metodo EditarDecoracion()

    private static void editarUtensilios() {

        String refMaterial, tipoMaterial, nombre, claveaux;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Introduce la referencia del utensilio que desea modificar");
        claveaux = sc.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("�que desea modificar del utensilio seleccionado?");
        System.out.println("1.- Modicar la referencia");
        System.out.println("2.- Modicar tipo de utensilio");
        System.out.println("3.- Modicar el nombre");
        System.out.println("4.- Salir");
        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Inserte la nueva referencia");
                sc.nextLine();
                refMaterial = sc.next();
                UtensiliosTable.get(claveaux).setRefMaterial(refMaterial);
                System.out.println("La nueva referencia del material es: " + refMaterial);
                break;
            case 2:
                System.out.println("Inserte el nuevo tipo de utensilio");
                sc.nextLine();
                tipoMaterial = sc.nextLine();
                UtensiliosTable.get(claveaux).setTipoMaterial(tipoMaterial);
                System.out.println("El nuevo tipo de utensilio es " + tipoMaterial);
                break;
            case 3:
                System.out.println("Inserte el nuevo nombre");
                sc.nextLine();
                nombre = sc.nextLine();
                UtensiliosTable.get(claveaux).setNombre(nombre);
                System.out.println("El nuevo nombre es " + nombre);
                break;
            case 4:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }//fin del metodo EditarAlimentacion

    public static void mostrarAlimentacion() {
        String refMaterial;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce la referencia de la Alimentacion que quieres consultar");
        refMaterial = sc.next();

        Enumeration indice = AlimentacionTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (refMaterial.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println(AlimentacionTable.get(clave));

            } else {
                System.out.println("------------------------------");
                System.out.println("El material no esta registrado");
            }
        }

    } // Fin del metodo mostrar alimentacion

    public static void mostrarDecoracion() {
        String refMaterial;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Introduce la referencia de la decoracion que quieres consultar");
        refMaterial = sc.next();

        Enumeration indice = DecoracionTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (refMaterial.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println(DecoracionTable.get(clave));

            } else {
                System.out.println("--------------------------------");
                System.out.println("La decoracion no esta registrada");
            }
        }

    }// Fin del metodo mostrar Decoracion

    public static void mostrarUtensilios() {
        String refMaterial;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Introduce la referencia del utensilio que quieres consultar");
        refMaterial = sc.next();

        Enumeration indice = UtensiliosTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (refMaterial.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println(UtensiliosTable.get(clave));

            } else {
                System.out.println("-------------------------------");
                System.out.println("El utensilio no esta registrado");
            }
        }

    }// Fin del metodo mostrar Utensilios

    public static void bajaAlimentacion() {
        String refMaterial;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce la referencia que quieres dar de baja");
        refMaterial = sc.next();

        Enumeration indice = AlimentacionTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (refMaterial.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println("La alimentacion " + clave + " ha sido eliminado del sistema");
                AlimentacionTable.remove(clave);
            } else {
                System.out.println("----------------");
                System.out.println("La alimentacion no esta registrada");
            }
        }
    } // Fin del metodo bajaAlimentacion

    public static void bajaDecoracion() {
        String refMaterial;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce la referencia que quieres dar de baja");
        refMaterial = sc.next();

        Enumeration indice = DecoracionTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (refMaterial.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println("La decoracion " + clave + " ha sido eliminada del sistema");
                DecoracionTable.remove(clave);
            } else {
                System.out.println("----------------");
                System.out.println("La decoracion no esta registrada");
            }
        }
    } // Fin del metodo bajaDecoracion

    public static void bajaUtensilios() {
        String refMaterial;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce la referencia que quieres dar de baja");
        refMaterial = sc.next();

        Enumeration indice = UtensiliosTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (refMaterial.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println("El utensilio " + clave + " ha sido eliminado del sistema");
                UtensiliosTable.remove(clave);
            } else {
                System.out.println("----------------");
                System.out.println("El utensilio no esta registrado");
            }
        }
    } // Fin del metodo bajaUntesilios

}//Fin public class CRUDMateriales
