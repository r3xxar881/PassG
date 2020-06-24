
//PassG_v1 By r3xx.


/*Genera contraseñas de X digitos, con todo 
  el alfabeto y todos los numero del 0 al 9, 
  el tiempo de espera para generar la contraseña 
  depende de tu poder de computo*/


package Pass_Gen;

import java.util.Random; //Libreria Random.
import java.util.Scanner;

public class PassG_v2
	{
		
		public static void generador(int x) //Todo el codigo que genera la cadena o contraseña esta en una funcion la cual es llamada mas tarde teniendo en cuenta la cantidad de digitos que quiere el usuario en su contraseña mayores a 8.
			{
				
				//Se crea la cadena que contendrá los caracteres que queremos para la contraseña:
				String elemento = "abcdefghijklmn\u00f1opqrstuvwxyzABCDEFGHIJKLMN\u00d1OPQRSTUVWXYZ0123456789";
				
				Random aleatorio = new Random(); //Creamos un objeto de la clase "Random".
				
				String pass = ""; //Hacemos una nueva cadena vacia que contendrá a los caracteres concatenados (Osea, la contraseña).
				
				
				//Siclo for que realiza x veces una concatenacion de caracteres al azar que los toma segun la posicion con respecto al numero random que generamos.
				for(int i = 0; i < x; i++)
					{
						int num = aleatorio.nextInt(elemento.length()); //el elemento de tipo Random genera un numero de entre 0 y 64, sin contar el 65.
				
						char caract = elemento.charAt(num); //se toma el caracter ubicado en la posicion del numero generado al azar.
				
						pass += caract; //concatenamos los caracteres.
					}
			
				System.out.println("\nContrase\u00f1a generada!: " + pass); //Imprimimos en pantalla la contraseña.
			
			}
		
		
		
		public static void main(String args[])
			{
				
				Scanner in_Int = new Scanner(System.in);
				int cantDigitos = 0;
				
				
				
				System.out.println("\n");
				System.out.println("?88,.d88b, d888b8b   .d888b, .d888b, d888b8b");
				System.out.println("`?88'  ?88d8P' ?88   ?8b,    ?8b,   d8P' ?88");  
				System.out.println("88b  d8P88b  ,88b    `?8b    `?8b 88b  ,88b");
				System.out.println("888888P'`?88P'`88b`?888P' `?888P' `?88P'`88b");
				System.out.println("88P'                                     )88");
				System.out.println("d88                                      ,88P");
				System.out.println("?8P                                  `?8888P   By r3xx_");
				
																   // "\u00f1" = ñ en ASCII.
				System.out.println("\n*Puede usar PassG_v1 para generar contrase\u00f1as aleatorias de la cantidad de digitos que quiera.\n");
				
				
				do{
					System.out.print("-Cuantos digitos quiere en su contrase\u00f1a?: ");
					cantDigitos = in_Int.nextInt();
					
					if(cantDigitos < 8)
						{
							System.out.println("\n*La cantidad de digitos no es valida para generar una contrase\u00f1a, minimo necesita ser de 8 en adelante.");
						}
					
					/*if(cantDigitos != int)
						{
							System.out.println("\n*Porfavor ingrese un numero entero como dato valido.");  "Aun en proceso de desarrollo"
						}*/
						
				}while(cantDigitos < 8);
				
				System.out.println("*Generando...");
				generador(cantDigitos);
				
			}
	}
