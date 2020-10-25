import java.util.Scanner;
public class ProgramaMatematico01 

{
	
	public static void main (String[]args){
		Scanner leer = new Scanner (System.in);
		System.out.print("Ingrese un valor: ");
		int cifra = leer.nextInt();
		System.out.print("\nbinario: \t");
		binario(cifra);
		System.out.print("\nhexadecimal: \t");
		hexadecimal(cifra);
	}
	//Transformar a Binario
	public static void binario(int N){
		if(N==1) System.out.print("1");
		else{
			binario(N/2);
			System.out.print(N%2);
		}
	}
	//Transformar a Hexadecimal
	public static void hexadecimal(int N){
		if (N<16){
			if (N==10) System.out.print("N");
			if (N==11) System.out.print("O");
			if (N==12) System.out.print("P");
			if (N==13) System.out.print("Q");
			if (N==14) System.out.print("R");
			if (N==15) System.out.print("S");
			if (N<10) System.out.print(N);
		}
	}
}

