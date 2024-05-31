package ejercicio1;

public class Viajero{
    private Integer Numero;
    private String Dni;
    private String Nombre;
    private String Apellido;
    private Integer Millas;


    public Viajero(Integer Numero, String Dni, String Nombre, String Apellido, Integer Millas){
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
}

