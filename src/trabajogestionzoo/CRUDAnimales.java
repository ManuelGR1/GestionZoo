package trabajogestionzoo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ManuelRamon
 */
public class CRUDAnimales {

    /*Una Tabla Hash es una estructura de datos que pretende la insercion,busqueda y borrado de elementos en tiempo constante*/
    private static final Hashtable<String, Mamiferos> MamiferosTable = new Hashtable<String, Mamiferos>();
    private static final Hashtable<String, Reptiles> ReptilesTable = new Hashtable<String, Reptiles>();
    private static final Hashtable<String, Anfibios> Anfibios = new Hashtable<String, Anfibios>();
    private static final Hashtable<String, Aves> Aves = new Hashtable<String, Aves>();

    public static void CRUDdeAnimales() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int option;
        while (!salir) {
            System.out.println("---Menu Gestion Animales---");
            System.out.println("1.-Alta de animal");
            System.out.println("2.-Editar animal");
            System.out.println("3.-Mostrar animal");
            System.out.println("4.-Baja de animal");
            System.out.println("0.-Salir de Gestion de Animales");
            System.out.println("-------------------------------");
            System.out.println("Introduce una opcion");
            try {
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("------------------------------");
                        System.out.println("Ha seleccionado alta de animal");
                        System.out.println("Selecciona que tipo de animal quieres a�adir");
                        System.out.println("1. Mamifero");
                        System.out.println("2. Reptil");
                        System.out.println("3. Anfibio");
                        System.out.println("4. Ave");
                        System.out.println("0. Para salir");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                Crearmamifero();
                                break;
                            case 2:
                                Crearreptil();
                                break;
                            case 3:
                                Crearanfibio();
                                break;
                            case 4:
                                Crearave();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("-----------------------------");
                        System.out.println("Ha seleccionado editar animal");
                        System.out.println("Seleccione el animal que desea editar:");
                        System.out.println("1. Mamifero");
                        System.out.println("2. Reptil");
                        System.out.println("3. Anfibio");
                        System.out.println("4. Ave");
                        System.out.println("Introduce una opcion");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                editarMamifero();
                                break;
                            case 2:
                                editarReptil();
                                break;
                            case 3:
                                editarAnfibio();
                                break;
                            case 4:
                                editarAve();
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("------------------------------");
                        System.out.println("Ha seleccionado mostrar animal");
                        System.out.println("Seleccione el animal que desea mostrar:");
                        System.out.println("1. Mamifero");
                        System.out.println("2. Reptil");
                        System.out.println("3. Anfibio");
                        System.out.println("4. Ave");
                        System.out.println("Introduce una opcion");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                mostrarMamiferos();
                                break;
                            case 2:
                                mostarReptil();
                                break;
                            case 3:
                                mostrarAnfibio();
                                break;
                            case 4:
                                mostrarAve();
                                break;
                        }
                        break;

                    case 4:
                        System.out.println("-----------------------------");
                        System.out.println("Ha seleccionado borrar animal");
                        System.out.println("Seleccione el animal que desea borrar:");
                        System.out.println("1. Mamifero");
                        System.out.println("2. Reptil");
                        System.out.println("3. Anfibio");
                        System.out.println("4. Ave");
                        System.out.println("Introduce una opcion");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                BajaMamifero();
                                break;
                            case 2:
                                borrarReptil();
                                break;
                            case 3:
                                borrarAnfibio();
                                break;
                            case 4:
                                borrarAve();
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("---------------------------------");
                        System.out.println("Salir de gestion de animales");
                        System.out.println("---------------------------------");
                        salir = true;
                        break;
                    default:
                        System.out.println("---------------------------------");
                        System.out.println("Solo numero entre 0 y 4");
                        System.out.println("---------------------------------");
                }
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("-----------------------------------------");
                System.out.println("Debe elegir una de las opciones mostradas");
                System.out.println("-----------------------------------------");
            }
        }
    }// fin de CRUDAnimales

    // Crear mamifero
    public static void Crearmamifero() {
        Scanner entrada = new Scanner(System.in);
        String nombreAnimal, raza, tipodecomida, tipodebebida;
        System.out.println("----------------");
        System.out.println("Introduce nombre de animal");
        nombreAnimal = entrada.next();
        System.out.println("Introduce raza");
        raza = entrada.next();
        tipodebebida = entrada.nextLine();
        System.out.println("�Tipo de comida?");
        tipodecomida = entrada.nextLine();
        System.out.println("�Tipo de bebida?");
        entrada.nextLine();
        Mamiferos m1 = new Mamiferos(nombreAnimal, raza, tipodecomida, tipodebebida);
        MamiferosTable.put(nombreAnimal, m1);
    }// Fin crear mamifero

    // Crear reptiles
    public static void Crearreptil() {
        Scanner entrada = new Scanner(System.in);
        String nombreAnimal, raza, tipodecomida, tipodebebida;
        System.out.println("----------------");
        System.out.println("Introduce nombre de animal");
        nombreAnimal = entrada.next();
        System.out.println("Introduce raza");
        raza = entrada.next();
        tipodebebida = entrada.nextLine();
        System.out.println("�Tipo de comida?");
        tipodecomida = entrada.nextLine();
        System.out.println("�Tipo de bebida?");
        entrada.nextLine();
        Reptiles r1 = new Reptiles(nombreAnimal, raza, tipodecomida, tipodebebida);
        ReptilesTable.put(nombreAnimal, r1);
    }// Fin crear reptil

    // Crear anfibio
    public static void Crearanfibio() {
        Scanner entrada = new Scanner(System.in);
        String nombreAnimal, raza, tipodecomida, tipodebebida;
        System.out.println("----------------");
        System.out.println("Introduce nombre de animal");
        nombreAnimal = entrada.next();
        System.out.println("Introduce raza");
        raza = entrada.next();
        tipodebebida = entrada.nextLine();
        System.out.println("�Tipo de comida?");
        tipodecomida = entrada.nextLine();
        System.out.println("�Tipo de bebida?");
        entrada.nextLine();
        Anfibios a1 = new Anfibios(nombreAnimal, raza, tipodecomida, tipodebebida);
        Anfibios.put(nombreAnimal, a1);

    }// Fin crear anfibio

    // Crear anfibio
    public static void Crearave() {
        Scanner entrada = new Scanner(System.in);
        String nombreAnimal, raza, tipodecomida, tipodebebida;
        System.out.println("----------------");
        System.out.println("Introduce nombre de animal");
        nombreAnimal = entrada.next();
        System.out.println("Introduce raza");
        raza = entrada.next();
        tipodebebida = entrada.nextLine();
        System.out.println("�Tipo de comida?");
        tipodecomida = entrada.nextLine();
        System.out.println("�Tipo de bebida?");
        entrada.nextLine();
        Reptiles a1 = new Reptiles(nombreAnimal, raza, tipodecomida, tipodebebida);
        ReptilesTable.put(nombreAnimal, a1);
    }

    // Inicio editar mamifero
    public static void editarMamifero() {
        String nombreAnimal, raza, tipodebebida, tipodecomida, claveaux;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce nombre de animal que desea modificar");
        claveaux = sc.nextLine();
        System.out.println("----------------");
        System.out.println("¿Que desea modificar del animal seleccionado?");
        System.out.println("1.- Modicar nombre");
        System.out.println("2.- Modicar raza");
        System.out.println("3.- Modicar tipo de comida");
        System.out.println("4.- Modicar tipo de bebida");
        System.out.println("5.- Salir");
        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Inserte el nombre: ");
                sc.nextLine();
                nombreAnimal = sc.next();
                MamiferosTable.get(claveaux).setMamifero(nombreAnimal);
                System.out.println("El nuevo nombre es:  " + nombreAnimal);
                break;
            case 2:
                System.out.println("Inserte la raza: ");
                sc.nextLine();
                raza = sc.nextLine();
                MamiferosTable.get(claveaux).setTipocomida(raza);
                System.out.println("La nueva raza es:  " + raza);
                break;
            case 3:
                System.out.println("Inserte la nueva tipo de bebida");
                sc.nextLine();
                tipodebebida = sc.nextLine();
                MamiferosTable.get(claveaux).setTipobebida(tipodebebida);
                System.out.println("La nueva bebida es: " + tipodebebida);
                break;
            case 4:
                System.out.println("Inserte tipo de comida");
                sc.nextLine();
                tipodecomida = sc.nextLine();
                MamiferosTable.get(claveaux).setTipoDeComida(tipodecomida);
                System.out.println("El nuevo tipo de comida es:  " + tipodecomida);
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }// fin de modo editar mamifero()

    // Inicio editar reptil
    public static void editarReptil() {
        String nombreAnimal, raza, tipodebebida, tipodecomida, claveaux;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce nombre de animal que desea modificar");
        claveaux = sc.nextLine();
        System.out.println("----------------");
        System.out.println("¿Que desea modificar del animal seleccionado?");
        System.out.println("1.- Modicar nombre");
        System.out.println("2.- Modicar raza");
        System.out.println("3.- Modicar tipo de comida");
        System.out.println("4.- Modicar tipo de bebida");
        System.out.println("5.- Salir");
        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Inserte el nombre: ");
                sc.nextLine();
                nombreAnimal = sc.next();
                ReptilesTable.get(claveaux).setNombreReptil(nombreAnimal);
                System.out.println("El nuevo nombre es:  " + nombreAnimal);
                break;
            case 2:
                System.out.println("Inserte la raza: ");
                sc.nextLine();
                raza = sc.nextLine();
                ReptilesTable.get(claveaux).setTipocomida(raza);
                System.out.println("La nueva raza es:  " + raza);
                break;
            case 3:
                System.out.println("Inserte la nueva tipo de bebida");
                sc.nextLine();
                tipodebebida = sc.nextLine();
                ReptilesTable.get(claveaux).setTipobebida(tipodebebida);
                System.out.println("La nueva bebida es: " + tipodebebida);
                break;
            case 4:
                System.out.println("Inserte tipo de comida");
                sc.nextLine();
                tipodecomida = sc.nextLine();
                ReptilesTable.get(claveaux).setTipoDeComida(tipodecomida);
                System.out.println("El nuevo tipo de comida es:  " + tipodecomida);
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }// fin de modo editar mamifero()

    // Inicio editar Anfibio
    public static void editarAnfibio() {
        String nombreAnimal, raza, tipodebebida, tipodecomida, claveaux;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce nombre de animal que desea modificar");
        claveaux = sc.nextLine();
        System.out.println("----------------");
        System.out.println("¿Que desea modificar del animal seleccionado?");
        System.out.println("1.- Modicar nombre");
        System.out.println("2.- Modicar raza");
        System.out.println("3.- Modicar tipo de comida");
        System.out.println("4.- Modicar tipo de bebida");
        System.out.println("5.- Salir");
        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Inserte el nombre: ");
                sc.nextLine();
                nombreAnimal = sc.next();
                Anfibios.get(claveaux).setNombreReptil(nombreAnimal);
                System.out.println("El nuevo nombre es:  " + nombreAnimal);
                break;
            case 2:
                System.out.println("Inserte la raza: ");
                sc.nextLine();
                raza = sc.nextLine();
                Anfibios.get(claveaux).setTipocomida(raza);
                System.out.println("La nueva raza es:  " + raza);
                break;
            case 3:
                System.out.println("Inserte la nueva tipo de bebida");
                sc.nextLine();
                tipodebebida = sc.nextLine();
                Anfibios.get(claveaux).setTipobebida(tipodebebida);
                System.out.println("La nueva bebida es: " + tipodebebida);
                break;
            case 4:
                System.out.println("Inserte tipo de comida");
                sc.nextLine();
                tipodecomida = sc.nextLine();
                Anfibios.get(claveaux).setTipoDeComida(tipodecomida);
                System.out.println("El nuevo tipo de comida es:  " + tipodecomida);
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }// fin de modo editar anfibio

    // Inicio editar Anfibio
    public static void editarAve() {
        String nombreAnimal, raza, tipodebebida, tipodecomida, claveaux;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce nombre de animal que desea modificar");
        claveaux = sc.nextLine();
        System.out.println("----------------");
        System.out.println("¿Que desea modificar del animal seleccionado?");
        System.out.println("1.- Modicar nombre");
        System.out.println("2.- Modicar raza");
        System.out.println("3.- Modicar tipo de comida");
        System.out.println("4.- Modicar tipo de bebida");
        System.out.println("5.- Salir");
        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Inserte el nombre: ");
                sc.nextLine();
                nombreAnimal = sc.next();
                Aves.get(claveaux).setNombreReptil(nombreAnimal);
                System.out.println("El nuevo nombre es:  " + nombreAnimal);
                break;
            case 2:
                System.out.println("Inserte la raza: ");
                sc.nextLine();
                raza = sc.nextLine();
                Aves.get(claveaux).setTipocomida(raza);
                System.out.println("La nueva raza es:  " + raza);
                break;
            case 3:
                System.out.println("Inserte la nueva tipo de bebida");
                sc.nextLine();
                tipodebebida = sc.nextLine();
                Aves.get(claveaux).setTipobebida(tipodebebida);
                System.out.println("La nueva bebida es: " + tipodebebida);
                break;
            case 4:
                System.out.println("Inserte tipo de comida");
                sc.nextLine();
                tipodecomida = sc.nextLine();
                Aves.get(claveaux).setTipoDeComida(tipodecomida);
                System.out.println("El nuevo tipo de comida es:  " + tipodecomida);
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");
        }// fin de modo editar anfibio

    }

    public static void mostrarMamiferos() {
        String NomAnimal;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce el nombre del mamifero que quieres consultar");
        NomAnimal = sc.next();

        Enumeration indice = MamiferosTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (NomAnimal.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println(MamiferosTable.get(clave));

            } else {
                System.out.println("----------------");
                System.out.println("El animal no esta registrado");
            }
        }

    }

    public static void mostarReptil() {
        String NomAnimal;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce el nombre del mamifero que quieres consultar");
        NomAnimal = sc.next();

        Enumeration indice = ReptilesTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (NomAnimal.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println(ReptilesTable.get(clave));

            } else {
                System.out.println("----------------");
                System.out.println("El animal no esta registrado");
            }
        }

    }

    // Inicio metodo Mostar anfibio
    public static void mostrarAnfibio() {
        String NomAnimal;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce el nombre de animal que quieres consultar");
        NomAnimal = sc.next();

        Enumeration indice = Anfibios.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (NomAnimal.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println(Anfibios.get(clave));

            } else {
                System.out.println("----------------");
                System.out.println("El animal no está registrado");
            }
        }

    }
    // fin metodo Mostar anfibio

    // inicio metodo Mostar AVe
    public static void mostrarAve() {
        String NomAnimal;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce el nombre de animal que quieres consultar");
        NomAnimal = sc.next();

        Enumeration indice = Aves.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (NomAnimal.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println(Aves.get(clave));

            } else {
                System.out.println("----------------");
                System.out.println("El animal no está registrado");
            }
        }

    }

    // fin metodo Mostar AVe
    public static void BajaMamifero() {
        String NomAnimal;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce el nombre de mamifero que quieres dar de baja");
        NomAnimal = sc.next();

        Enumeration indice = MamiferosTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (NomAnimal.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println("El mamifero " + clave + " ha sido eliminado del sistema");
                MamiferosTable.remove(clave);
            } else {
                System.out.println("----------------");
                System.out.println("El mamifero no esta registrado");
            }
        }
    }	//borrar borrar mamifero

    //inicio borrar Reptil
    public static void borrarReptil() {
        String NomAnimal;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce el nombre de reptil que quieres dar de baja");
        NomAnimal = sc.next();

        Enumeration indice = ReptilesTable.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (NomAnimal.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println("El reptil " + clave + " ha sido eliminado del sistema");
                ReptilesTable.remove(clave);
            } else {
                System.out.println("----------------");
                System.out.println("El reptil no esta registrado");
            }
        }
    }//fin borrar Reptil

    public static void borrarAnfibio() {
        String NomAnimal;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce el nombre de reptil que quieres dar de baja");
        NomAnimal = sc.next();

        Enumeration indice = Anfibios.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (NomAnimal.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println("El reptil " + clave + " ha sido eliminado del sistema");
                Anfibios.remove(clave);
            } else {
                System.out.println("----------------");
                System.out.println("El reptil no esta registrado");
            }
        }
    }//fin borrar Reptil

    //inicio borrar Ave
    public static void borrarAve() {
        String NomAnimal;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Introduce el nombre de reptil que quieres dar de baja");
        NomAnimal = sc.next();

        Enumeration indice = Aves.keys();
        Object clave;
        while (indice.hasMoreElements()) {
            clave = indice.nextElement();
            if (NomAnimal.equalsIgnoreCase((String) clave)) {
                System.out.println("----------------");
                System.out.println("El reptil " + clave + " ha sido eliminado del sistema");
                Aves.remove(clave);
            } else {
                System.out.println("----------------");
                System.out.println("El reptil no esta registrado");
            }
        }
    }//fin borrar Ave

}// fin de clase
