public class EjerciciosTema3 {


    public static void main(String[] args) {
        //Primera Parte:
        int resultado = suma(20,50,40);
        System.out.println("Primera parte: El resultado de la suma de tes cantidades es = " + resultado);

        //Segunda Parte:
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Segunda parte: La cantidad de puertas del auto son = " + miCoche.puertas);
    }

    //Segunda puerta:
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

// Segunda Parte:
class Coche{
    public int puertas=4;

    public void incrementarPuertas() {
        this.puertas++;
    }
}
