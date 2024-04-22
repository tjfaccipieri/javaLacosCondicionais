package lacoscondicionais;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// importar o método Scanner, para receber entrada de dados do usuário
		Scanner leia = new Scanner(System.in);
		
		// declaração das variaveis que iremos usar no exemplo
		int numero1, numero2, opcao, resultado;
		
		//solicitar a primeira entrada de dados do usuario
		System.out.println("Por favor, ó grande usuário, digite o primeiro numero:");
		numero1 = leia.nextInt();
		
		//solicitar a segunda entrada de dados do usuario
		System.out.println("Por favor, ó grande usuário, digite o segundo numero:");
		numero2 = leia.nextInt();
		
		System.out.println("Selecione uma opção:");
        System.out.println("*** 1 - Somar os numeros ***");
        System.out.println("*** 2 - Subtrair os numeros ***");
        System.out.println("*** 3 - Multiplicar os numeros ***");
        System.out.println("*** 4 - Dividir o primeiro pelo segundo ***");

        //solicitar a escolha da opção
        opcao = leia.nextInt();
        
        
        // verificar qual opção foi selecionada, e direcionar para o caso especifico
        switch(opcao) {
        	case 1:
        		resultado = numero1 + numero2;
        		System.out.println("O resultado da soma é: " + resultado);
        		// sempre dar um BREAK, para finalizar a execução do código
        		break;
    		
        	case 2:
        		if(numero1 > numero2) {
        			resultado = numero1 - numero2;
        			System.out.println("O resultado da subtração de N1 - N2 é: " + resultado);
        		} else {
        			resultado = numero2 - numero1;
        			System.out.println("O resultado da subtração de N2 - N1 é: " + resultado);
        		}
        		break;
        		
        	case 3:
        		resultado = numero1 * numero2;
        		if(resultado % 2 == 0) {
        			System.out.println("O resultado da multiplicação é: " + resultado + " e é um numero par");
        		} else {
        			System.out.println("O resultado da multiplicação é: " + resultado + " e é um numero impar");
        		}
        		
        	case 4:
        }
        // ao final do programa, fechar a execução do Scanner, com a linha abaixo
        leia.close();

	}

}
