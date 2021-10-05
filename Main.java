import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char opcion = 's';
        String nombre;
        String aPaterno;
        String aMaterno;
        char sexo;
        String fecha;

        String entidad;

        Scanner sc = new Scanner(System.in);

        Persona persona = new Persona();
        CURP curp = new CURP();
        RFC rfc = new RFC();


        while (opcion != 'n' || opcion != 'N') {
            System.out.println("\nIngrese su nombre: ");
            nombre = sc.nextLine();
            System.out.println("\nIngrese su apellido paterno: ");
            aPaterno = sc.nextLine();
            System.out.println("\nIngrese su apellido materno: ");
            aMaterno = sc.nextLine();
            System.out.println("\nIngrese su sexo(h/m): ");
            sexo = sc.next();
            System.out.println("\nIngrese su fecha de nacimiento (dd/mm/aa): ");
            fecha = sc.nextLine();
            System.out.println("\nIngrese su estado de nacimiento(ej: BC).");
            System.out.println("Si usted nacio en el extranjero, por favor introduzca NE: ");
            entidad = sc.nextLine();

            persona = new Persona(nombre, aPaterno, aMaterno, sexo, fecha);
            curp.generarCURP(nombre, aPaterno, aMaterno, sexo, entidad, fecha);
            rfc.generarRFC(nombre, aPaterno, aMaterno, fecha);

            System.out.println("\n¿Desea generar otra vez?(s/n): ");
            opcion = sc.next();
            
        }





    }
    
}
