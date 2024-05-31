package modelo;

public class claseViajero{
    private Integer Numero;
    private String Dni;
    private String Nombre;
    private String Apellido;
    private Integer Millas;


    public claseViajero(Integer Numero, String Dni, String Nombre, String Apellido, Integer Millas){
        this.Numero=Numero;
        this.Dni=Dni;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Millas=Millas;
    }

    public Integer getNumero(){
        return Numero;
    }

    public String getNombre(){
        return Nombre;
    }   

    public String getApellido(){
        return Apellido;
    }
      
     public String getDni(){
        return Dni;
    }

    public Integer getMillas(){
        return Millas;
    }
    
    public void agregarMillas(Integer Millas){
        this.Millas+= Millas;
    }
    
    public void canjearMillas(Integer Millas){
        this.Millas-= Millas;
    }
    
    @Override
    public String toString() {
        return "claseViajero{" +
                "Numero=" + Numero +
                ", Dni='" + Dni + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Millas=" + Millas +
                '}';
    }
}



