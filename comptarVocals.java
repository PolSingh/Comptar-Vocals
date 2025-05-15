
import java.util.Scanner;

public class ComptarVocals {
    public static void main(String[] args) {
        // Crear l'objecte per llegir dades del teclat
        Scanner teclat = new Scanner(System.in);

        // Demanar a l'usuari una frase
        System.out.print("Introdueix un text: ");
        String frase = teclat.nextLine().toLowerCase();

        // Tancar el lector (per bones pràctiques)
        teclat.close();

        // Comptadors de vocals
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        // Recórrer cada lletra de la frase
        for (int j = 0; j < frase.length(); j++) {
            char lletra = frase.charAt(j);

            // Comprovar si és una vocal (amb o sense accent)
            if (lletra == 'a' || lletra == 'à' || lletra == 'á') a++;
            else if (lletra == 'e' || lletra == 'è' || lletra == 'é') e++;
            else if (lletra == 'i' || lletra == 'í' || lletra == 'ï') i++;
            else if (lletra == 'o' || lletra == 'ò' || lletra == 'ó') o++;
            else if (lletra == 'u' || lletra == 'ú' || lletra == 'ü') u++;
        }

        // Mostrar els resultats per pantalla
        System.out.println("Vocals trobades:");
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);
        System.out.println("Total: " + (a + e + i + o + u));
    }
}
