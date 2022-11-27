package tp2;

import domain.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcular {
	
	static String operacao;
	static float num1;
	static float num2;
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		Scanner input = new Scanner(System.in);

		
		try {
			System.out.print("Informe o primeiro numero: ");
			num1 = input.nextFloat();
			calculadora.setNum1(num1);
			System.out.print("Informe o segundo numero: ");
			num2 = input.nextFloat();
			calculadora.setNum2(num2);
			
		} catch(InputMismatchException e) {
			System.out.println("[ERRO] É necessário informar um número!");
			input.close();
			return;
		}
		
		System.out.print("Selecione a operação desejada:\r\n"
						+ "[+] - Somar\r\n"
						+ "[-] - Subtrair\r\n"
						+ "[*] - Multiplicar\r\n"
						+ "[/] - Dividir\r\n"
						+ "[A] - Todas\r\n"
						+ "Opção: "
				);
		operacao = input.next();
		
		System.out.println("Resultado: ");
		
		switch(operacao.toUpperCase()) {
		case "+":
			imprimir(calculadora.somar());
			break;
		case "-":
			imprimir(calculadora.somar());
			break;
		case "*":
			imprimir(calculadora.somar());
			break;
		case "/":
			imprimir(calculadora.somar());
			break;
		case "A":
			imprimir(calculadora.somar(), "+");
			imprimir(calculadora.subtrair(), "-");
			imprimir(calculadora.multiplicar(), "*");
			imprimir(calculadora.dividir(), "/");
			break;
		default:
			System.out.println("Operação invalida!");
		}
		
		input.close();

	}
	
	
	public static void imprimir(float result) {
		System.out.println("%.2f %s %.2f = %.2f".formatted(num1, operacao, num2, result));  
	}
	
	public static void imprimir(float result, String operacao) {
		System.out.println("%.2f %s %.2f = %.2f".formatted(num1, operacao, num2, result));  
	}


}
