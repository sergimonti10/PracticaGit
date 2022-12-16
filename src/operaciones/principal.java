package operaciones;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b, opcion, suma, resta, multiplicacion;
		float division;
		
		do {
			System.out.println("\tMENU");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			
			System.out.print("\nIntroduzca opción: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1: System.out.print("Introduce un número: ");
			a = entrada.nextInt();
			
			System.out.print("Introduce un número: ");
			b = entrada.nextInt();
			
			suma = a + b;
			
			break;
			
			case 2: System.out.print("Introduce un número: ");
			a = entrada.nextInt();
			
			System.out.print("Introduce un número: ");
			b = entrada.nextInt();
			
			resta = a - b;
			
			break;
			
			case 3: System.out.print("Introduce un número: ");
			a = entrada.nextInt();
			
			System.out.print("Introduce un número: ");
			b = entrada.nextInt();
			
			multiplicacion = a * b;
			
			break;
			
			case 4: System.out.print("Introduce un número: ");
			a = entrada.nextInt();
			
			System.out.print("Introduce un número: ");
			b = entrada.nextInt();
			
			division = a / b;
			
			break;
			
			case 0: break;
			}
			
		}while (opcion != 0);
		
		System.out.println("commit 1");

	}

}
