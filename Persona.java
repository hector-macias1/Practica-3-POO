public class Persona {
    //Atributos
    String nombre;
    String Curp;
    String Rfc;

    public Persona(String nombre, String Curp, String Rfc) {
        setNombre(nombre);
        setCURP(Curp);
        setRFC(Rfc);        
    }

    public Persona(){
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //////////////////////////////////////////////
    public String getCURP(){
        return Curp;
    }

    public void setCURP(String Curp) {
        this.Curp = Curp;
    }

    //////////////////////////////////////////////
    public String getRFC(){
        return Rfc;
    }

    public void setRFC(String Rfc) {
        this.Rfc = Rfc;
    }
}