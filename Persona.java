public class Persona {

    //Atributos
    String nombre;
    String aPaterno;
    String aMaterno;
    char sexo;
    String fecha;

    public Persona(String nombre, String aPaterno, String aMaterno, char sexo,  String fecha) {
        setNombre(nombre);
        setAPaterno(aPaterno);
        setAMaterno(aMaterno);
        setSexo(sexo);
        setFecha(fecha);
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //////////////////////////////////////////////
    public String getAPaterno(){
        return aPaterno;
    }

    public void setAPaterno(String aPaterno){
        this.aPaterno = aPaterno;
    }

    //////////////////////////////////////////////
    public String getAMaterno(){
        return aMaterno;
    }

    public void setAMaterno(String aMaterno){
        this.aMaterno = aMaterno;
    }

    //////////////////////////////////////////////
    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    //////////////////////////////////////////////
    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

}
