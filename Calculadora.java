import java.util.Scanner;

public class Calculadora{
    public static void main(String[]args){

        Scanner Scanner = new
        Scanner(System.in);
        
//apresentaçao e operacoes

System.out.println("calculadora do F-LP em Java :) ");
System.out.println("Por favor, escolha a operaçao");
System.out.println("1. adicao");
System.out.println("2. subtracao");
System.out.println("3. multipicacao ");
System.out.println("4. divisao");

int escolha = Scanner.nextInt();

//lendo numeros de entrada

System.out.println("Por favor insira o primeiro numero: ");
double numero1 = Scanner.nextDouble();

System.out.println("Por favor, insira o segundo numero: ");
double numero2 = Scanner.nextDouble();

double resultado;
switch (escolha) {
    case 1:
        resultado = numero1 + numero2;
        System.out.println("resultado: " + resultado);
        break;
    case 2:
        resultado = numero1 - numero2;
        System.out.println("resultado: " + resultado);
        break;
    case 3:
        resultado = numero1 * numero2;
        System.out.println("resultado: " + resultado);
        break;
    case 4:
       if (numero2 != 0) {
        resultado = numero1 / numero2;
    System.out.println("resultado: " + resultado);   
    } 
       else {
    System.out.println("erro: divisao por zero");

       }
       break;
    default:
    System.out.println("escolha invalida ");

    Scanner.close();

        break;
}

    }
}

