package modelo;

import java.util.List;
import java.util.ArrayList;


public class manejadorViajero {
    private List<claseViajero> gestorViajero;
    
    public manejadorViajero() {
        gestorViajero = new ArrayList<>();  
    }
    
    public void agregarViajero(claseViajero viajero) {
        gestorViajero.add(viajero);
    }
    
    public void muestraNum(Integer num){
        int i=0;
        while(i<gestorViajero.size() && gestorViajero.get(i).getNumero()!= num){
            i++;
        }
            if (i<gestorViajero.size()){
                System.out.println(gestorViajero.get(i));
              
            }else{
                System.out.println("No se encontro");
            }
        
        /*for (claseViajero viajero : gestorViajero){
            if (viajero.getNumero().equals(num)){
                System.out.println(viajero);
            }else{
                System.out.println("No se encontro");
            }   
        }*/

    }
    
    public void muestraMillaDni(String Dni){
        int i=0;
        while(i<gestorViajero.size() && gestorViajero.get(i).getDni()!= Dni){
            i++;
        }
            if (i<gestorViajero.size()){
                System.out.println(gestorViajero.get(i).getMillas());
              
            }else{
                System.out.println("No se encontro");
            }
    }
        
    public void acumulaMillas(String Dni,Integer Millas){
        int i=0;
        while(i<gestorViajero.size() && gestorViajero.get(i).getDni()!= Dni){
            i++;
        }
            if (i<gestorViajero.size()){
                gestorViajero.get(i).agregarMillas(Millas);
              
            }else{
                System.out.println("No se encontro");
            }

        }
    public void canjearMillas(String Dni,Integer Millas){
        int i=0;
        while(i<gestorViajero.size() && gestorViajero.get(i).getDni()!= Dni){
            i++;
        }
            if (i<gestorViajero.size()){
                gestorViajero.get(i).canjearMillas(Millas);
              
            }else{
                System.out.println("No se encontro");
            }

        }
    
    public void muestraMayorMillas(){
        int mayor=0;
        claseViajero max=null;
        for (claseViajero viajero:gestorViajero){
            if(viajero.getMillas()>mayor){
                mayor=viajero.getMillas();
                max= viajero;
            }
        }
        
        System.out.println(max);
    }
        
     
        
}
