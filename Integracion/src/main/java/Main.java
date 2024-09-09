public class Main {

    public static void main(String[] args) {
        System.out.println("Manejando el repositorio desde GitHub");
        System.out.println("Agregando un mensaje para ver el «Amend»");

        // ----- esPrimo -----
        int num             = 5;
        String resultado    = esPrimo(num) 
            ? "El número " + num + " es primo" 
            : "El número " + num + " NO es primo"; 
        System.out.println(resultado);
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}






