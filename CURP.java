import java.util.Random;

public class CURP {
    String curp;
    char consonante;
    int n = 0;

    Random rand = new Random();

    public String generarCURP(String nombre, String paterno, String materno, char sexo, String entidad, String fecha) {
        curp = paterno.trim().substring(0, 2);
        curp = curp.concat(materno.trim().substring(0, 1));
        curp = curp.concat(nombre.trim().substring(0, 1));
        curp = curp.concat(fecha.trim().substring(6, 8));
        curp = curp.concat(fecha.trim().substring(3, 5));
        curp = curp.concat(fecha.trim().substring(0, 2));
        curp = curp.concat(Character.toString(sexo));
        curp = curp.concat(entidad);

        for(int i = 1; i < paterno.length(); i++){
            consonante = paterno.charAt(i);
            if((consonante != 97) && (consonante != 111) && (consonante != 101) && (consonante != 105) && (consonante != 117)) {
                //consonante
                curp = curp.concat(Character.toString(consonante)); 
                break;
            }

        }

        for(int i = 1; i < materno.length(); i++) {
            consonante = materno.charAt(i);
            if((consonante != 97) && (consonante != 111) && (consonante != 101) && (consonante != 105) && (consonante != 117)) {
                //consonante
                curp = curp.concat(Character.toString(consonante));
                break; 
            }
        }

        for(int i = 1; i < nombre.length(); i++) {
            consonante = nombre.charAt(i);
            if((consonante != 97) && (consonante != 111) && (consonante != 101) && (consonante != 105) && (consonante != 117)) {
                //consonante
                curp = curp.concat(Character.toString(consonante));
                break; 
            }
        }

        n = rand.nextInt(10);
        curp = curp.concat(Integer.toString(n).trim());

        n = rand.nextInt(10);
        curp = curp.concat(Integer.toString(n).trim());

        curp = curp.toUpperCase();

        return curp;
    }

    public CURP(){
    }
}