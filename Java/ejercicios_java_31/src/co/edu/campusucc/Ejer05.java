package co.edu.campusucc;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		int l1,l2;
		boolean bool1=false,bool2=false,k;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.print("�La tierra es un satelite? [0]...Falso [1]...Verdad ");
			l1=leer.nextInt();
			System.out.print("�Azul es una obra literaria de Ruben Dario? [0]...Falso [1]...Verdad ");
			l2=leer.nextInt();
		}
		
		if (l1!=0) bool1=true;
		if (l2!=0) bool2=true;
		k= bool1 && bool2;
		
			System.out.print("El valor de la variable K es: "+k);
	}
}
