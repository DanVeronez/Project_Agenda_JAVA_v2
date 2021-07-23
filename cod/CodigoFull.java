package nome;

import java.util.Scanner;

public class recebeNome {
	
	public static void receber() {
		
		Scanner in = new Scanner(System.in);
		String[] nome= new String[50]; 
		String[] sobrenome = new String[50]; 
		String[] telefone = new String[50];
		String[] nome2= new String[50]; 
		String[] sobrenome2 = new String[50]; 
		String[] telefone2 = new String[50];
		int op, i = 0;	
		
		op = in.nextInt();
		
		while(op != 0) {
			
		if(op == 1) {
			System.out.println("Insira o nome que deseja adicionar");
			nome[i] = in.next();
			System.out.println("Insira o sobrenome que deseja adicionar");
			sobrenome[i] = in.next();
			System.out.println("Insira o numero do telefone que deseja adicionar");
			telefone[i] = in.next();
			i++;
		}
		if(op == 2) {	
			int j, cod;
			for(j = 0;j < i;j++ ) {
				System.out.println("Os usuario cadastrados são:"+ j + "Nome:" + nome[j] + " " + "Sobrenome:" + sobrenome[j] + " " + "Telefone:" + telefone[j]);
			}
			System.out.println("Insira o codigo do usuario desejado");
			cod = in.nextInt();	
			
				System.out.println("Insira o nome que deseja adicionar");
				nome[cod] = in.next();
				System.out.println("Insira o sobrenome que deseja adicionar");
				sobrenome[cod] = in.next();
				System.out.println("Insira o numero do telefone que deseja adicionar");
				telefone[cod] = in.next();
			}
			
		if(op == 3) {
			int j, cod;
			for(j = 0;j < i;j++ ) {
				if(nome[j] != " ")
				System.out.println("Os usuario cadastrados são:"+ j + "Nome:" + nome[j] + " " + "Sobrenome:" + sobrenome[j] + " " + "Telefone:" + telefone[j]);
			}
			 
				System.out.println("Insira o codigo do usuario desejado");
				cod = in.nextInt();	
			
				nome[cod] = " ";
				sobrenome[cod] = " ";
				telefone[cod] = " ";	
				
				System.out.println("-----------USUARIO EXCLUIDO-----------");
				
			/*
				for(j = 0;j <= i;j++) {
					if(nome[j] != " ") {
						nome2[j] = nome[j];
						sobrenome2[j] = sobrenome[j];
						telefone2[j] = telefone[j];
						
					}
					
					for(j = 0;j < i;j++ ) {
						System.out.println("Os usuario cadastrados são:"+ "Nome:" + nome2[j] + " " + "Sobrenome:" + sobrenome2[j] + " " + "Telefone:" + telefone2[j]);
					 	}
				}*/
				
				}
		
		if(op == 4) {
			int j = 0;
			for(j = 0;j < i;j++ ) {
				if(nome[j] != " ")
				System.out.println("Os usuario cadastrados são:"+ "Nome:" + nome[j] + " " + "Sobrenome:" + sobrenome[j] + " " + "Telefone:" + telefone[j]);
			 	}
		   	}		
	
			System.out.println("Digite qual opção desejada:");
			System.out.println(" 1 - Adicionar usuario na agenda:");
			System.out.println(" 2 - Editar usuario da agenda:");
			System.out.println(" 3 - Remover usuario da agenda:");
			System.out.println(" 4 - Lista todos usuarios cadastrados:");
			System.out.println(" 0 - Finalizar agenda...");
			op = in.nextInt();			
			}
		System.out.println("-----------SIMULAÇÃO ENCERRADA-----------");
		}	
	}

