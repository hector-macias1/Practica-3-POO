import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char opcion = 's';
        String nombre;
        String aPaterno;
        String aMaterno;
        char sexo;
        String fecha;
        String Curp;
        String Rfc;
        String entidad;

        Scanner sc = new Scanner(System.in);

        CURP curp = new CURP();
        RFC rfc = new RFC();


        while (opcion == 's' || opcion == 'S') {
            System.out.println("\nIngrese su nombre: ");
            nombre = sc.nextLine();
            System.out.println("\nIngrese su apellido paterno: ");
            aPaterno = sc.nextLine();
            System.out.println("\nIngrese su apellido materno: ");
            aMaterno = sc.nextLine();
            System.out.println("\nIngrese su sexo(h/m): ");
            sexo = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("\nIngrese su fecha de nacimiento (dd/mm/aa): ");
            fecha = sc.nextLine();
            System.out.println("\nIngrese su estado de nacimiento(ej: BC).");
            System.out.println("Si usted nacio en el extranjero, introduzca NE: ");
            entidad = sc.nextLine();

            Curp = curp.generarCURP(nombre, aPaterno, aMaterno, sexo, entidad, fecha);
            Rfc = rfc.generarRFC(nombre, aPaterno, aMaterno, fecha);

            //Creacion de objetos
            Persona obj1 = new Persona(nombre, Curp, "");
            Persona obj2 = new Persona(nombre, "", Rfc);
            Persona obj3 = new Persona(nombre, Curp, Rfc);

            //Impresion de datos
            System.out.println("\nDatos Generados: ");

            System.out.println("\nObjeto 1");
            System.out.println("Nombre: " + obj1.getNombre());
            System.out.println("Curp: " + obj1.getCURP());
            System.out.println("Rfc: " + obj1.getRFC());

            System.out.println("\nObjeto 2");
            System.out.println("Nombre: " + obj2.getNombre());
            System.out.println("Curp: " + obj2.getCURP());
            System.out.println("Rfc: " + obj2.getRFC());

            System.out.println("\nObjeto 3");
            System.out.println("Nombre: " + obj3.getNombre());
            System.out.println("Curp: " + obj3.getCURP());
            System.out.println("Rfc: " + obj3.getRFC());

            System.out.println("\n¿Desea generar otra vez?(s/n): ");
            opcion = sc.next().charAt(0);
            
        }

    }
    
}