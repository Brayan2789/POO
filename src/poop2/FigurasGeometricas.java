package poop2;

/**
 *
 * @author brayan
 */
import java.util.Scanner;

public class FigurasGeometricas {
    public static void main(String[] args) {
        float area;
        int opcion;
        final float PI = 3.14159f;
        
        Scanner sc = new Scanner(System.in);
        
        do {            
            System.out.print("\n\n\n\tElige la opción:\n\t1. -Área de círculo\n\t2. -Área de triángulo\n\t3. -Área de cuadrado\n\t4. -Salir\n\tOpción:\t");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("\n\tSeleccionó el círculo.");
                    float radio = 15;
                    area = PI * radio * radio;
                    break;
                case 2:
                    System.out.print("\n\tSeleccionó el triángulo.");
                    float base = 8,altura = 5;
                    area = (base * altura) / 2;
                    break;
                case 3:
                    System.out.print("\n\tSeleccionó el cuadrado.");
                    float lado = 10;
                    area = lado*lado;
                    break;
                case 4:
                    System.out.print("\n\tHasta luego.");
                    continue;
                default:
                    System.out.print("\n\tSu selección no es correcta.");
                    continue;
            }
            
            System.out.print("\n\tEl área es: " + area + ".");
            
        } while (opcion != 4);
        sc.close();
    }
}
