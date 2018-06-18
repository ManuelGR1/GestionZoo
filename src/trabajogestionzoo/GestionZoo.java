package trabajogestionzoo;

/**
 *
 * @author ManuelRamon
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import static trabajogestionzoo.CRUDAnimales.CRUDdeAnimales;
import static trabajogestionzoo.CRUDMateriales.CRUDdeMateriales;
import static trabajogestionzoo.CRUDPersonal.CRUDdePersonas;

/**
 *
 * @author ManuelRamón
 */
public class GestionZoo { //Clase padre de la que heredan el resto de clases,

    // Atributos
    private String nombre;

    //Constructor
    public GestionZoo(String nombre) {
        this.nombre = nombre;
    }

    //Getters & Stters + encapsulacion
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ToString
    @Override
    public String toString() {
        return "GestionZoo{" + "nombre=" + nombre + '}';
    }

    //Menu de gestion de zoo
    public void MenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false; //Para capturar excepciones
        int option;
        while (!salir) {
            System.out.println("      ---- ZOO JAVA ---- ");
            System.out.println("Selecione el area al que quiere entrar");
            System.out.println("1.Gestion Animal");
            System.out.println("2.Gestion Personal");
            System.out.println("3.Gestion Material");
            System.out.println("0.Salir del programa");
            System.out.println("Intro opcion");
            try {
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("Ha selecionado Gestion Animal");
                        CRUDdeAnimales();
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.println("---Ha selecionado Gestion Personal---");
                        System.out.println(" ");
                        CRUDdePersonas();
                        break;
                    case 3:
                        System.out.println(" ");
                        System.out.println("Ha selecionado Gestion Material");
                        System.out.println(" ");
                        CRUDdeMateriales();
                        break;
                    case 0:
                        System.out.println(" ");
                        System.out.println("salimos del programa");
                        salir = true;
                        break;
                    default:
                        System.out.println("------------------------");
                        System.out.println("Solo números entre 1 y 3");
                        System.out.println("------------------------");
                }
            } catch (InputMismatchException e) {//esta excepción salta cuando no lo introducido no se puede convertir a numero.
                sc.next(); //Ponemos sc.next() para evitar que entre en un bucle infinito, solo si se usa Scanner.
                System.out.println("---------------------------------------------------------");
                System.out.println("Debe elegir una de las opciones mostradas(valor numerico)");
                System.out.println("---Le muestro nuevamente el menu---");
                System.out.println(" ");
            }
        }
    }

}//Fin class GestionZoo
