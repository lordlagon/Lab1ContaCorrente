/* Autor: André Xavier
 * Projeto: Laboratório 1
 */

package view;

import java.util.Scanner;

public class Lab01Sistema {
	
		static Scanner entrada = new Scanner(System.in);

		public static void main(String[] args) {
		
			menu();
		}
		
		public static void menu() {

			    System.out.println("|1 - Cadastramento            |");
				System.out.println("|2 - Saque                    |");
				System.out.println("|3 - Deposito                 |");
				System.out.println("|9 - Fim                      |");
				
				
				int numMenu;
				System.out.println("Digite o numero da função: ");
				numMenu = entrada.nextInt();
				switch (numMenu) {
					 case 1 :
						 execCadastramento();
						 break;
					 case 2:
						 execSaque();
	 
						 break;
					 case 3:
						 execDeposito();
						 
						 break;
					 case 9:
						 System.out.println("!Fim!\n");
						 break;
					  default:
						 System.out.println("\n!Numero Incorreto!");
						 menu();
				
			}
			}
		 		
		public static void execCadastramento(){
			
			int numAgencia;
			int numConta;
			String nomeCliente;
			double saldoConta; 
									
					 System.out.println("Digite o número da Agencia: ");
				     numAgencia=entrada.nextInt();
				     System.out.println("Digite o número da Conta: ");
				     numConta=entrada.nextInt();
				     System.out.println("Digite o Nome do Cliente: ");
				     nomeCliente=entrada.next();
				     System.out.println("Digite o Saldo Inicial: ");
				     saldoConta=entrada.nextDouble();
				     
				     System.out.println("\nNumero da Agencia : "+ numAgencia);
				     System.out.println("Numero da Conta   : "+ numConta);
				     System.out.println("Nome do Cliente   : "+ nomeCliente);
				     System.out.println("Saldo             : "+ saldoConta+" \n");
				     
				     System.out.println("Confirma cadastramento (S/N): ");
								
				     String confirma = entrada.next();
				     
				     if (confirma.equals("S")||confirma.equals("s")){
				    
				    	System.out.println("Cadastramento Realizado \n");
				    	 
				     }else{
				    	 System.out.println("Cadastramento Cancelado \n");
				     
			    	 }	
				     
				     menu();
				     
					}
				     
public static void execSaque(){
			
			int numAgencia;
			int numConta;
			double saqueConta; 
									
					 System.out.println("Digite o número da Agencia: ");
				     numAgencia=entrada.nextInt();
				     System.out.println("Digite o número da Conta: ");
				     numConta=entrada.nextInt();
				     System.out.println("Digite o Valor do Saque: ");
				     saqueConta=entrada.nextDouble();
				     
				     System.out.println("Numero da Agencia : "+ numAgencia);
				     System.out.println("Numero da Conta   : "+ numConta);
				     System.out.println("Valor do Saque    : "+ saqueConta+" \n");
				     
				     System.out.println("Confirma o Saque (S/N): ");
								
				     String confirma = entrada.next();
				     
				     if (confirma.equals("S")||confirma.equals("s")){
				    
				    	System.out.println("Saque Realizado \n");
				    	 
				     }else{
				    	 System.out.println("Saque Cancelado \n");
				     
			    	 }	
				     
				     menu();
				     
					}

public static void execDeposito(){
	
	int numAgencia;
	int numConta;
	double depositoConta; 
							
			 System.out.println("Digite o número da Agencia: ");
		     numAgencia=entrada.nextInt();
		     System.out.println("Digite o número da Conta: ");
		     numConta=entrada.nextInt();
		     System.out.println("Digite o Valor do Deposito: ");
		     depositoConta=entrada.nextDouble();
		     
		     System.out.println("Numero da Agencia : "+ numAgencia);
		     System.out.println("Numero da Conta   : "+ numConta);
		     System.out.println("Valor do Deposito    : "+ depositoConta+" \n");
		     
		     System.out.println("Confirma o Deposito (S/N): ");
						
		     String confirma = entrada.next();
		     
		     if (confirma.equals("S")||confirma.equals("s")){
		    
		    	System.out.println("Deposito Realizado \n");
		    	 
		     }else{
		    	 System.out.println("Deposito Cancelado \n");
		     
	    	 }	
		     
		     menu();
		     
			}			
			
			
}