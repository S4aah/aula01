package aula01;

import java.util.Scanner;

public class Lendodadoss {

	public static void main(String[] args) {
		
        System.out.println("PROGRAMA EDUCADO");
        System.out.println("Por favor, digite o seu nome:");
        
        Scanner leitor = new Scanner(System.in);    
        String nome;
        nome = leitor.next();
       
      System.out.println (nome);
       leitor.close();
	}

}
