package com.mycompany.openbootcamp;

public class EjercicioTema8 {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
        persona.setNombre("Steve");
        persona.setEdad(25);
        persona.setTelefono(12345678);
        
        System.out.println("Datos del usuario: " + persona.getNombre() + ", Edad: " 
                + persona.getEdad() + ", Teléfono: " + persona.getTelefono());
        
    }


}

class Persona{
    private String nombre;
    private int edad;
    private int telefono;
    
    public void setNombre( String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
}

