public class ProgramaArgumentos04 {
  public static void main(String[] args) {
   System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
   System.out.println("-Autor: Cristian Andres Osorio Vernaza +");               
   System.out.println("+                                      -");
   System.out.println("-        INGENIERIA EN SISTEMAS        +");
   System.out.println("+                                      -");
   System.out.println("-      Date: October 17st of 2020      +");
   System.out.println("+                                      -");
   System.out.println("-      Universidad Cooperativa de      +");
   System.out.println("+               colombia               -");
   System.out.println("-                                      +");
   System.out.println("+                 2020                 -");
   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
   System.out.println("+                                      -");
   System.out.println("-       Programa Argumentos 04:        +");
   System.out.println("+        Division de enteros           -");
   System.out.println("-                                      +"); 
   System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
   System.out.println();
   
   System.out.println("argumento1 = "+args[0]);
   System.out.println("argumento2 = "+args[1]);
   
   int num1 = Integer.parseInt(args[0]);
   int num2 = Integer.parseInt(args[1]);
   int resultadoDivision = num1 / num2; 
   
   System.out.println("Operacion Matematica: num1 = "+num1+", num2 = "+num2);
   System.out.println("DIVISION num1 / num2 = "+resultadoDivision);
  }
}

