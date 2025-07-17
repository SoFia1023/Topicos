import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("nombre.txt");
            writer.write(nombre);
            writer.close();
            System.out.println("Nombre guardado exitosamente en 'nombre.txt'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
