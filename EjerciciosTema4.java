package com.mycompany.openbootcamp;


public class EjerciciosTema4 {

    public static void main(String[] args) {
       
        //EJERCICIO BUCLE IF
        System.out.println("IF _________________________________________________");
        int i = -1;
        
        if( i == 0){
            System.out.println("El número es " + i);
        }else if(i < 0){
            System.out.println("El número es Negativo");
        }else if (i > 0){
            System.out.println("El número es ,positivo");
        }else{
            System.out.println("Ingresa otra opción");
        }
        
        // EJERCICIO BUCLE WHILE
        System.out.println("WHILE _____________________________________________");
        int j = 0;
        
        while( j <= 3 ){
            System.out.println(j);
            j++;
        }
        
        // EJERCICIO BUCLE DO WHILE
        System.out.println("DO WHILE __________________________________________");
        
        int k = 0;
        do{
            System.out.println(k);
            k++;
        }while(k < 3);
        
        //EJERCICIO BUCLE FOR
        System.out.println("FOR _______________________________________________");
        
        for(int l = 0; l <= 3; l++){
            System.out.println(l);
        }
        
        //EJERCICIO BUCLE SWITCH
        System.out.println("SWITCH ____________________________________________");
        
        int estacion = 1;
        
        switch(estacion){
            case 1:
                System.out.println("Es Primaver");
                break;
            case 2:
                System.out.println("Es Verano");
                break;
            case 3:
                System.out.println("Es Otoño");
                break;
            case 4:
                System.out.println("Es Invierno");
                break;
            default:      
                System.out.println("La estación no existe");
        }
        
    }
}
