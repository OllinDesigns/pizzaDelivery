public class Main {

    public static void main(String[] args) {
        int param1= 4;
        int param2= 3;
        int param3= 2;

        suma(param1, param2, param3);

        var resultado = suma(param1, param2, param3);

        System.out.println(resultado);

        Main.Coche miCoche = new Main.Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    static class Coche {
        public int puertas = 3;

        public void AgregarPuerta() {
            puertas ++;
        }
    }



}
