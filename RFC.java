import java.util.Random;

public class RFC {
    String rfc;
    int n;
    char car;

    Random rand = new Random();
    
    public String generarRFC(String nombre, String paterno, String materno, String fecha){
        rfc = paterno.trim().substring(0, 2);
        rfc = rfc.concat(materno.trim().substring(0, 1));
        rfc = rfc.concat(nombre.trim().substring(0, 1));
        rfc = rfc.concat(fecha.trim().substring(6, 8));
        rfc = rfc.concat(fecha.trim().substring(3, 5));
        rfc = rfc.concat(fecha.trim().substring(0, 2));

        n = rand.nextInt(10);
        rfc = rfc.concat(Integer.toString(n).trim());

        car = (char) ('a' + rand.nextInt(26));
        rfc = rfc.concat(Character.toString(car).trim());

        n = rand.nextInt(10);
        rfc = rfc.concat(Integer.toString(n).trim());
        
        rfc = rfc.toUpperCase();

        return rfc;
    }

    public RFC(){
    }
}